package marshmallow.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallow.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster JaredMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		
		int eyes = 3;
		double legs = 7.5;
		double hair = 2.5;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Jarinator";
		int antenna = 5;
		
		JaredMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton, antenna);
		myOutput = new MarshmallowOutput();
		
	}
	
	public void start()
	{
		JaredMonster.printMonster();
		myOutput.displayMonsterInfo(JaredMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + JaredMonster.toString());
	}
	
	private void askQuestions()
	{
		
	}
	
}
