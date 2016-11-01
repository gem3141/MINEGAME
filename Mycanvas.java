/**
 * 
 */
package sandgame;

/**
 * @author cem.mutlu
 *
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import sun.audio.*;

public class Mycanvas extends Canvas implements KeyListener, MouseListener{

	Image img = Toolkit.getDefaultToolkit().getImage("right.png");
	Image runright = Toolkit.getDefaultToolkit().getImage("runright.png");
	int x = 10;
	int y = 10;
	int xsize = 600;
	int ysize = 400;
	Rectangle rect = new Rectangle(200,300,100,100);

	public Mycanvas() {
		this.setSize(xsize,ysize);
		this.repaint();
		this.addKeyListener(this);
		this.addMouseListener(this);
		playIt("storm.wav");

	}

	public static void playIt(String filename) {
		try {
			InputStream in = new FileInputStream(filename);
			AudioStream as = new AudioStream(in);
			AudioPlayer.player.start(as);
		} catch (IOException e) {
			System.out.println("can not find file");
		}
	}




	public void paint(Graphics g) {
		g.fillOval(100,100,30,30);
		g.drawImage(img,x,y,200,150,this);
		g.fillRect((int)rect.getX(),(int)rect.getY(),(int)rect.getWidth(),(int)rect.getHeight());

	}

	

	public void mouseClicked(MouseEvent e) {
	System.out.println(e);
		x = e.getX();
		y = e.getY();
		//playIt("storm.wav");
		this.repaint();
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println(e);
	}
	public void mouseExited(MouseEvent e) {
		System.out.println(e);
	}
	public void mousePressed(MouseEvent e) {
		System.out.println(e);
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println(e);
	}
	@Override
	public void keyPressed(KeyEvent e) {

		if (x > xsize) {
			x  = x - 500;
		}

		if (y > ysize) {
			x = x - 250;
		}

		if (x < 0) {
			x = x + 450;
		}

		if (y < 0) {
			y = y + 176;
		}




		System.out.println(e.getKeyChar());
		if (rect.contains(x,y)){
			x = 10;
			y = 10;
			this.repaint();
			return;
		}
		if (e.getKeyCode() == 39) {
			x = x + 5;
			this.repaint("runright.png");	 }
		else if (e.getKeyCode() == 37) {
			x = x -5;
			this.repaint();
		}
		else if (e.getKeyCode() == 38) {
			y = y - 5;
			this.repaint();
		}
		else if(e.getKeyCode() == 40) {
			y = y + 5;
			this.repaint();
		}

	}
	@Override
	public void keyReleased(KeyEvent e){
		System.out.println("released");
	}
	@Override
	public void keyTyped(KeyEvent e){
		System.out.println("typed");
	}


}