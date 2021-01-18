package com.company;

public class Responsibility extends Krol implements ToFix {
    public Responsibility(String name) {
        super(name);
    }
    public void was(String what1, String what2, String what3, String what4){
        System.out.print(what1 + " было сидеть в конторе и продавать акции, ");
        System.out.print(what2 + " -- хранить вырученные от продажи деньги, а ");
        System.out.print(what3 + " -- назначать " + what4);
    }
    @Override
    public void fix(Difficult Enum){
        getDifficult(Enum);
        System.out.print("для решения неотложных вопросов.");
    }
}