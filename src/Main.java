//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 1000;
        byte b = 100;
        short c = 140;
        long d = 500000;
        float F = 1.25f;
        double R = 10.75f;
        System.out.println("Значение переменной a с типом int равно "+ a);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной c с типом short равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной F с типом float равно "+F);
        System.out.println("Значение переменной R с типом double равно "+R);

        float A = 27.12f;
        long D = 987678965549L;
        double C = 2.786;
        short B = 569;
        short S = -159;
        long Q = 27897;
        byte W = 67;

        byte LP = 23;
        byte AS = 27;
        byte EL = 30;
        short allPapper = 480;
        byte allPeople = (byte) (LP+AS+EL);
        short naOdnogo =(short) (allPapper/allPeople);
        System.out.println("На каждого ученика рассчитано "+naOdnogo+ " листов бумаги");


        byte M = 2;
        byte T = 16;
        byte oneMin = (byte)(T/M);
        long amo = (long) (20* oneMin);
        short day = (short) (24*60* oneMin);
        long threeDay = (long) (3*day);
        long mouth = (long) (10* threeDay);
        System.out.println("За 1 минуту машина производит "+oneMin+" бутылок");
        System.out.println("За 20 минут машина произвела "+amo+" штук бутылок ");
        System.out.println("За сутки машина произвела "+day+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+threeDay+" штук бутылок");
        System.out.println("За месяц машина произвела "+mouth+" штук бутылок");

        byte bel = 2;
        byte cor = 4;
        byte vsego = (byte)(bel+cor);
        byte cup = 120;
        byte allKlass = (byte)(cup/vsego);
        long klass = (long)(cup/vsego);
        byte belbank = (byte)(bel*klass);
        byte corbank = (byte) (cor*klass);
        System.out.println("В школе где "+allKlass+" классов,нужно "+belbank+" ,белой краски и "+corbank+" ,банок коричневой краски");

        long banan = 5;
        long milkML = 200;
        long milkGramm = 105;
        long ice = 2;
        long egg = 4;
        long bananGr =(long) (banan*80);
        long milkGr = (long) (2*105);
        long iceGr = (long) (ice*100);
        long eggGr = (long) (egg*70);
        long vesGr = (long) (bananGr+milkGr+iceGr+eggGr);
        float vesKg = (float) (vesGr/1000f);
        System.out.println("Вес такого завтрака спортсмена "+vesGr+" грамм");
        System.out.println("Вес такого завтрака спортсмена "+vesKg+" килограмм");

        long vesn = 7;
        long vesVGR = (long) (vesn*1000);
        long min = 250;
        long max = 500;
        long minDay = (long)(vesVGR/min);
        long maxDay = (long)(vesVGR/max);
        long sred = (long) (maxDay+minDay);
        long sredDay = (long) (sred/2);
        System.out.println("Если сбрасывать "+min+" грамм в день,то потребуется "+minDay+" дней");
        System.out.println("Если сбрасывать "+max+" грамм в день,то потребуется "+maxDay+" дней");
        System.out.println("В средней понадобится "+sredDay+" дней");

        double maha = 67760.0;
        double denis = 83690.0;
        double kris = 76230.0;
        long mahaGod = (long) (maha*12);
        long denisGod = (long) (denis*12);
        long krisGod = (long) (kris*12);
        double mahaPri = (double) (maha/100);
        double mahaProc = (double) (mahaPri*10);
        double denisPri = (double) ((denis/100)*10);
        double krisPri = (double) ((kris/100)*10);
        long mahaPrib = (long) (maha+mahaProc);
        long denisPrib = (long) (denis+denisPri);
        long krisPrib = (long) (kris+krisPri);
        double mahaVgod = (double) (mahaPrib*12);
        long denisVgod = (long) (denisPrib*12);
        long krisVgod = (long) (krisPrib*12);
        long mahaRaz = (long) (mahaVgod-mahaGod);
        long denisRaz = (long) (denisVgod-denisGod);
        long krisRaz = (long)(krisVgod-krisGod);
        System.out.println("Маша теперь получает "+mahaPrib+" .Годовой доход вырос на "+mahaRaz+" рублей");
        System.out.println("Денис теперь получает "+denisPrib+" .Годовой доход вырос на "+denisRaz+" рублей");
        System.out.println("Кристина теперь получает "+krisPrib+" .Годовой доход вырос на "+krisRaz+" рублей");

    }
}