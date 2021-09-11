package com.moneytap.ratingdataservice.controller;

import com.moneytap.ratingdataservice.model.Rating;
import com.moneytap.ratingdataservice.model.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/rating")
public class RatingController {
    private static HashMap<Integer,UserRating> userToRatingsMap;
    private static  List<Rating> ratings ;
    static {
        ratings=new ArrayList<>();
        ratings.add(new Rating(1001, 4));
        ratings.add(new Rating(1002, 5));
        UserRating user1 = new UserRating(5001, ratings);
        userToRatingsMap.put(5001,user1);
        ratings=new ArrayList<>();
        ratings.add(new Rating(1003,3));
        ratings.add(new Rating(1004,4));
        UserRating user2=new UserRating(5002,ratings);
        userToRatingsMap.put(5002,user2);



    }



    @RequestMapping(value = "/{id}")
    public UserRating getRating(@PathVariable int id){


        return userToRatingsMap.get(id);
    }
}
