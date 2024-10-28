package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
                    System.out.println("Entrer un nombre");
                    int nombre = scanner.nextInt();
                    System.out.println("Entrer une puissance");
                    int puissance = scanner.nextInt();
                    System.out.println("La puissance doit etre superieur ou = à 0"+ (puissance >= 0));
                    double resultat = Math.pow(nombre,puissance);
                    System.out.println("Le resultat de " + nombre + " puissance " + puissance +" est: " + resultat);
                    break;

                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici
                    System.out.println("Entrer le kilometre parcouru");
                    double kilometres= scanner.nextDouble();
                    double forfait;
                    if (kilometres < 100) {
                        forfait = kilometres * 0.20;
                    } else if (kilometres > 100 && kilometres <= 500) {
                        forfait = kilometres * 0.50;
                    } else {
                        forfait = kilometres * 0.80;
                    }
                    System.out.println("Le montant à payer par le client est: " + forfait);
                    break;

                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici
                    System.out.println("Entrer la largeur du rectangle");
                    double largeur = scanner.nextDouble();
                    if (largeur <= 0){
                        System.out.println("La largeur doit etre superieur ou égale à 0");
                    }
                    System.out.println("Entrer la hauteur du rectangle");
                    double hauteur = scanner.nextDouble();
                    if (hauteur <= 0){
                        System.out.println("La hauteur doit etre superieur à ou égale 0");
                    }
                    System.out.println("Le rectangle fait " + hauteur + "cm de longueur et " + largeur + "cm de largeur+");
                    break;

                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici
                    System.out.println("Entrer un nombre");
                    int nombr = scanner.nextInt();
                    System.out.println("Le factoriel de" + nombr + " est: ");
                    break;


                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;

            }
        }
    }
}