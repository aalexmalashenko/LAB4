package com.company;

public class Film extends FilmStudio {
    public Film() {
        super(" фильма");
    }

    public void toDoSmth(Difficult Enum) {
        class Contract extends Krol {
            public Contract() {
                super("контракта");
            }
        }
        Contract contract = new Contract();
        System.out.print(Enum.getDifficult() + contract.getName() +" заключенного со студией телевидения, ");
    }
}