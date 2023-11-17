package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		//Declaring variables
		Scanner in = new Scanner(System.in);
		List<Gift> wishlist = new ArrayList<>();
		String risposta;
		String regalo;
		String destinatario;
		
		
		
		
		//Main logic
       while(true) {
    	   
    	   System.out.println("Vuoi inserire un regalo? (si / no)");
    	   risposta = in.nextLine().toLowerCase();
    	   
    	   
    	   //Check the answer
    	   if(risposta.equals("no"))
    		   break;
    		   
    	   
    	   System.out.println("Inserisci il nome del regalo: ");
    	   regalo = in.nextLine();
    	   
    	   System.out.println("Inserisci il destinatario: ");
    	   destinatario = in.nextLine();
    	   
    	   
    	   Gift gift = new Gift(regalo, destinatario);
    	   wishlist.add(gift);
    	  
       }
		
       /* NO Bonus
       System.out.println("\nLista dei regali:");
       for (Gift gift : wishlist) {
           System.out.println(gift);
       } */
		
        
     //Choose the order BONUS
        System.out.print("Come vuoi ordinare la lista? (nome/destinatario): ");
        String orderChoice = in.nextLine();

        // Su google ho trovato questo per ordinare un oggetto all'interno di un ArrayList, non so se andava fatto così
        // ma non sono riuscito a trovare altro.
        if (orderChoice.equalsIgnoreCase("nome")) { 
            wishlist.sort(Comparator.comparing(Gift::getRegalo));
        } else if (orderChoice.equalsIgnoreCase("destinatario")) {
            wishlist.sort(Comparator.comparing(Gift::getDestinatario));
        }

        
        
        System.out.println("\nLista dei regali:");
        for (Gift gift : wishlist) {
        	
            System.out.println(gift);
            
        }
        
		
		in.close();
		
	}
	
	
	
}
