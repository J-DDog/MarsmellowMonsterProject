package marshmallow.view;

import javax.swing.JOptionPane;

/**
 * Class for outputting using Popups
 * @author jker3169
 *
 */
public class MarshmallowPopup
{
	
	/**
	 * Used to show a message to the user Via JOptionPane
	 * @param message The message that you want to display
	 */
	public void showMessage(String message)
	{
		JOptionPane.showMessageDialog(null,message);
	}
	
	public String grabAnswer(String query)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, query);
		
		return answer;
	}
	
}
