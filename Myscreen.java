/**
 * 
 */
package sandgame;

/**
 * @author cem.mutlu
 *
 */
//import someone elses code
import javax.swing.JFrame;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.*;
//declare public class give it the Jframe class by extending 
//extend allows to inherit from something else
public class Myscreen extends JFrame {

//constructor method instanciates - runs when class template is isatantiated
	public Myscreen(String name) {

		this.setSize(600,400);
		this.setTitle("end it");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);	
	}
	// makes class runnable
		public static void main(String[] args) {
			Myscreen screen = new Myscreen("end it"); // instance being created
			Mycanvas canvas = new Mycanvas();
			screen.getContentPane().add(canvas);
			
			
		
		}


	//public static void playIt() {
		//try {
		//	InputStream in = new FileInputStream("gaurplains.wav");
		//	AudioStream as = new AudioStream(in);
		//	AudioPlayer.player.start(as);
	//	}
	//	 catch (IOExcepetion e) {
	//		System.out.println("can not find file");
	//	}

}




