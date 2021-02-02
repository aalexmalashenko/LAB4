package com.company;

public class Seeds extends RealResponsibilities {
    public Seeds(String name){
        super(name);
    }
    public void get(Prepositions Enum, String what){
        System.out.print(Enum.getPreps() + "удастся достать " + what);
    }
}
