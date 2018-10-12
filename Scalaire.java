/*
 *	Author:      Rafael Ramirez
 *	Date:        Oct 12, 2018
 */
import java.util.Scanner;
public class Scalaire {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int nMax = 10;
		double[] v1 = new double[nMax];
		double[] v2 = new double[nMax];
		int n;
		do {
		System.out.println("combien de composantes a chaque vecteur? (max 10)");
		n = input.nextInt();
		}while(n < 0 || n > 10);
		for(int j= 0; j<n; ++j) {
			System.out.println("quelle est la valeur de la composante " + (j+1) + " du vecteur a ?");
			v1[j] = input.nextDouble();
		}
		for(int j= 0; j<n; ++j) {
			System.out.println("quelle est la valeur de la composante " + (j+1) + " du vecteur b ?");
			v2[j] = input.nextDouble();
		}
		double resultat = 0;
		for(int j = 0; j<n;++j) {
			resultat += v1[j]*v2[j];
		}
		System.out.println("Le resultat du produit scalaire entre a et b est: " + resultat);
	}
}
