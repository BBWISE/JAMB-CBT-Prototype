import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Actions extends Graphic implements ActionListener {
	
	
	//static Key_Listener kl = new Key_Listener();
	
	
	static Graphic interfaces = new Graphic();
	Functions func = new Functions();
	
	public void actionPerformed (ActionEvent event) {
		
		if(event.getSource()==credits) {
			JOptionPane.showMessageDialog(null, "       This software was designed and developed by\n"
					+ "\n"
					+ "                                      ©B.B.WiSE;\n"
					+ "           Tel: +2348156212712   /   +2348178077302;\n"
					+ "        e-mail: bayodeblessingakinbola@gmail.com;\n"
					+ "\n"
					+ "\n"
					+ "             List of the accepted registration numbers:\n"
					+ "Sci: 10136948BE | Art: 10398279AD | Com: 10297493FC         ");
		}
		else if (event.getSource()==loginBtt) {
			func.CandidateLogin(regNumberText.getText().toUpperCase());
			rg = regNumberText.getText().toUpperCase();
			regNumberText.setText("");
			
		//	this.addKeyListener(kl);
		}
		else if (event.getSource()==scfirstLogout) {
			CenterCard.show(centerPanel, "First Page");
		}
		else if (event.getSource()==atfirstLogout) {
			CenterCard.show(centerPanel, "First Page");
		}
		else if (event.getSource()==subLogout) {
			CenterCard.show(centerPanel, "First Page");
		}
		else if (event.getSource()==cofirstLogout) {
			CenterCard.show(centerPanel, "First Page");
		}
		
		else if (event.getSource()==scStart) {
			func.scienceTest();
			
			thread = new Thread(sw);
			
			thread.start();
		}
		else if (event.getSource()==artStart) {
			func.artsTest();
			
			ArtStopwatch sw = new ArtStopwatch();
			thread = new Thread(sw);
			thread.start();
		}
		else if (event.getSource()==coStart) {
			func.commercialTest();
			
			ComStopwatch sw = new ComStopwatch();
			thread = new Thread(sw);
			thread.start();
		}
		
		
		else if (event.getSource()==scienceEngButt) {
			if(thread.isAlive()) {
			scSubjectCard.show(scSubjectPanel, "English");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==scienceCheButt) {
			if(thread.isAlive()) {
			scSubjectCard.show(scSubjectPanel, "Chemistry");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==scienceMatButt) {
			if(thread.isAlive()) {
			scSubjectCard.show(scSubjectPanel, "Mathematics");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==scienceBioButt) {
			if(thread.isAlive()) {
			scSubjectCard.show(scSubjectPanel, "Biology");
		}
		else {
			exitor();
		}
		}
		else if (event.getSource()==artsEngButt) {
			if(thread.isAlive()) {
			atSubjectCard.show(atSubjectPanel, "English");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==GovButt) {
			if(thread.isAlive()) {
			atSubjectCard.show(atSubjectPanel, "Government");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==LitButt) {
			if(thread.isAlive()) {
			atSubjectCard.show(atSubjectPanel, "Literature");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==CivButt) {
			if(thread.isAlive()) {
			atSubjectCard.show(atSubjectPanel, "Civic");
			}
			else {
				exitor();
			}
		}
		
		else if (event.getSource()==commercialEngButt) {
			if(thread.isAlive()) {
			coSubjectCard.show(coSubjectPanel, "English");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==EcoButt) {
			if(thread.isAlive()) {
			coSubjectCard.show(coSubjectPanel, "Economics");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==AccButt) {
			if(thread.isAlive()) {
			coSubjectCard.show(coSubjectPanel, "Accounting");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==MarButt) {
			if(thread.isAlive()) {
			coSubjectCard.show(coSubjectPanel, "Marketing");
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==scPrevious) {
			
			if(thread.isAlive()) {
				enSubjectCard.previous(enSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==scNext) {
			if(thread.isAlive()) {
				enSubjectCard.next(enSubjectPanel);
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==BscPrevious) {
			
			if(thread.isAlive()) {
				BSubjectCard.previous(BSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==BscNext) {
			if(thread.isAlive()) {
				BSubjectCard.next(BSubjectPanel);
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==ChscPrevious) {
			
			if(thread.isAlive()) {
				ChSubjectCard.previous(ChSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==MatscPrevious) {
			
			if(thread.isAlive()) {
				MatSubjectCard.previous(MatSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==MatscNext) {
			
			if(thread.isAlive()) {
				MatSubjectCard.next(MatSubjectPanel);
			}
			else {
				exitor();
			}
			
		}

		else if (event.getSource()==GovPrevious) {
			
			if(thread.isAlive()) {
				GovSubjectCard.previous(GovSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==GovNext) {
			
			if(thread.isAlive()) {
				GovSubjectCard.next(GovSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		
		else if (event.getSource()==EcoPrevious) {
			
			if(thread.isAlive()) {
				EcoSubjectCard.previous(EcoSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==EcoNext) {
			
			if(thread.isAlive()) {
				EcoSubjectCard.next(EcoSubjectPanel);
			}
			else {
				exitor();
			}
		}
		
		else if (event.getSource()==MarPrevious) {
			
			if(thread.isAlive()) {
				MarSubjectCard.previous(MarSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==MarNext) {
			
			if(thread.isAlive()) {
				MarSubjectCard.next(MarSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==AccPrevious) {
			
			if(thread.isAlive()) {
				AccSubjectCard.previous(AccSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==AccNext) {
			
			if(thread.isAlive()) {
				AccSubjectCard.next(AccSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		
		else if (event.getSource()==ChscNext) {
			if(thread.isAlive()) {
				ChSubjectCard.next(ChSubjectPanel);
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==coPrevious) {
			
			if(thread.isAlive()) {
				coenSubjectCard.previous(coenSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==coNext) {
			
			if(thread.isAlive()) {
				coenSubjectCard.next(coenSubjectPanel);
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==LitPrevious) {
			
			if(thread.isAlive()) {
				LitSubjectCard.previous(LitSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==LitNext) {
			
			if(thread.isAlive()) {
				LitSubjectCard.next(LitSubjectPanel);
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==CivPrevious) {
			
			if(thread.isAlive()) {
				CivSubjectCard.previous(CivSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==CivNext) {
			
			if(thread.isAlive()) {
				CivSubjectCard.next(CivSubjectPanel);
			}
			else {
				exitor();
			}
		}
		else if (event.getSource()==arPrevious) {
			
			if(thread.isAlive()) {
				atenSubjectCard.previous(atenSubjectPanel);
			}
			else {
				exitor();
			}
			
		}
		else if (event.getSource()==arNext) {
			
			if(thread.isAlive()) {
				atenSubjectCard.next(atenSubjectPanel);
			}
			else {
				exitor();
			}
		}
		
		else if (event.getSource()==scSubmit) {
			interfaces.submitPop();
		}
		else if (event.getSource()==arSubmit) {
			interfaces.submitPop();
		}
		else if (event.getSource()==coSubmit) {
			interfaces.submitPop();
		}
		else if (event.getSource()==artSubmit1Butt) {
			interfaces.submitPop();
		}
		else if (event.getSource()==scienceSubmit1Butt) {
			interfaces.submitPop();
		}
		else if (event.getSource()==commercialSubmit1Butt) {
			interfaces.submitPop();
		}
		
		
	}

}
