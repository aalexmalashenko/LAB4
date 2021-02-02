package com.company;

public class Korotishka extends Krol implements Duties {
    public Korotishka(){
        super("коротышек");
    }

    @Override
    public void satisfy(Difficult Enum){
        System.out.print(Enum.getDifficult() + "доволен");
    }


    public void mince(Prepositions Enum, String whom){
        System.out.print(Enum.getPreps() + "лунных " + whom);
    }
}
