import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

	JButton fire, right, left;
	BulletThread bullet;

	public MainFrame(){

		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		bullet = new BulletThread("*", 250, 450);
		add(bullet);

		fire = new JButton("FIRE");
		fire.setSize(100,30);
		fire.setLocation(250,500);
		add(fire);

		right = new JButton(" >>> ");
		right.setSize(100,30);
		right.setLocation(370,500);
		add(right);

		left = new JButton(" <<< ");
		left.setSize(100,30);
		left.setLocation(130,500);
		add(left);

		fire.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread t = new Thread(bullet);
				t.start();
			}
		});


		right.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				bullet.moveX(10);
			}
		});

		left.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				bullet.moveX(-10);
			}
		});
	}

}