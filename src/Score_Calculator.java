import javax.swing.JFrame;

/**This app gives you the score of an SAT or ACT Test after you enter the numbers of questions you got right.
 * @author paarthgarg
 * @version 1.0 (ACT doesn't work)*/
public class Score_Calculator {

	/**Main method*/
	public static void main(String[] args) {
		WhichTestGUI app = new WhichTestGUI();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//SATGUI app2 = new SATGUI();
		//app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
