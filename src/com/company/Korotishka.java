package com.company;

public class Korotishka extends Krol implements Duties {
    public Korotishka(){
        super("коротышек");
    }

    @Override
    public void satisfy(Difficult Enum){
        getDifficult(Enum);
        System.out.print("доволен");
    }

    public void getPreposition(Prepositions Enum) {
        switch (Enum) {
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
    public void mince(Prepositions Enum, String whom){
        getPreposition(Enum);
        System.out.print("лунных " + whom);
    }
}
