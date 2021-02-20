package com.company;

public enum Fruits {
    FRUITS(" фруктах "),
    VEGETABLES(" овощах "),
    NONE(""),
    CUCUMBER(" огурцы "),
    MELON(" дыни "),
    PUMPKIN(" тыквы "),
    WATERMELON(" арбуза "),
    BERRIES(" ягодах ");
    private final String Fruits;
    Fruits(String Enum){
        this.Fruits = Enum;
    }
    public String getFruits(){
        return Fruits;
    }

}
