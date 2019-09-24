package ventanaBasica;
import javax.swing.JFrame;


public class MainWindows extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainWindows (){
		setTitle("Mi primera ventana");
		setSize(320,240);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		MainWindows mainWindows = new MainWindows();
		mainWindows.setVisible(true);
	}

}
