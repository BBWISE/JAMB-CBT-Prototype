
import javax.swing.*;

public class Functions {

	static Graphic graphic = new Graphic();
	static QuestionsClass questionClass = new QuestionsClass();
	
	public void loGin(String adminName, String psw) {
		
		if(adminName.equals("B.B. WiSE") && psw.equals("It is time")) {
			JOptionPane.showMessageDialog(null,"        You are welcome!");
			
			Graphic lOgin = new Graphic();
			
			lOgin.firstPage();
			lOgin.setTitle("JAMB Prototype");
			lOgin.setSize(1350,770);
			lOgin.setLocationRelativeTo(null);
			lOgin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lOgin.setResizable(true);
			lOgin.setVisible(true);
			
			JOptionPane.showMessageDialog(null,"                                        Candidates' Logins:\n"
					+ "\n"
					+ "                                Science:           10136948BE\n"
					+ "                                Arts:                  10398279AD\n"
					+ "                                Commercial:   10297493FC\n"
					+ "\n"
					+ "You can click on the name below ( ©B.B. WiSE ) for quick reminder.    ");
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect credentials.");
		}
				
	}
	
	
	public void CandidateLogin(String regNum) {
		String regCount [] = regNum.split("");
		
		if(regCount.length==10) {
			
			if(regNum.equals("10136948BE")) {
				graphic.ScienceProfilePage();
			}
			else if(regNum.equals("10398279AD")) {
				graphic.ArtsProfilePage();
			}
			else if(regNum.equals("10297493FC")) {
				graphic.CommercialProfilePage();
			}
			
			
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Your JAMB Registration Number must be Ten (10) in number.");
		}
	}
	
	public void scienceTest() {
		questionClass.scienceStart();
	}
	
	public void artsTest() {
		questionClass.artsStart();
	}
	
	public void commercialTest() {
		questionClass.commercialStart();
	}
	
	public void scSubmission() {
		
		
		graphic.submissionPage();
		
	}
	
	
	
	
	
	
}
