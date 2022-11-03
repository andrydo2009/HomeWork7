public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Mission 7.1");
        int vkladToo=15000;
        int totalToo=0;
        int sumIteration=0;
        while (totalToo<2_459_000)
            {
                totalToo=(totalToo+vkladToo+(vkladToo/100));
                sumIteration+=1;
                System.out.println("Месяц " + sumIteration + " сумма накоплений на банковском счете " + totalToo + " рублей" );
            }
        System.out.println("За " + sumIteration + " месяца сумма накоплений на банковском счете " + totalToo + " рублей" );


        System.out.println(" ");
        System.out.println("Mission 7.2");
        int orderNumber=0;
        while (orderNumber < 10)
        { orderNumber=orderNumber+1;
            System.out.print(" " + orderNumber);}
        System.out.println();
        for (; orderNumber > 0; orderNumber--)
        {System.out.print(" " + orderNumber);}

        System.out.println(" ");
        System.out.println("Mission 7.3");
        int peopleAll=12_000_000;
        System.out.println("В городе население "+peopleAll);
        int peopleAllUp=12_000_000;
        int humanBorn=17;
        int humanDeath=8;
        int year =1;
        for(; year <10; year++)
        {
            peopleAllUp=(peopleAllUp-humanDeath)+humanBorn;
            System.out.println("Год "+ year +" численность населения "+peopleAllUp);
        }
        System.out.println("За "+ year +" лет численность населения увеличилась на "+(peopleAllUp-peopleAll));


        System.out.println(" ");
        System.out.println("Mission 7.4");
        int vkladThree=15000;
        int totalThree=0;
        int monthVklad =0;
        while (totalThree<12_459_000)
        {
            totalThree=(totalThree+vkladThree+((vkladThree/100)*7));
            monthVklad = monthVklad +1;
            if(monthVklad %100==0)
            {System.out.println("Месяц " + monthVklad + " сумма накоплений на банковском счете " + totalThree + " рублей" );}
        }
        System.out.println("За " + monthVklad + " месяца сумма накоплений на банковском счете " + totalThree + " рублей" );

        System.out.println(" ");
        System.out.println("Mission 7.5");
        int vkladOne=15000;
        int totalOne=0;
        int monthVkladToo=0;
        while (totalOne<12_459_000)
        {
            totalOne=(totalOne+vkladOne+((vkladOne/100)*7));
            monthVkladToo=monthVkladToo+1;
            if(monthVkladToo%6==0)
            {System.out.println("Месяц " + monthVkladToo + " сумма накоплений на банковском счете " + totalOne + " рублей" );}
        }
        System.out.println("За " + monthVkladToo + " месяца сумма накоплений на банковском счете " + totalOne + " рублей" );


        System.out.println(" ");
        System.out.println("Mission 7.6");
        int vkladFor=15000;
        int totalFor=0;
        int monthVkladThree =0;
        while (monthVkladThree <108)
        {
            totalFor=(totalFor+vkladFor+((vkladFor/100)*7));
            monthVkladThree +=1;
            if(monthVkladThree %6==0)
            {System.out.println("Месяц " + monthVkladThree + " сумма накоплений на банковском счете " + totalFor + " рублей" );}
        }
        System.out.println("За " + (monthVkladThree /12) + " лет сумма накоплений на банковском счете " + totalFor + " рублей" );

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

// The End
