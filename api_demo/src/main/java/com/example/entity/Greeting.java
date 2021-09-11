package com.example.entity;

public class Greeting {

    private long id;
    private String content;

    public Greeting(Long id, String content){
        this.id=id;
        this.content=content;

    }
    public long getIdo(){
        return id;
    }
    public String getContent(){
        return content;
    }
}
