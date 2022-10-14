package pl.vistula.pojemnikiStepien;

public class PojemnikiNaKlockiStepien {

    public static void main(String[] args) {

        int RandomKlockiStepien=(int)(Math.random()*50 + 50);
        int RandomCapacityStepien = (int)(Math.random()*5 + 5);
        int AmountLeftStepien = 0;
        int AmountFullStepien = 0;

        RandomKlockiStepien += (RandomKlockiStepien % 2 == 0 ? 1 : 0);
        RandomCapacityStepien += (RandomKlockiStepien % 2 == 1 ? 0 : 1);

        System.out.println("Wylosowana liczba klockw: " + RandomKlockiStepien);
        System.out.println("Wylosowana pojemnosc pojemnika: " + RandomCapacityStepien);

        AmountFullStepien = RandomKlockiStepien/RandomCapacityStepien;
        AmountLeftStepien = RandomKlockiStepien % RandomCapacityStepien;

        System.out.println("Pelne pojemniki: " + AmountFullStepien);
        System.out.println("Pozostae klocki: " + AmountLeftStepien);


    }

}
