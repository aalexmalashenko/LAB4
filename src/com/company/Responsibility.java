package com.company;

public class Responsibility extends Krol implements ToFix {
    public Responsibility(String name) {
        super(name);
    }
    public void was(String what1, String what4){
        System.out.print(what1 + "ю председателя было сидеть в конторе и продавать акции, ");
        System.out.print(what1 + "ю казначея -- хранить вырученные от продажи деньги, а ");
        System.out.print(what1 + "ю председателя -- назначать " + what4);
    }
    @Override
    public void fix(Difficult Enum){
        System.out.print(Enum.getDifficult() + "для решения неотложных вопросов.");
    }
}