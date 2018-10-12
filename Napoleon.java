/*
 *	Author:      Rafael Ramirez
 *	Date:        Oct 12, 2018
 */
import java.util.Scanner;
public class Napoleon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String noms = "Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis ";
		System.out.println("Entrez un Prénom : ");
		String prenom_input = input.nextLine();
		
		if(noms.indexOf(prenom_input) < 0) {
			System.out.println("Inconnu au Bataillon!");
		}
		else {
			int debut_nom = noms.indexOf(' ', noms.indexOf(prenom_input)) + 1;
			int fin_nom = noms.indexOf(' ', debut_nom);
			String nom = noms.substring(debut_nom, fin_nom);
			System.out.println(nom);
		}
	}
}
