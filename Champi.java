import java.util.Scanner;
public class Champi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean answer1,answer2,answer3;
		
		
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cÃ¨pe de Bordeaux, coprin chevelu ou agaric jaunissant.");
	
		
		
		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		answer1 = input.nextBoolean();
		if(answer1) {
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			answer2 = input.nextBoolean();
			if(answer2) {
				System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
				answer3 = input.nextBoolean();
				if(answer3) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'amanite tue-mouches");
				}
				else {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'agaric jaunissant");
				}
			}
			else {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le coprin chevelu");
			}
		}
		else {
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			answer2 = input.nextBoolean();
			if(!answer2) {
				System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
				answer3 = input.nextBoolean();
				if(answer3) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("la girolle");
				}
				else {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le cèpe de Bordeaux");
				}
			}
			else {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le pied bleu");
			}
		}
	}	
}
