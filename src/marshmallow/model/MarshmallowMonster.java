package marshmallow.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	private int monsterAntenna;
	
	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton, int monsterAntenna)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterAntenna = monsterAntenna;
		
	}
	
	//Getters & Setters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonstEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public int getMonsterAntenna()
	{
		return monsterAntenna;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int mnonsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNoses(int Noses)
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterAntenna(int monsterAntenna)
	{
		this.monsterAntenna = monsterAntenna;
	}
	
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}

	public void printMonster()
	{
		System.out.println("This is my Monster.");
		System.out.println("His name is " + monsterName);
		System.out.println("He has " + monsterEyes + " Eyes, " + monsterNoses + " Noses,\nSadly he only has " + monsterHair + " Hairs On his head");
		System.out.println("To Make up for it he has " + monsterLegs + " Legs, And to cap it all off, He has " + monsterAntenna + " Antennas");
		System.out.println();
		
	}
	
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + " eyes, and its' name is " + monsterName;
		
		return monster;
		
	}
	
}
