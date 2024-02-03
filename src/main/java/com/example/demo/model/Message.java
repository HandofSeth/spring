package com.example.demo.model;

import java.time.LocalDateTime;
public class Message {

    private String author;
    private LocalDateTime timeStamp;

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public Message(String author, String message) {
        this.timeStamp = LocalDateTime.now();
        this.author = author;
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getTime() {
        return timeStamp;
    }

    public void setTime(LocalDateTime time) {
        this.timeStamp = time;
    }

}


