package com.company;
public class Main {


    public static void main(String[] args) {
        Neznayka neznayka = new Neznayka();
        Seeds seeds = new Seeds();
        Korotishka korotishka = new Korotishka();
        Misfortune misfortune = new Misfortune();
        Ponchik ponchik = new Ponchik();
        Responsibility responsibility = new Responsibility("обязанность");
        Responsibility meetings = new Responsibility("заседания акционерного общества ");
        Miga miga = new Miga();
        Julio julio = new Julio();
        Film film = new Film();
        FilmStudio filmStudio = new FilmStudio("киностудией");
        Pact pact = new Pact();
        FilmStudio.Astronaut astronaut = new FilmStudio.Astronaut();
        FilmStudio.Cameraman cameraman = new FilmStudio.Cameraman();
        Stories stories = new Stories();
        Stories.Painting painting = stories.new Painting();


        film.toDoSmth(Difficult.BESIDES);
        filmStudio.negotiate(miga.getName(), julio.getName(), pact.getName(), filmStudio.getName());
        astronaut.arrive(film.getName(), astronaut.getName());
        neznayka.dress(neznayka.getName(), Difficult.AGAIN);
        filmStudio.getup(Prepositions.INTO, Prepositions.DOWN);

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

        try {
            parachute.shoot(cameraman.getName(), Prepositions.DOWN, true);
        } catch (ComeDownException e) {
            System.err.print(e.getMessage());
        }

        stories.appear("стали появляться ", Difficult.THOSEDAYS, stories.getName(), Fruits.VEGETABLES, Fruits.FRUITS, Fruits.BERRIES, Prepositions.NONE, Difficult.NONE);
       stories.appear("сопровождались", Difficult.NONE, stories.getName(), Fruits.NONE, Fruits.NONE, Fruits.NONE, Prepositions.THESE, Difficult.USUALLY);
       painting.paint(Difficult.SOMETIMES,  korotishka.getName());
       painting.plant(Difficult.SOMETIMES, Fruits.CUCUMBER, korotishka.getName());
       painting.high(Difficult.SOMETIMES, Fruits.MELON, Fruits.PUMPKIN, Fruits.WATERMELON);
       FilmStudio.Room room = filmStudio.new Room();
       room.consist(miga.getName(), julio.getName());
       Meeting meeting = new Meeting();
       meeting.make(miga.getName(), julio.getName());
       meeting.suggested(miga.getName());
       Meeting.Millions millions = new Meeting.Millions();
       millions.sell(millions.getName());

        neznayka.say(Difficult.NONE, " сказал, что будет");
        korotishka.satisfy(Difficult.ENOUGH);
        seeds.get(Prepositions.IF, seeds.getName());
        korotishka.mince(Prepositions.FOR, korotishka.getName());
        misfortune.safe(misfortune.getName());
        ponchik.remain(ponchik.getName());
        ponchik.decide(Difficult.ONTHIS, Difficult.AFTERTHAT);
        neznayka.say(Difficult.AGREEMENT, " был назначен кассиром, ");
        miga.fix(miga.getName(), julio.getName());
        responsibility.was(responsibility.getName(), meetings.getName());
        responsibility.fix(Difficult.NONE);

        julio.tell(julio.getName(), " сказал" ,Prepositions.BESIDES);
        room.phone(Difficult.SOMEBODY, room.getName());
        room.ask();
        Promotions promotions = new Promotions();
        promotions.deliver(Prepositions.IF, Difficult.POSSIBLE);
        Kozlik kozlik = new Kozlik();
        kozlik.send(kozlik.getName());
        Arguement arguement = new Arguement();
        arguement.flare(Difficult.MORE);
        julio.cry();
        julio.consider(Difficult.OPINION);
        miga.cry();
        miga.threw();
        try{
            System.out.print(" а если с ним не согласны, то он выйдет");
        }
        catch(GoAwayException e){
            System.err.print(e.getMessage());
            System.err.print(" ,то он не выйдет");
        }
        promotions.go();
        neznayka.calm(neznayka.getName(), Difficult.COMEOUT);
        promotions.threaten();
        kozlik.end(Difficult.END, kozlik.getName());
        promotions.end(meetings.getName());
    }
}