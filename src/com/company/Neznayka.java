package com.company;

public class Neznayka extends Krol{
    public Neznayka(){
        super("Незнайка");
    }
    public void say(Difficult Enum, String Case) {
        if (Case == " сказал, что будет")
            System.out.print(getName() + Case);
        else if (Case == " был назначен кассиром, ") {
            System.out.print(Enum.getDifficult() + getName() + Case);
        }
    }
}
