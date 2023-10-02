package proba;

import java.util.Scanner;

public class Proba {

    static String[] pakli = new String[21];

    public static void main(String[] args) {

        jatek();
    }

    private static void jatek() {
        pakliKirak();
        for (int i = 0; i < 3; i++) {
            keveres(bekeres());
        }
        eredmenyKiiras();
    }

    private static void pakliKirak() {
        String[] szinek = {"P", "Z", "T", "M"};
        String[] ertek = {"Alsó", "Felső", "Ász","VIII", "IX", "X"};
        for (int i = 0; i < pakli.length; i++) {
            pakli[i] = szinek[i/6] + "-" + ertek[i%6];
        }
        int db = 0;
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf(pakli[i], "  ");
            db++;
            if (db == 3) {
                System.out.println("");
                db = 0;
            }
        }
    }

    private static int bekeres() {
        Scanner sc = new Scanner(System .in);
        System.out.println("Melyik oszlopba van a kártyád(1-3):");
        int bekeres = sc.nextInt();
        return bekeres;
    }

    private static void keveres(int oszlop) {
        String[] ujPakli = new String[21];
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[19 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[19 - (i - 1) * 3];
                }
                break;
        }
    }

    private static void eredmenyKiiras() {
        System.out.printf("A kiválasztott lapod:%d",pakli[11]);
    }

}
