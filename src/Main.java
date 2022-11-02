public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Mission 7.1");
        int vkladToo=15000;
        int totalToo=0;
        int y=0;
        while (totalToo<2_459_000)
            {
                totalToo=(totalToo+vkladToo+(vkladToo/100));
                y=y+1;
                System.out.println("Месяц " + y + " сумма накоплений на банковском счете " + totalToo + " рублей" );
            }
        System.out.println("За " + y + " месяца сумма накоплений на банковском счете " + totalToo + " рублей" );


        System.out.println(" ");
        System.out.println("Mission 7.2");
        int b=0;
        while (b <10)
        { b=b+1;
            System.out.print(" " + b);}
        System.out.println();
        for (; b > 0; b--)
        {System.out.print(" " + b);}

        System.out.println(" ");
        System.out.println("Mission 7.3");
        int peopleAll=12_000_000;
        System.out.println("В городе население "+peopleAll);
        int peopleAllUp=12_000_000;
        int humanBorn=17;
        int humanDeath=8;
        int g=1;
        for(;g<10;g++)
        {
            peopleAllUp=(peopleAllUp-humanDeath)+humanBorn;
            System.out.println("Год "+g+" численность населения "+peopleAllUp);
        }
        System.out.println("За "+g+" лет численность населения увеличилась на "+(peopleAllUp-peopleAll));


        System.out.println(" ");
        System.out.println("Mission 7.4");
        int vkladThree=15000;
        int totalThree=0;
        int d=0;
        while (totalThree<12_459_000)
        {
            totalThree=(totalThree+vkladThree+((vkladThree/100)*7));
            d=d+1;
            if(d%100==0)
            {System.out.println("Месяц " + d + " сумма накоплений на банковском счете " + totalThree + " рублей" );}
        }
        System.out.println("За " + d + " месяца сумма накоплений на банковском счете " + totalThree + " рублей" );

        System.out.println(" ");
        System.out.println("Mission 7.5");
        int vkladOne=15000;
        int totalOne=0;
        int s=0;
        while (totalOne<12_459_000)
        {
            totalOne=(totalOne+vkladOne+((vkladOne/100)*7));
            s=s+1;
            if(s%6==0)
            {System.out.println("Месяц " + s + " сумма накоплений на банковском счете " + totalOne + " рублей" );}
        }
        System.out.println("За " + s + " месяца сумма накоплений на банковском счете " + totalOne + " рублей" );


        System.out.println(" ");
        System.out.println("Mission 7.6");
        int vkladFor=15000;
        int totalFor=0;
        int z=0;
        while (z<108)
        {
            totalFor=(totalFor+vkladFor+((vkladFor/100)*7));
            z+=1;
            if(z%6==0)
            {System.out.println("Месяц " + z + " сумма накоплений на банковском счете " + totalFor + " рублей" );}
        }
        System.out.println("За " + (z/12) + " лет сумма накоплений на банковском счете " + totalFor + " рублей" );

        System.out.println(" ");
        System.out.println("Mission 7.7");
        int firstFrydayMonth=4;
        int monthDay=31;
        System.out.println("Сегодня пятница "+firstFrydayMonth+" ноября");
        for(;firstFrydayMonth<=monthDay;firstFrydayMonth+=7)
        {
            System.out.println("В пятницу "+firstFrydayMonth+" ноября нужно сдать отчет");
        }


        System.out.println(" ");
        System.out.println("Mission 7.8");
        int periodFly=79;
        int yearStart=1689;
        int periodOne=yearStart+200;
        for (;yearStart<periodOne;yearStart+=periodFly)
        {
            System.out.println(yearStart);
        }

        System.out.println(" ");
        System.out.println("Mission 7.9");
        int multiNumber=1;
        int result;
        for (int numberOne=2;multiNumber<=10;multiNumber++)
        {

            result=numberOne*multiNumber;
            System.out.println(numberOne+" * "+multiNumber+" = "+result);
        }





    }


}