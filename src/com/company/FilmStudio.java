package com.company;

public class FilmStudio {
    private String name;
    public FilmStudio(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void negotiate(String who, String who1, String what, String what2){
        System.out.print(who + " и " + who1 + " заключили " + what  + " c " + what2);
    }
    public static class Astronaut extends Krol{
        public Astronaut(){
            super("космонавта");
        }
        public void arrive(String what,String who){
            System.out.print(" на съемку" + what + " о прибытии " + who + ".");
        }
    }
}
