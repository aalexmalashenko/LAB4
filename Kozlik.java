package com.company;

public class Kozlik extends Krol {
    public Kozlik(){
        super("Козлик");
    }
    public void send(String who){
        System.out.println("посылать " + who + "a за покупками. ");
    }
    public void end(Difficult Enum, String who){
        System.out.println("Неизвестно, " + Enum.getDifficult() + ", если бы в дело не вмешался сам " + who + ".");
    }
}
