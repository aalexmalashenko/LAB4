package com.company;

public class Promotions {
    private String name = "акции";

    public void deliver(Prepositions Enum, Difficult Enum1) {
        System.out.print(name + " на дом" + Enum.getPreps() + "никто звонить не станет" + Enum1.getDifficult());
    }

    public void go() {
        class Company extends FilmStudio {
            public Company() {
                super("акционерного общества");
            };
        }
        Company company = new Company();
        System.out.println(" из " + company.getName() + " и заберет свои " + name + ".");

    }
    public String be(String what){
        return what + " грозил развал. ";
    }
    public void threaten() {
        System.out.println(be("Акционерному обществу"));
    }
    public String agree(String what){
        return what + " быстро пришли к соглашению, ";
    }
    public void end(String what){
        System.out.print(agree("Все") + "и на этом " + what + "было закончено." );
    }
}
