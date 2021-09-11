package com.moneytap.springjwtdemo;

import com.moneytap.model.JwtRequest;
import com.moneytap.model.JwtResponse;
import com.moneytap.service.MyUserDeatilsService;
import com.moneytap.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
   private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDeatilsService myUserDeatilsService;
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUserName(),
                            jwtRequest.getPassword()
                    )
            );
        }catch (BadCredentialsException e){
            throw new Exception("Bad Credentials");
        }
        final UserDetails userDetails= myUserDeatilsService.loadUserByUsername(
                jwtRequest.getUserName()
        );
        final String token=jwtUtil.generateToken(userDetails);

        return new JwtResponse(token);
    }
}
