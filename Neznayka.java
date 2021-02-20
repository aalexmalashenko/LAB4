package com.company;

public class Neznayka extends Krol{
    public Neznayka(){
        super("Незнайка");
    }
    public void say(Difficult Enum, String Case) {
        if (Case == " сказал, что будет")
            System.out.print(getName() + Case);
        else if (Case == " был назначен кассиром, ") {
            System.out.print(Enum.getDifficult() + getName() + Case);
        }
    }
    public void dress(String who, Difficult Enum){
        System.out.print(who + Enum.getDifficult() + "одели в скафандр,");
    }
    public void calm(String who, Difficult Enum){
        System.out.print(who + " пытался их успокоить, но у него " + Enum.getDifficult());
    }

    ToBe parachute = new ToBe(){
        @Override
        public void shoot(String who, Prepositions Enum, boolean key) throws ComeDownException {
            if(key) {
                System.out.print(who + " засняли, как он спустился" + Enum.getPreps() + parachute);
            }
            else{
                throw new ComeDownException(who + " не засняли, как он спустился");
            }
        }
    };

}
