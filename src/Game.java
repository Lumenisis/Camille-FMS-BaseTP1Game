/*
 * Programme demandant à l'utilisateur s'il souhaite jouer à notre jeu
 * Si non alors sortir du programme
 * Si oui alors proposer de saisir un chiffre entre 1 et 100
 * Et dire à chaque itération si le chiffre est plus petit ou plus grand
 * Une fois le chiffre trouvé, afficher un message : vous avez trouvé en x coups !
 * Puis rendre le jeu permanent tant que le joueur veut jouer, il doit pouvoir continuer
 */

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		// Scanner creation
		Scanner scan = new Scanner(System.in);
		
		// Question
        System.out.println("Est-ce que vous souhaitez essayer le jeu ? o/n");
        String userInput = scan.nextLine();
        
        // Game launch
        while (userInput.equals("o")) {
	        System.out.println("Votre choix est oui, lancement du programme"); 
	        
	        // Generation of a random number
	        int numComputer = (int)(Math.random() * 100 + 1);
	        
	        // User tries counter
	        int counter = 0;
	        
	        // User trials
	        int userTry = 0;    
	        
	        // Beginning the game
	        while (userTry != numComputer) {
	        	
	        	// Question
	            System.out.println("Entrez un nombre compris entre 1 et 100 : ");
	            userTry = scan.nextInt();
	            
	            // Increment of user tries counter
	        	counter = counter + 1; 
	        	
	        	// Comparison
	        	if (userTry > 100) {
	        		System.out.println("Erreur votre saisie est incorrecte");
	        	}
	        	else if (userTry > numComputer) {
	        		System.out.println("Le nombre est plus petit que " + userTry);
	        	}
	        	else if (userTry < numComputer) {
	        		System.out.println("Le nombre est plus grand que " + userTry);
	        	}
	        	else if (userTry == numComputer) {
	        		System.out.println("Bravo vous avez trouvé le nombre !");
	        		System.out.println(counter + " coups pour trouver la réponse !");
	        	}
	        }
        }
        
        // Closing the program
    	System.out.println("Votre choix est non, fermeture du programme");
    	System.exit(0);
    	
		// Closing the scanner
		scan.close();
    }
}