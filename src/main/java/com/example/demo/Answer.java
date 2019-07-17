package com.example.demo;

//import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String quest;
    private String color;
    private String burden;
    private int question;
    private Random rand;

//    public Answer() {
//        setQuestion();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }


    public int getQuestion() {
        return question;
    }

    public void setQuestion() {
        rand = new Random();
        this.question = (rand.nextInt(2)+1);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


