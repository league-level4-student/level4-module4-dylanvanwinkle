package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    Polymorph rm = new RedMorph(20,20);
    Polymorph bp = new BluePolymorph(50,50);
    Polymorph movingmorph = new MovingMorph(80,80);
    Polymorph mm = new MouseMorph(130,130);
    ArrayList<Polymorph> polymorph = new ArrayList<Polymorph>( );
        public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
   //test RedMorph: Finish Next Class
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.addMouseMotionListener(this);
   	 window.pack();
   	 window.setVisible(true);
     polymorph.add(rm);
     polymorph.add(bp);
     polymorph.add(movingmorph);
     polymorph.add(mm);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 for (Polymorph pm: polymorph) {
		pm.draw(g);
		pm.update();
	}
   	 //draw polymorph
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	   	 for (Polymorph pm: polymorph) {
	 		if (pm instanceof MouseMorph) {
				pm.x = e.getX();
				pm.y = e.getY();
			}
	 	}
	}
}
