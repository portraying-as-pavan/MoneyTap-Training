package com.example.service;

import com.example.entity.Person;

import java.util.List;

public interface PersonService {
    Person person();
    List<Person> persons();
    Person personById();
}
