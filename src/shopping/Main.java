package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String auswahl;
    static int anzahl;
    static ArrayList<Produkt> liste = new ArrayList<Produkt>();

    public static void main(String[] args){

        System.out.println("Drücken Sie enter um zu beginnen");
        scan.nextLine();

        System.out.println("Was willst du kaufen?");
        String eingabe = scan.next();


        while(!eingabe.equals("exit")) {


            if (eingabe.equals("kuerbis") || eingabe.equals("schoggi") || eingabe.equals("gummischlange") || eingabe.equals("milch")) {

                System.out.println("Wie viel " + eingabe + " wollen Sie kaufen?");
                anzahl = scan.nextInt();

                switch(eingabe){
                    case "kuerbis":
                        for (int i = 0; i < anzahl; i++) {
                            liste.add(new Kuerbis());
                        }
                        break;
                    case "schoggi":
                        for (int i = 0; i < anzahl; i++) {
                            liste.add(new Schoggi());
                        }
                        break;
                    case "gummischlagne":
                        for (int i = 0; i < anzahl; i++) {
                            liste.add(new Gummischlange());
                        }
                        break;
                    case "milch":
                        for (int i = 0; i < anzahl; i++) {
                            liste.add(new Milch());
                        }
                        break;

                }
            }


            System.out.println("Was willst du kaufen?");
            eingabe = scan.next();

        }
        double endpreis = 0.0;

        for (Produkt p : liste) {
            if(p instanceof Kuerbis){
                endpreis = endpreis + ((Kuerbis) p).getPrice();

            } else if(p instanceof Schoggi){
                endpreis = endpreis + ((Schoggi) p).getPrice();

            } else if(p instanceof Gummischlange){
                endpreis = endpreis + ((Gummischlange) p).getPrice();

            } else if(p instanceof Milch){
                endpreis = endpreis + ((Milch) p).getPrice();
            }
        }

        System.out.println("Ihr Preis beträgt " + endpreis);

    }

}
