package com.company;
public class Main {

    public static void main(String[] args) {
        Neznayka neznayka = new Neznayka();
        Seeds seeds = new Seeds("семена");
        Korotishka korotishka = new Korotishka();
        Misfortune misfortune = new Misfortune();
        Ponchik ponchik = new Ponchik();
        Responsibility responsibility = new Responsibility("обязанность");
        Responsibility meetings = new Responsibility("заседания акционерного общества ");
        Miga miga = new Miga();
        Julio julio = new Julio();
        Film film = new Film();
        FilmStudio filmStudio = new FilmStudio("киностудией");
        Pact pact = new Pact("договор");
        FilmStudio.Astronaut astronaut = new FilmStudio.Astronaut();

        film.toDoSmth(Difficult.BESIDES);
        filmStudio.negotiate(miga.getName(), julio.getName(), pact.getName(), filmStudio.getName());
        astronaut.arrive(film.getName(), astronaut.getName());

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

    }
}