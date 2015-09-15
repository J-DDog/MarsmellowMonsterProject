package marshmallow.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
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
		JaredMonster.printMonster();
		myOutput.displayMonsterInfo(JaredMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info: " + JaredMonster.toString());
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
	
	
}
