package com.company;

public class Krol{

    private String name;
    public Krol(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void getDifficult(Difficult Enum){
        switch(Enum){
            case ENOUGH:
                System.out.print(" вполне ");
                break;
            case ONTHIS:
                System.out.print(". На этом ");
                break;
            case AFTERTHAT:
                System.out.print(", после чего ");
                break;
            case AGREEMENT:
                System.out.print(" С общего согласия ");
                break;
            case NONE:
                System.out.print(" ");
                break;
        }
    }
}

