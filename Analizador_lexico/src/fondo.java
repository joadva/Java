import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class fondo extends JFrame implements ActionListener,MouseListener
{
	JMenu menu;
	JMenuBar bar;
    JMenuItem iRojo,iDefault;
    JPanel pPrincipal;
	public fondo()
	{
		super("Fondo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		pPrincipal= new JPanel(new BorderLayout());
		pPrincipal.addMouseListener(this);
		bar= new JMenuBar();
		setJMenuBar(bar);
		menu= new JMenu("Colores");
		bar.add(menu);
		
		iRojo= new JMenuItem("Rojo");
		iRojo.addActionListener(this);
		menu.add(iRojo);
		
		iDefault= new JMenuItem("Default");
		iDefault.addActionListener(this);
		menu.add(iDefault);
		
		add(pPrincipal,BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args)
	{
		fondo f= new fondo();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent pA) 
	{
	    if(pA.getSource().equals(iRojo))
	    {
	    	pPrincipal.setBackground(Color.RED);
	    }
	    else if(pA.getSource().equals(iDefault))
	    {
	    	pPrincipal.setBackground(null);
	    }
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource().equals(pPrincipal))
		{
			pPrincipal.setBackground(null);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
