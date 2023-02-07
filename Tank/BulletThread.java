import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BulletThread extends JLabel implements Runnable{

	int X, Y;

	public BulletThread(String name, int X, int Y){
		
		setText(name);
		setSize(50,50);
		setFont(new Font("Arial", 1, 50));
		setLocation(X,Y);
		this.X = X;
		this.Y = Y;

	}

	public void run(){

		int y = Y;
		int x = X;

		while(y>0){
			
			y = y-5;
			
			setLocation(x, y);
			
			try{

				Thread.sleep(5);

			}catch (Exception e) {
				
			}
		}

		setLocation(X, Y);

	}

	public void moveX(int pixels){
		X = X + pixels;
		setLocation(X, Y);
	}

}