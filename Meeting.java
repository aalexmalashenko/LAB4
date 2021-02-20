package com.company;

public class Meeting {

    private String name = "заседани";
    public void make(String who,String who1){
        System.out.println(who+ " и " + who1 + " устроили первое " + name + "е акционерного общества.");
    }
    public void suggested(String who){
        System.out.print(" На этом " + name + "и " + who + " предложил ");
    }
    public static class Millions extends Krol{
        public Millions(){
            super("миллиона");
        }
        public void sell(String what){
            System.out.println("продать 2 " + what + " акций, а остальные 3 " + what + " поделить между собой.");
        }
    }
}
