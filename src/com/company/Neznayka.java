package com.company;

public class Neznayka extends Krol{
    public Neznayka(String name){
        super(name);
    }
    public void say(Difficult Enum, String Case) {
        if (Case == " сказал, что будет")
            System.out.print(getName() + Case);
        else if (Case == " был назначен кассиром, ") {
            getDifficult(Enum);
            System.out.print(getName() + Case);
        }
    }
}
