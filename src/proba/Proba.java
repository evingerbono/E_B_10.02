package proba;

import java.io.InputStream;
import java.util.Scanner;

public class Proba {

    static String[] pakli = new String[22];
    static Scanner sc = new Scanner(InputStream.nullInputStream());

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
        String[] ertek = {"VIII", "IX", "X", "Alsó", "Felső", "Ász"};
        for (int i = 1; i < pakli.length; i++) {
            pakli[i] = szinek[i] + "-" + ertek[i];
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
        System.out.println("Melyik oszlopba van a kártyád(1-3):");
        int bekeres = sc.nextInt();
        return bekeres;
    }

    private static void keveres(int oszlop) {
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    ujPakli[i]=pakli[20-(i-1)*3];
                    ujPakli[i+7]=pakli[19-(i-1)*3];
                    ujPakli[i+14]=pakli[21-(i-1)*3];
                }
                break;
            case 2:

                break;
            case 3:
                
                break;
        }
    }

    private static void eredmenyKiiras() {

    }

}
