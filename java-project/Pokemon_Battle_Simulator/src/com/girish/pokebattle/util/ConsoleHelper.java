/**
 * 
 */
package com.girish.pokebattle.util;
import com.girish.pokebattle.service.*;
import java.util.Scanner;
/**
 * 
 */
public class ConsoleHelper {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);
	Player player1;
	Player player2;
	
	public void intro() {
		System.out.println("__________________________________________________________");
		System.out.println("|                                                        |");
		System.out.println("|        W E L C O M E   T O   T H E   W O R L D         |");
		System.out.println("|                O F   P O K E M O N !                   |");
		System.out.println("|________________________________________________________|");
		System.out.println("");
		System.out.println("Hello there! Welcome to the world of Pokemon!");
		System.out.println("My name is Oak! People call me the Pokemon Prof!");
		System.out.println("");
		System.out.println("This world is inhabited by creatures called Pokemon!");
		System.out.println("For some people, Pokemon are pets. Others use them for fights.");
		System.out.println("Myself... I study Pokemon as a profession.");
		System.out.println("");
		System.out.println("But enough about me. Today, two young trainers will battle");
		System.out.println("to test their skills and bond with their partners.");
		System.out.println("__________________________________________________________");
		System.out.println("");
		
		try { Thread.sleep(2000); } catch (InterruptedException e) { }
	}
	
	public void printGameRules() {
	    System.out.println("\n----------------------------------------------------------");
	    System.out.println("                     G A M E   R U L E S                  ");
	    System.out.println("----------------------------------------------------------");
	    System.out.println("1. OBJECTIVE: Reduce your opponent's HP to 0 to win.");
	    System.out.println("2. TURN-BASED: Players take turns selecting moves.");
	    System.out.println("3. SPEED MATTERS: The Pokemon with higher Speed attacks first!");
	    System.out.println("4. MOVES:");
	    System.out.println("   [1] Basic Attack (Normal Type) - Reliable damage.");
	    System.out.println("   [2] Special Attack (Elemental) - High risk, high reward!");
	    System.out.println("       (Watch out for Type Advantages like Water vs Fire!)");
	    System.out.println("----------------------------------------------------------\n");
	    
	    
	    try { Thread.sleep(2000); } catch (InterruptedException e) { }
	}
	
	public void playerName() {
		System.out.print("Enter first player name - ");
		player1.name = sc.nextLine();
		System.out.println("Enter second player name - ");
		player2.name = sc.nextLine();
	}
	
	public void selectPokemon() {
		
	}
	
}
