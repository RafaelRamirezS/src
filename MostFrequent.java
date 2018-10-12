class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int[] plus_grand = new int[2];
        int compteur = 0;
        
        for(int j = 0; j < taille; ++j) {
        	int actuel = tab1[j];
        	compteur = 0;
        	
        	for(int m = 0; m< taille; ++m) {
        		
        		if(actuel == tab1[m]) {
        			compteur++;
        		}
        	}
        	
        	if(compteur > plus_grand[1]) {
        		plus_grand[0] = actuel;
        		plus_grand[1] = compteur;
        	}
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le :\n" + plus_grand[0] + " (" + plus_grand[1] + " x)"); 

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}

