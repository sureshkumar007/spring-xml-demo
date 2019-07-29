package com.stackroute.domain;

public class Movie
{
    private Actor actor;

//    public Movie() {
//
//    }


    public Movie(Actor actor)
    {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("called");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
