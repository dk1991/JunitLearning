package ru.kanaev.good;

public class Crow extends Bird {

    public Crow(String name) {
        super(name);
    }

    public void feed() {
        setFlying(false);
    }
}
