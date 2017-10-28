import javax.swing.JFrame;

public class SuDalgasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame pencere = new JFrame("Program");
		Panel panel1 = new Panel();
		pencere.addKeyListener(panel1);
		pencere.add(panel1);
		pencere.setSize(640, 480);
		pencere.setVisible(true);
		

	}

}
