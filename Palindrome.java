/*
 *	Author:      Rafael Ramirez
 *	Date:        Oct 12, 2018
 */
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entrez un mot ou une phrase :");
		String phrase = input.nextLine();
		String new_phrase = "";
		for(int n = 0; n< phrase.length(); ++n) {
			if(Character.isLetter(phrase.charAt(n))) {
				new_phrase += phrase.charAt(n);
			}
		}
		boolean Palindrome = true;
		for(int j = 0; j< new_phrase.length(); ++j) {
			if(new_phrase.charAt(j) != new_phrase.charAt(phrase.length()-1-j)) {
				Palindrome = false;
			}
		}
		if(Palindrome) {
			System.out.println("C'est un palindrome!");
		}
		else {
			System.out.println("Ce n'est pas un palyndrome!");
		}
	}
		
}
