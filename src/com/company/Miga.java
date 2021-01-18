package com.company;

public class Miga extends Krol{
    public Miga(String name){
        super(name);
    }
    public void fix(String who, String whoo) {
        System.out.print(who + " -- казначеем, а ");
        System.out.print(whoo + " -- председателем. ");
    }


}
