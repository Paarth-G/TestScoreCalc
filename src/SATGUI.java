import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**This is where you enter the numbers you got right for an SAT Test
 * @author paarthgarg
 * @version 1.0*/
public class SATGUI extends JFrame{
	
	/**These integers are the numbers of questions the user got correct for each section*/
	private int ReadingScore, WritingScore, MathNCScore, MathScore;
	
	/**These are the field where the user enters the numbers of questions the user got correct for each section*/
	private JTextField EnterReadingJTF, EnterWritingJTF, MathNCJTF, MathJTF;
	
	/**These display the score the user got for each half of the exam*/
	private JLabel EnglishDisplayScoreJL, MathDisplayScoreJL, FinalDisplayScoreJL;
	
	/**Default Constructor: This is the window in which the user enters the numbers neccessary to obtain their score*/
	public SATGUI(){
		createUI();
	}
	
	/**This method creates the User Interface with all components of and in the window*/
	private void createUI(){
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		// English Scores
		JPanel EnglishJP = new JPanel();
		EnglishJP.setLayout(null);
		EnglishJP.setBounds(0, 0, 265, 110);
		EnglishJP.setBackground(new Color(255,153,153));
		EnglishJP.setBorder(new TitledBorder("English"));
		contentPane.add(EnglishJP);
			
			// Reading Score
			JLabel EnterReadingJL = new JLabel("Reading Questions Right:          /52");
			EnterReadingJL.setBounds(10, 30, 250, 20);
			EnglishJP.add(EnterReadingJL);
			
			EnterReadingJTF = new JTextField();
			EnterReadingJTF.setBounds(170,30,40,20);
			EnglishJP.add(EnterReadingJTF);
			
			// Writing Score
			JLabel EnterWritingJL = new JLabel("Writing Questions Right:           /44");
			EnterWritingJL.setBounds(10,60,250,20);
			EnglishJP.add(EnterWritingJL);
			
			EnterWritingJTF = new JTextField();
			EnterWritingJTF.setBounds(170, 60, 40, 20);
			EnglishJP.add(EnterWritingJTF);
		
		
		// Math Scores
		JPanel MathJP = new JPanel();
		MathJP.setLayout(null);
		MathJP.setBounds(265, 0, 265, 110);
		MathJP.setBackground(new Color(153,204,255));
		MathJP.setBorder(new TitledBorder("Math"));
		contentPane.add(MathJP);
		
			// No Calc Score
			JLabel MathNCJL = new JLabel("No Calc. Questions Right:          /20");
			MathNCJL.setBounds(10, 30, 250, 20);
			MathJP.add(MathNCJL);
			
			MathNCJTF = new JTextField();
			MathNCJTF.setBounds(170,30,40,20);
			MathJP.add(MathNCJTF);
			
			// Math With Calc Score
			JLabel MathJL = new JLabel("W/ Calc Questions Right:           /38");
			MathJL.setBounds(10,60,250,20);
			MathJP.add(MathJL);
			
			MathJTF = new JTextField();
			MathJTF.setBounds(170, 60, 40, 20);
			MathJP.add(MathJTF);
			
		// Get Score Button
		JButton GetScoreJB = new JButton("Get Score");
		GetScoreJB.setBounds(0, 110, 530, 50);
		contentPane.add(GetScoreJB);
		GetScoreJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				getScore();
			}
		});
		
		// Display Score JPanel
		JPanel DisplayScore = new JPanel();
		//DisplayScore.setLayout(null);
		DisplayScore.setBounds(0, 160, 530, 65);
		DisplayScore.setBackground(new Color(217,179,255));
		DisplayScore.setBorder(new TitledBorder("Score"));
		contentPane.add(DisplayScore);
		
		JLabel EnglishDisplayJL = new JLabel("English:");
		DisplayScore.add(EnglishDisplayJL);
		
		EnglishDisplayScoreJL = new JLabel();
		EnglishDisplayScoreJL.setFont(new Font("Calibri",Font.BOLD,12));
		DisplayScore.add(EnglishDisplayScoreJL);
		
		JLabel MathDisplayJL = new JLabel("\tMath:");
		DisplayScore.add(MathDisplayJL);
		
		MathDisplayScoreJL = new JLabel();
		MathDisplayScoreJL.setFont(new Font("Calibri",Font.BOLD,12));
		DisplayScore.add(MathDisplayScoreJL);
		
		JLabel FinalDisplayJL = new JLabel("\tFinal:");
		DisplayScore.add(FinalDisplayJL);
		
		FinalDisplayScoreJL = new JLabel();
		FinalDisplayScoreJL.setFont(new Font("Calibri",Font.BOLD,12));
		DisplayScore.add(FinalDisplayScoreJL);
		
		// Dimensions of the Window
		this.setTitle("Enter the following numbers");
		this.setSize(530,180);
		this.setVisible(true);
	}
	
	/**This method uses the values entered by the user and creates and SAT Test which will calculate the score*/
	private void getScore(){
		try{
			ReadingScore = Integer.parseInt(EnterReadingJTF.getText());
			WritingScore = Integer.parseInt(EnterWritingJTF.getText());
			MathNCScore  = Integer.parseInt(MathNCJTF.getText());
			MathScore    = Integer.parseInt(MathJTF.getText());
			
			if(ReadingScore<=52 && ReadingScore >= 0 && WritingScore<= 44 && WritingScore>=0 && MathNCScore<= 20 && MathNCScore >= 0 && MathScore<=38 
			&& MathScore >=0){
				
				SATTest UserTest = new SATTest(ReadingScore, WritingScore, MathNCScore, MathScore);
				setSize(530,248);
				
				EnglishDisplayScoreJL.setText(String.valueOf(UserTest.getEnglishScore()));
				MathDisplayScoreJL.setText(String.valueOf(UserTest.getMathScore()));
				FinalDisplayScoreJL.setText(String.valueOf(UserTest.getFinalScore()));
				
				if(UserTest.getFinalScore() > 1450){
					System.out.println("Nice! :)");
				}
			}else
				JOptionPane.showMessageDialog(null, "Look at the numbers you entered. Something's wrong.","Fix Your Numbers",JOptionPane.ERROR_MESSAGE);
		}catch(Exception ecp){
			JOptionPane.showMessageDialog(null, "Look at the numbers you entered. Something's wrong.","Fix Your Numbers",JOptionPane.ERROR_MESSAGE);
		}
	}
}
