/*
 *	Author:      Rafael Ramirez
 *	Date:        Oct 12, 2018
 */
import java.util.Scanner;
public class Pascal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quele est la taille de triangle ?");
		int taille = input.nextInt();
		
		int[][] triangle = new int[taille][taille];
		for(int j = 0; j<taille;++j) {
			triangle[j][0] = 1;
		}
		for(int j = 1; j < taille; ++j) {
			for(int n = 1; n< j+1; ++n) {
				triangle[j][n] = triangle[j-1][n-1] + triangle[j-1][n];
			}
		}
		for(int j = 0;j<taille;++j) {
			for(int n=0;n<taille;++n) {
				if(triangle[j][n] != 0)
				System.out.print(triangle[j][n]+ " ");
			}
			System.out.print("\n");
		}
	}
}
