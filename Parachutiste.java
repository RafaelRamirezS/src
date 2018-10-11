import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double G = 9.81;
        double v0 = 0;
        double t0 = 0;
        double vitesse = v0;
        double hauteur = h0;
        double accel = G;
        double surface = 2.0;
        double t = t0;
        double s = surface/masse;
         boolean vson = false;
        	while(hauteur > 0 ) {
        		while(vitesse < 343) {
        		System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                		t, hauteur, vitesse, accel);
        		++t;
        		double q = Math.exp(-s * (t - t0));
        		vitesse = (G/s) * (1 - q) + v0 * q;
        		hauteur = h0 - (G/s) * (t - t0) - ((v0 - (G/s)) / s) * (1 - q);
        		accel = G - (s * vitesse);
        		
        		
        	}
    		
        	

    		
    		System.out.println("## Felix a atteint sa vitesse maximale");
       
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}

