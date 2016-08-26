import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class AnalizadorGUI extends JFrame implements ActionListener
{
	private JTextField txt_Patron;
	private String patron="([A]+)|([B])";
	JTextArea tA_Resultado;
	Pattern p=Pattern.compile(patron);
	Matcher m;
	JButton btnAnalizar;
	public AnalizadorGUI()
	{
		super("Analizador lexico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill]", "[33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][][33.00px,grow,fill][][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][][33.00px,grow,fill]"));
		setSize(438, 214);
		txt_Patron = new JTextField();
		getContentPane().add(txt_Patron, "cell 3 4 4 1,growx");
		txt_Patron.setColumns(10);
		
		tA_Resultado = new JTextArea();
		getContentPane().add(tA_Resultado, "cell 3 6 4 5,grow");
		
		btnAnalizar = new JButton("Analizar");
		getContentPane().add(btnAnalizar, "cell 8 7");
		btnAnalizar.addActionListener(this);
		setLocationRelativeTo(null);
		
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
       AnalizadorGUI a= new AnalizadorGUI();
	}

	@Override
	public void actionPerformed(ActionEvent pA) 
	{
		if(pA.getSource().equals(btnAnalizar))
		{
		   m=p.matcher(txt_Patron.getText());
		   while(m.find())
		   {
			   String token1=m.group(1);
			   String token2=m.group(2);
			   
			   if(token1!=null)
			   { 
				   tA_Resultado.setText("");
				   tA_Resultado.append("Hola");
			   }
			   else if(token2!=null)
			   {
				   tA_Resultado.append("Amigo");
			   }
		   }
		}
	}

}
