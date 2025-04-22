package com.example.rajnikant;

public class State {

    private String heading;
    private int image;

    public State(String heading, int image) {
        this.heading = heading;
        this.image = image;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
