package com.company;

public class Miga extends Krol{
    public Miga(){
        super("Мига");
    }
    public void fix(String who, String whoo) {
        System.out.print(who + " -- казначеем, а ");
        System.out.println(whoo + " -- председателем. ");
    }
    private String name = "Мига";
    public void cry(){
        System.out.print(name + " кричал, что ");
    }
    public String be(String who){
        return who + " казначей и ";
    }
    public void threw(){
        System.out.println(be("он") + "не намерен выбрасывать деньги,");
    }



}
