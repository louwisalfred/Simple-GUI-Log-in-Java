package ForPract;
import javax.swing.JOptionPane;
public class gui_intro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));		
		JOptionPane.showMessageDialog(null, "your age is: " +  age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
		JOptionPane.showMessageDialog(null,"Hello there! " + name + " your age is " + age + " your height is " + height + " cm tall");

	}

}
