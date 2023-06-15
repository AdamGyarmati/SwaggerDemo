package com.example.swaggerdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the book")
public class Book {

    @ApiModelProperty(notes = "The unique id of the book")
    private String id;
    @ApiModelProperty(notes = "The book's name")
    private String author;
    @ApiModelProperty(notes = "The year when the book was released")
    private int release;

    public Book(String id, String author, int release) {
        this.id = id;
        this.author = author;
        this.release = release;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
