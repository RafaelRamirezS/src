import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        if(debut > 24 || debut < 0 || fin > 24 || fin < 0) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }
        if(debut == fin) {
        	System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }
        if(debut > fin) {
        	System.out.println("Bizarre, le début de la location est après la fin ...");
        }
        
        /*
        int temps = debut - fin;
        int total = 0;
        
        if(debut > 0 && fin < 7 || debut > 17) {
        	total = temps;
        }
        else if(debut > 7 && fin < 17) {
        	total = 2*temps;
        }
        else if(debut > 0 && fin > 7 && fin < 17) {
        	total = (7 - debut) + 2*(fin - 7);
        }

        else if(debut > 7 && debut < 17 && fin > 17) {
        	total = 2*(debut - 7) + (fin - 17);
        }
        else if(debut < 7 && fin > 17) {
        	total = (7 - debut) + 20 + (fin - 17);
        }
        */
        int tempsTarif1 = 0;
        int tempsTarif2 = 0;
        int tempsTot = debut - fin;
        
        if(0 < debut && debut < 7 && fin < 7) {
        	tempsTarif1 += tempsTot;
        }
        else if(debut > 17) {
        	tempsTarif1 += tempsTot;
        }
        else if(debut > 7 && fin < 17) {
        	tempsTarif2 += tempsTot;
        }
        else if(debut < 7 && fin > 7 && fin < 17) {
        	tempsTarif1 += 7-debut;
        	tempsTarif2 += fin - 7;
        }
        else if(debut > 7 && debut < 17 && fin > 17) {
        	tempsTarif1 += fin - 17;
        	tempsTarif2 += debut - 7;
        }
        else if(debut < 7 && fin > 17) {
        	tempsTarif1 += 7 - debut;
        	tempsTarif2 += fin - 17;
        }
        
        int payer = tempsTarif1 + 2*tempsTarif2;
        
        
        
        System.out.println("Vous avez loué votre vélo pendant");
        System.out.println(tempsTarif1 +"heure(s) au tarif horaire de 1.0 francs");
        System.out.println(tempsTarif2 +"heure(s) au tarif horaire de 2.0 francs");
        System.out.print("Le montant total à payer est de "+ payer + "francs(s)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
