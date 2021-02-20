package com.company;

public class Ponchik extends Krol {
    public Ponchik(){
        super("Пончика");
    }
    public void remain(String who){
        System.out.println(" оставшегося на поверхности Луны " + getName());
    }
    public void decide(Difficult Enum, Difficult Enumm){
        System.out.print(Enum.getDifficult() + "они и порешили");
        System.out.println(Enumm.getDifficult() + "перешли к распределению обязанностей.");
    }

}
