package nbPremier;
import java.util.Scanner;


public class vue {
	public void afficherVue() {
		controleur con = new controleur();
		Scanner sc = new Scanner(System.in);
		boolean continuer = true;

		while (continuer == true) {
			System.out.println("Menu : \n"
					+ "1: Test Nombre premier \n"
					+ "2: Test Racine carrée \n"
					+ "3: Fin ");
			System.out.println("Veuillez choisir un menu en entrant le numéro du menu :");
			int m = sc.nextInt();
			
		if(m==1){
			
			System.out.println("Veuillez entrez un nombre :");
			int a = sc.nextInt();


			if(con.testNbPremier(a) == true) {
				System.out.println(a + " n'est pas un nombre premier");
			} else {
				System.out.println(a + " est un nombre premier");
			}
		}
		if(m==2){
			System.out.println("Veuillez entrez un nombre :");
			float a = sc.nextFloat();
			
			System.out.println(con.testY(a));
		}
			System.out.println("Voulez vous continuez ?, tapez oui ou non");
			String reponse = new Scanner(System.in).nextLine();

			if(reponse.equals("oui")) {
				continuer = true;
			} else {
				continuer = false;
				System.out.println("Fin");		
			}
		}
	}
	
}
