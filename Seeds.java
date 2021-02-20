package com.company;

public class Seeds extends RealResponsibilities {
    public Seeds(){
        super("семена");
    }
    public void get(Prepositions Enum, String what){
        System.out.print(Enum.getPreps() + "удастся достать " + what);
    }
}
