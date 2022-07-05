
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public abstract class Key_Listener implements KeyListener {
	
	public void keyPressed(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.VK_A) {
			System.out.println("A");
		}
		else if(event.getKeyCode() == KeyEvent.VK_B) {
			System.out.println("B");
		}
		else if(event.getKeyCode() == KeyEvent.VK_C) {
			System.out.println("C");
		}
		else if(event.getKeyCode() == KeyEvent.VK_D) {
			System.out.println("D");
		}
		else if(event.getKeyCode() == KeyEvent.VK_S) {
			System.out.println("S");
		}
		else if(event.getKeyCode() == KeyEvent.VK_P) {
			System.out.println("P");
		}
		else if(event.getKeyCode() == KeyEvent.VK_N) {
			System.out.println("N");
		}
	}

}
