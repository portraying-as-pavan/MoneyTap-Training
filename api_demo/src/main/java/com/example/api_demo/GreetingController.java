package com.example.api_demo;


import com.example.entity.Greeting;
import com.example.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template="Hello, %s!";
    private final AtomicLong counter=new AtomicLong();


    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(value = "/person")
    public Person person(){
        return new Person("Pavan","Guguloth",22);
    }

    @RequestMapping(value = "/persons")
    public List<Person> personList(){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Pavan","Guguloth",22));
        personList.add(new Person("Albert","Ram",23));
        return personList;
    }




    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value="name",defaultValue = "World") String name,
            @RequestParam(value="lastname") String lastname){
        return new Greeting(counter.incrementAndGet(),String.format(template,name+" "+lastname));
    }
}
