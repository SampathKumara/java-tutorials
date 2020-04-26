import javax.swing.*;

public class UserInput2{
	public static void main(String args[]){
		String input = JOptionPane.showInputDialog("Please Enter a Number:");
		JOptionPane.showMessageDialog(null,"You Entered: " + input);
	}
}