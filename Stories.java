package com.company;

public class Stories extends FilmStudio {
    public Stories() {
        super("рассказы");
    }

    public void appear(String str, Difficult Enum, String what, Fruits Enum1, Fruits Enum2, Fruits Enum3, Prepositions Enum4, Difficult Enum5) {
        if (str == "стали появляться ") {
            System.out.print(Enum.getDifficult() + "в газетах" + str + what + " о произрастающих гиганстких");
            System.out.println(Enum1.getFruits() + Enum2.getFruits() + Enum3.getFruits() + "и плодах. ");
        } else if (str == "сопровождались") {
            System.out.print(what + Enum4.getPreps() + Enum5.getDifficult() + str + " занимательными рисунками:");
        }
    }
    public class Painting {
        private String name = "изображение";

       public String toString(){
           return name;
       }
        public void paint(Difficult Enum, String who){
            class Drawing extends Krol{
                public Drawing(){
                    super("рисунок");
                }
                String be(String what){
                    return what;
                }
            }
            Drawing drawing = new Drawing();
           System.out.println(Enum.getDifficult() + "это был " + drawing.be("рисунок") + " c " + name + "м " + who );
        }
        public void plant(Difficult Enum, Fruits Enum1, String who1){
           System.out.print("," + Enum.getDifficult()+ "это было " + name + " грядки, на которой росли" + Enum1.getFruits() + "величиной с " + who1);
        }
        public void high(Difficult Enum, Fruits Melon, Fruits Pumpkin, Fruits Watermelon){
           System.out.print("; " + Enum.getDifficult() + " чудовищной" + Melon.getFruits() + Pumpkin.getFruits() + "или" + Watermelon.getFruits());
           System.out.println("величиной с двухъэтажный дом.");
        }
    };

}
