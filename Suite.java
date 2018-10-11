import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for(int n = debut; n <= fin; ++n) {
        	int nombre = n;
        	int repetition = 0;
        	do {
	        	if((nombre % 3) == 0) {
	        		nombre += 4;
	        		repetition++;
	        	}
	        	else if(nombre % 4 == 0) {
	        		nombre /= 2;
	        		repetition++;
	        	}
	        	else {
	        		--nombre;
	        		repetition++;
	        	}
        	} while(nombre > 0);
        	System.out.println(n + " -> " + repetition);
        }
        
        
        
        
        
        
        
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
