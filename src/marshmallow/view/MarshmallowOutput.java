package marshmallow.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
		
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, "My monster info is: " + message);
		
	}
	
	public void displayMonsterHair(double monsterHair)
	{
		JOptionPane.showMessageDialog(null, "This Monsters has " + monsterHair + " Hairs on its head.");
		
	}
	
	public void displayAnyText(String text)
	{
		JOptionPane.showMessageDialog(null, text);
		
	}
	
	public String grabAnswer(String query)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, query);
		
		return answer;
	}
	
	public int grabAnswerInt(String query)
	{
		boolean isLoop = true;
		int info = 0;
		while (isLoop)
		{
			try 
			{
				info = Integer.parseInt(grabAnswer(query));
				isLoop = false;
			}
			catch(NumberFormatException error)
			{
				displayMessage("Error Not a Integer - try again");
			}
				
		}
		return info;
		
	}
	
	public double grabAnswerDouble(String query)
	{
		boolean isLoop = true;
		double info = 0;
		while (isLoop)
		{
			try 
			{
				info = Double.parseDouble(grabAnswer(query));
				isLoop = false;
			}
			catch(NumberFormatException error)
			{
				displayMessage("Error Not a Double - try again");
			}
				
		}
		return info;
		
	}
	
	public boolean grabAnswerBoolean(String query)
	{
		boolean isLoop = true, info = false;
		while (isLoop)
		{
			
		}
		
		return info;
	}
	
}
