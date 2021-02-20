package com.company;

public class FilmStudio {
    private String name;

    public FilmStudio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void negotiate(String who, String who1, String what, String what2) {
        System.out.print(who + " и " + who1 + " заключили " + what + " c " + what2);
    }

    public static class Astronaut extends Krol {
        public Astronaut() {
            super("космонавта");
        }

        public void arrive(String what, String who) {
            System.out.println(" на съемку" + what + " о прибытии " + who + ". ");
        }
    }

    public void getup(Prepositions Enumm, Prepositions Enum) {
        System.out.println(" подняли на вертолете" + Enumm.getPreps() + "и сбросили" + Enum.getPreps() + ". ");
    }

    public static class Cameraman extends Krol {
        public Cameraman() {
            super("Кинооператоры");
        }

        ToBe parachute = new ToBe() {
            @Override
            public void shoot(String who, Prepositions Enum, boolean key) throws ComeDownException {
                if (key)
                    System.out.print(getName() + " засняли, как он спустился" + Enum.getPreps() + parachute);
                else {
                    throw new ComeDownException(who + " не засняли, как он спустился");
                }
            }
        };
    }

    public class Room extends Krol{
        public Room(){
            super("контор");
        }
        String hire(String what) {
            return what + ", которая была нанята ";
        }

        public void consist(String who1, String who2) {
            System.out.println(hire("Контора") + who1 + " и "+ who2 + ", состояла из двух комнат. ");
        }
        public void phone(Difficult Enum, String where){
            System.out.print(Enum.getDifficult() + "может позвонить в " + where);
        }
        public void ask(){
            System.out.println("у и попросить доставить ");
        }
    }
}

