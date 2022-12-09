package com.jpa.main.main;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{
    private String director;
    private String actor;
}
