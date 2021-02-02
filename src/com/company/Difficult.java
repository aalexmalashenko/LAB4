package com.company;

public enum Difficult {
    ENOUGH(" вполне "),
    AFTERTHAT(", после чего "),
    ONTHIS(". На этом "),
    AGREEMENT(" С общего согласия "),
    BESIDES("Помимо "),
    AGAIN("снова"),
    NONE("");
    public final String Enum;
    Difficult(String Enum){
        this.Enum = Enum;
    }
    public String getDifficult(){
        return Enum;
    }
}
