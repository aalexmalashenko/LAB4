package com.company;

public class Ponchik extends Krol {
    public Ponchik(){
        super("Пончика");
    }
    public void remain(String who){
        System.out.print(" оставшегося на поверхности Луны " + getName());
    }
    public void decide(Difficult Enum, Difficult Enumm){
        getDifficult(Enum);
        System.out.print("они и порешили");
        getDifficult(Enumm);
        System.out.print("перешли к распределению обязанностей.");
    }

}
