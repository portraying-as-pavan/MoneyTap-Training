package com.example.service;

import com.example.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Override
    public Person person() {
        return new Person("Pavan","Guguloth",22);
    }

    @Override
    public List<Person> persons() {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Pavan","Guguloth",22));
        personList.add(new Person("Albert","Ram",23));
        return personList;
    }

    @Override
    public Person personById() {
        return null;
    }
}
