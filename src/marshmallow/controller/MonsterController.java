package marshmallow.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster UserMonster;
	private MarshmallowMonster JaredMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		
		int eyes = 3;
		double legs = 7.5;
		double hair = 2.5;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Jarinator";
		int antenna = 5;
		monsterScanner = new Scanner(System.in);
		
		JaredMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton, antenna);
		myOutput = new MarshmallowOutput();
		
	}
	
	public void start()
	{
		myOutput.displayAnyText("yo Hows it going? ");
		myOutput.displayMonsterConsole(JaredMonster.toString());
		myOutput.displayMonsterGUI(JaredMonster.toString());
		makeUserMonster();
		//myOutput.displayMonsterGUI("new Monster Info" + UserMonster.toString());
		//myOutput.displayMonsterHair(UserMonster.getMonsterHair());
		
	}
	
	private void askQuestions()
	{
		
		System.out.print("Whats the Monsters new name?: ");
		JaredMonster.setMonsterName(monsterScanner.next());
		System.out.println();
		System.out.print("How many Eyes does the Monster Have?: ");
		JaredMonster.setMonsterEyes(monsterScanner.nextInt());
		System.out.println();
		System.out.print("How many Noses does the Monster Have?: ");
		JaredMonster.setMonsterNoses(monsterScanner.nextInt());
		System.out.println();
		System.out.print("How many Hairs does the Monster Have?: ");
		JaredMonster.setMonsterHair(monsterScanner.nextInt());
		System.out.println();
		System.out.print("How many Legs does the Monster Have?: ");
		JaredMonster.setMonsterLegs(monsterScanner.nextInt());
		System.out.println();
		System.out.print("Does the Monster Have a Belly button?: ");
		JaredMonster.setMonsterBellyButton(monsterScanner.nextBoolean());
	}
	
	/*
	 * This Methoud will Take information from the user to make an instance of 
	 */
	private void makeUserMonster()
	{
		//Step one: Get Variables
		String userName;
		int userEyes;
		int userNoseCount;
		int userAntenna;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define variables by the using Scanner to get user input.
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.next();
		monsterScanner.nextLine();
		
		System.out.println("Type in the number of eyes for your monster.");
		userEyes = monsterScanner.nextInt();
		monsterScanner.nextLine();
		
		System.out.println("Type in the number of noses for this monster.");
		userNoseCount = monsterScanner.nextInt();
		monsterScanner.nextLine();
		
		System.out.println("Type in the number of Antennas this monster has.");
		userAntenna = monsterScanner.nextInt();
		monsterScanner.nextLine();
		
		System.out.println("How much hair does your monster have? Type in a floating pint or a double.");
		userHair = monsterScanner.nextDouble();
		monsterScanner.nextLine();
		
		System.out.println("How many Legs??????");
		userLegs = monsterScanner.nextDouble();
		monsterScanner.nextLine();
		
		System.out.println("Does it have a bellyButton? Type true of false");
		userBellyButton = monsterScanner.nextBoolean();
		monsterScanner.nextLine();
		
		//Step three; Make a monster - use the Constructor!!! Reminder that order of parameters matters!!
		UserMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton, userAntenna);
		
		
	}
}
