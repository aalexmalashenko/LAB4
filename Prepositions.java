package com.company;

public enum Prepositions {
    FOR(" для "),
    FROM(" от "),
    ON(" на "),
    NONE(" "),
    IF(", если "),
    INTO(" в воздух "),
    THESE(" эти "),
    BESIDES(", к тому же "),
    DOWN(" вниз ");
    private final String Preps;
    Prepositions(String Preps){
        this.Preps = Preps;
    }
    public String getPreps(){
        return Preps;
    }

}
