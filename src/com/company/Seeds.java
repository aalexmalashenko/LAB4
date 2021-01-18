package com.company;

public class Seeds extends RealResponsibilities {
    public Seeds(String name){
        super(name);
    }
    public void getPreposition(Prepositions Enum){
        switch(Enum){
            case ON:
                System.out.print(" на ");
                break;
            case FOR:
                System.out.print(" для ");
                break;
            case FROM:
                System.out.print(" от ");
                break;
            case IF:
                System.out.print(", если ");
                break;
        }
    }
    public void get(Prepositions Enum, String what){
        getPreposition(Enum);
        System.out.print("удастся достать " + what);
    }
}
