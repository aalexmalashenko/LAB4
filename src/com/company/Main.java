package com.company;
public class Main {

    public static void main(String[] args) {
        Neznayka neznayka = new Neznayka("Незнайка");
        Seeds seeds = new Seeds("семена");
        Korotishka korotishka = new Korotishka("коротышек");
        Misfortune misfortune = new Misfortune("беды");
        Ponchik ponchik = new Ponchik("Пончика");
        Responsibility responsibility = new Responsibility("обязанность");
        Responsibility kassir = new Responsibility("обязанностью кассира");
        Responsibility kaznachey = new Responsibility("обязанностью казначея");
        Responsibility predsedatel = new Responsibility("обязанностью председателя");
        Responsibility meetings = new Responsibility("заседания акционерного общества");
        Miga miga = new Miga("Мига");
        Julio julio = new Julio("Жулио");

        neznayka.say(Difficult.NONE, " сказал, что будет");
        korotishka.satisfy(Difficult.ENOUGH);
        seeds.get(Prepositions.IF, seeds.getName());
        korotishka.mince(Prepositions.FOR, korotishka.getName());
        misfortune.safe(misfortune.getName());
        ponchik.remain(ponchik.getName());
        ponchik.decide(Difficult.ONTHIS, Difficult.AFTERTHAT);
        neznayka.say(Difficult.AGREEMENT, " был назначен кассиром, ");
        miga.fix(miga.getName(), julio.getName());
        responsibility.was(kassir.getName(), kaznachey.getName(), predsedatel.getName(), meetings.getName());
        responsibility.fix(Difficult.NONE);

    }
}