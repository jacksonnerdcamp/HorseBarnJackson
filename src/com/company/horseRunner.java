package com.company;

public class horseRunner {
    public static void main(String[] args)
    {
        Horse Mustang1 = new Mustang("Mustang1", 12000);
        Horse Mustang2 = new Mustang("Mustang2", 12000);
        Horse Mustang3 = new Mustang("Mustang3", 12000);

        Horse[] horses = new Horse[6];

        horses[1] = Mustang1;
        horses[2] = Mustang2;
        horses[3] = Mustang3;
        horseBarn barn = new horseBarn(horses);

        System.out.println(barn);
        System.out.println("Mustang1 is in space " + barn.findHorseSpace("Mustang3"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Mustang1 is now in space " + barn.findHorseSpace("Mustang3"));
    }
}
