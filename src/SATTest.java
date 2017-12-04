/**This is the SAT Test Object; this has all the methods and values an SAT test has.*/
public class SATTest {
	
	/**Numbers of questions the user got correct in all the sections*/
	private int Reading, Writing, MathNC, Math;
	
	/**Default Constructor: This is the SAT Test Object*/
	public SATTest(){
		setReading(0);
		setWriting(0);
		setMathNC(0);
		setMathWC(0);
	}
	
	/**Overloaded Constructor: This is the SAT Test Object
	 * @param Reading Score 
	 * @param Writing Score 
	 * @param Math No Calc Score 
	 * @param Math Calc Score*/
	public SATTest(int r, int w, int mnc, int mwc){
		setReading(r);
		setWriting(w);
		setMathNC(mnc);
		setMathWC(mwc);
	}
	
	/**For when you need to use the raw reading score*/
	public int getReading(){
		return Reading;
	}
	
	/**Set the raw reading score*/
	public void setReading(int s){
		Reading = s;
	}
	
	/**For when you need to use the raw writing score*/
	public int getWriting(){
		return Writing;
	}
	
	/**Set the raw writing score*/
	public void setWriting(int s){
		Writing = s;
	}
	
	/**For when you need to use the raw Math No Calc Score*/
	public int getMathNC(){
		return MathNC;
	}
	
	/**Set the raw math No Calc score*/
	public void setMathNC(int s){
		MathNC = s;
	}
	
	/**For when you need to use the raw Math Calc Score*/
	public int getMathWC(){
		return Math;
	}
	
	/**Set the raw Math Calc score*/
	public void setMathWC(int s){
		Math = s;
	}
	
	/**This uses the scoring chart values to find the reading score*/
	private int getReadingScore(){
		switch(getReading()){
		case 0:  return 10; case 1:  return 10; case 2:  return 10; case 3:  return 11; case 4:  return 12; case 5:  return 13; case 6:  return 14; 
		case 7:  return 15; case 8:  return 15; case 9:  return 16; case 10: return 17; case 11: return 17; case 12: return 18; case 13: return 19; 
		case 14: return 19; case 15: return 20; case 16: return 20; case 17: return 21; case 18: return 21; case 19: return 22; case 20: return 22; 
		case 21: return 23; case 22: return 23; case 23: return 24; case 24: return 24; case 25: return 25; case 26: return 25; case 27: return 26; 
		case 28: return 26; case 29: return 27; case 30: return 28; case 31: return 28; case 32: return 29; case 33: return 29; case 34: return 30; 
		case 35: return 30; case 36: return 31; case 37: return 31; case 38: return 32; case 39: return 32; case 40: return 33; case 41: return 33; 
		case 42: return 34; case 43: return 35; case 44: return 35; case 45: return 36; case 46: return 37; case 47: return 37; case 48: return 38; 
		case 49: return 38; case 50: return 39; case 51: return 40; case 52: return 40; default: return 10;
		}
	}
	
	/**This uses the scoring chart vlues to find the reading score*/
	private int getWritingScore(){	
		switch(getWriting()){
		case 0:  return 10; case 1:  return 10; case 2:  return 10; case 3:  return 10; case 4:  return 11; case 5:  return 12; case 6:  return 13; 
		case 7:  return 13; case 8:  return 14; case 9:  return 15; case 10: return 16; case 11: return 16; case 12: return 17; case 13: return 18; 
		case 14: return 19; case 15: return 19; case 16: return 20; case 17: return 21; case 18: return 21; case 19: return 22; case 20: return 23; 
		case 21: return 23; case 22: return 24; case 23: return 25; case 24: return 25; case 25: return 26; case 26: return 26; case 27: return 27; 
		case 28: return 28; case 29: return 28; case 30: return 29; case 31: return 30; case 32: return 30; case 33: return 31; case 34: return 32; 
		case 35: return 32; case 36: return 33; case 37: return 34; case 38: return 34; case 39: return 35; case 40: return 36; case 41: return 37; 
		case 42: return 38; case 43: return 39; case 44: return 40; default: return 10;
		}
	}
	
	/**This is the final English Score (from 200 to 800)*/
	public int getEnglishScore(){
		return 10 * (getReadingScore() + getWritingScore());
	}
	
	/**This is the final Math Score (from 200 to 800)*/
	public int getMathScore(){
		int MathRawScore = getMathNC()+getMathWC();
		
		switch(MathRawScore){
		case 1:  return 200; case 2:  return 200; case 3:  return 210; case 4:  return 230; case 5:  return 260; case 6:  return 280; case 7:  return 290;
		case 8:  return 310; case 9:  return 320; case 10: return 330; case 11: return 340; case 12: return 360; case 13: return 370; case 14: return 380;
		case 15: return 390; case 16: return 410; case 17: return 420; case 18: return 430; case 19: return 440; case 20: return 450; case 21: return 460;
		case 22: return 470; case 23: return 480; case 24: return 480; case 25: return 490; case 26: return 500; case 27: return 510; case 28: return 520;
		case 29: return 520; case 30: return 530; case 31: return 540; case 32: return 550; case 33: return 560; case 34: return 560; case 35: return 570;
		case 36: return 580; case 37: return 590; case 38: return 600; case 39: return 600; case 40: return 610; case 41: return 620; case 42: return 630;
		case 43: return 640; case 44: return 650; case 45: return 660; case 46: return 670; case 47: return 670; case 48: return 680; case 49: return 690;
		case 50: return 700; case 51: return 710; case 52: return 730; case 53: return 740; case 54: return 750; case 55: return 760; case 56: return 780;
		case 57: return 790; case 58: return 800; default: return 200;
		}
	}

	/**This is the Final Score for the entire exam (400 to 1600)*/
	public int getFinalScore(){
		return this.getEnglishScore()+this.getMathScore();
	}
}
