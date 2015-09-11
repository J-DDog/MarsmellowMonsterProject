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

	public void printMonster()
	{
		System.out.println("This is my Monster.");
		System.out.println("His name is " + monsterName);
		System.out.println("He has " + monsterEyes + " Eyes, " + monsterNoses + " Noses,\nSadly he only has " + monsterHair + " Hairs On his head");
		System.out.println("To Make up for it he has " + monsterLegs + " Legs, And to cap it all off, He has " + monsterAntenna + " Antennas");
	}
}
