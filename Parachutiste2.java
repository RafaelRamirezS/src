import java.util.Scanner;

class Parachutiste2 {

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
        double g = 9.81;
        double v0 = 0;
        double t0 = 0;
        
        double vitesse = v0;
        double accel = g;
        double hauteur = h0;
        double t = t0;
        double surface = 2.0;
        double s;
        double q;
        
        boolean vitesseson = true;
        boolean accelmax = true;
        boolean parachute = true;
        
        while (hauteur > 0) {
        	s = surface/masse;
        	q = Math.exp(-s*(t-t0));
        	vitesse = (g/s) * (1 - q) + v0*q;
        	hauteur = h0 - (g/s) * (t- t0) - ((v0 - (g/s))/s)*(1-q);
        	accel = g - s*vitesse;
        	if (vitesse > 343 && vitesseson) {
        		System.out.println("## Felix depasse la vitesse du son");
        		vitesseson = false;
        	}
        	if (accel < 0.5 && accelmax) {
        		System.out.println("## Felix a atteint sa vitesse maximale");
        		accelmax = false;
        	}
        	if (hauteur < 2500 && parachute && t > 0) {
        		surface = 25;
        		t0 = t;
        		v0 = vitesse;
        		h0 = hauteur;
        		System.out.println("## Felix ouvre son parachute");
        		parachute = false;
        	}
        	if (hauteur > 0) {
        		System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                        t, hauteur, vitesse, accel);
            	t += 1;
        	}
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}