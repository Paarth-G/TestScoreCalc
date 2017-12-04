import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**In this window, you tell the computer which test you want to get the score of. 
 * @author paarthgarg
 * @version 1.0 (Without ACT Working)*/
public class WhichTestGUI extends JFrame{

	/**Default Constructor: In this window, you tell the computer which test you want to get the score of.*/
	public WhichTestGUI(){
		createUI();
	}
	
	/**This method creates the User Interface which will have all the visual components of the window*/
	private void createUI(){
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(153,153,255));
		
		JLabel TitleJL = new JLabel("Which test did you take?");
		TitleJL.setFont(new Font("Trebuchet MS",Font.BOLD,25));
		TitleJL.setHorizontalAlignment(JLabel.CENTER);
		TitleJL.setBounds(10,10,300,30);
		contentPane.add(TitleJL);
		
		JButton ACTJB = new JButton("ACT");
		ACTJB.setBounds(15,50,145,60);
		contentPane.add(ACTJB);
		ACTJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JOptionPane.showMessageDialog(null, "That option is not yet available","Beta",JOptionPane.PLAIN_MESSAGE);	
			}
		});
		
		JButton SATJB = new JButton("SAT");
		SATJB.setBounds(160,50,145,60);
		contentPane.add(SATJB);
		SATJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				SATGUI window = new SATGUI();
				window.setLocation(330, 0);
			}
		});
		
		setTitle("Score Calculator");
		setSize(320,150);
		setVisible(true);
	}
	
}
