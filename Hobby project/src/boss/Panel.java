package boss;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Panel extends JPanel{
	//Label label=new Label();
	Image background;


Panel(){
	background=new ImageIcon("space.jpg").getImage();

	//this.setLayout(null );
}
public void paintComponent(Graphics g) {
	Graphics2D bo =(Graphics2D)g;
	//g2D.drawImage(background, x, y, null);

	bo.drawImage(background, 0, 0, 900, 720, null);  

}

}
