package com.company;

public enum Difficult {
    ENOUGH(" вполне "),
    AFTERTHAT(", после чего "),
    ONTHIS(". На этом "),
    AGREEMENT(" С общего согласия "),
    SOMEBODY("кто-нибудь "),
    POSSIBLE(", то можно будет "),
    BESIDES("Помимо "),
    OPINION(" с его мнением"),
    COMEOUT(" ничего не выходило. "),
    AGAIN(" снова "),
    END("чем бы все кончилось"),
    MORE(" все больше и больше"),
    USUALLY(" обычно "),
    SOMETIMES(" иногда "),
    THOSEDAYS("В те же дни "),
    NONE("");
    private final String Enum;
    Difficult(String Enum){
        this.Enum = Enum;
    }
    public String getDifficult(){
        return Enum;
    }
}
