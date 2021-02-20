package com.company;

public class Julio extends Krol{
    public Julio(){
        super("Жулио");
    }
    public void tell(String who, String str, Prepositions Enum){
        System.out.print(who + str + ", что рассыльный нужен для престижа" + Enum.getPreps());
    }
    private String name = "Жулио";
    public void cry(){
        System.out.print(name + " кричал, что ");
    }
    public String be(String who){
        return who + " председатель и";
    }
    public void consider(Difficult Enum){
        System.out.print(be("он") + Enum.getDifficult() + " должны считаться, а ");
    }

}
