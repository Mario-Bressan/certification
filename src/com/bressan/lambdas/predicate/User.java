package com.bressan.lambdas.predicate;

public class User {
    private int points;
    private String name;
    private boolean moderator;

    public User(String name) {
        this.name = name;
    }

    public User(String name, int points) {
        this.name = name;
        this.points = points;
        this.moderator = false;
    }

    public User(String name, int points, boolean moderator) {
        this.name = name;
        this.points = points;
        this.moderator = moderator;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public boolean isModerator() {
        return moderator;
    }

    public void becomeModerator() {
        this.moderator = true;
    }

    public String toString() {
        return "User: " + name;
    }
}
