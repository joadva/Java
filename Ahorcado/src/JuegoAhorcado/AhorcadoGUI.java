package src.JuegoAhorcado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import JuegoAhorcado.Ahorcado;
import NuevosComp.CompJMenu;
import NuevosComp.CompJMenuItem;

public class AhorcadoGUI extends JFrame implements ActionListener
{
   private JPanel pTeclado,pImgAhorcado,pError;
   private JLabel error_icon,ahorcado_icon;
   private CompJMenu file;
   private JMenuBar bar;
   private CompJMenuItem inicio, salir;
   JTextField palabraOculta;
   Ahorcado ahorcado;
   public JButton button_A;
   public JButton button_B;
   public JButton button_C;
   public JButton button_D;
   public JButton button_E;
   public JButton button_F;
   public JButton button_G;
   public JButton button_H;
   public JButton button_I;
   public JButton button_J;
   public JButton button_K;
   public JButton button_L;
   public JButton button_M;
   public JButton button_N;
   public JButton button_O;
   public JButton button_P;
   public JButton button_Q;
   public JButton button_R;
   public JButton button_S;
   public JButton button_T;
   public JButton button_U;
   public JButton button_V;
   public JButton button_W;
   public JButton button_X;
   public JButton button_Y;
   public JButton button_Z;
   public JButton button_Ñ;
   
   public AhorcadoGUI()
   {
      super("Ahorcado");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setIconImage(Toolkit.getDefaultToolkit().getImage("src/ahorcado/8.jpg"));
      setSize(624,496);
      setBackground(new Color(255, 255, 255));
      getContentPane().setLayout(new MigLayout("", "[50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill]", "[33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill]"));
      
      //Panel donde se pondra la imagen del ahorcado
      pImgAhorcado= new JPanel();
      pImgAhorcado.setLayout(new BorderLayout());
      ahorcado_icon= new JLabel();
      ahorcado_icon.setIcon(new ImageIcon(new ImageIcon("src/ahorcado/0.jpg").getImage().getScaledInstance(220,300,Image.SCALE_FAST)));
      pImgAhorcado.add(ahorcado_icon,BorderLayout.CENTER);
      
      //Se declara en donde va a ir la palabra oculta
      pError= new JPanel();
      pError.setLayout(new BorderLayout());
      pError.setBackground(Color.WHITE);
      palabraOculta= new JTextField();
      palabraOculta.setEditable(false);
      palabraOculta.setBackground(new Color(51, 51, 51));
      palabraOculta.setFont(new Font("Tahoma", 1, 24)); // NOI18N
      palabraOculta.setForeground(new Color(255, 255, 255));
      palabraOculta.setHorizontalAlignment(JTextField.CENTER);
      palabraOculta.setText("-------------------");
      error_icon= new JLabel();
      error_icon.setIcon(new ImageIcon(new ImageIcon("src/loser/loser8.jpg").getImage().getScaledInstance(250,50,Image.SCALE_FAST)));
      pError.add(error_icon,BorderLayout.NORTH);
      pError.add(palabraOculta,BorderLayout.CENTER);
      
      //Declaracion de jMenuBar utilizando componentes.
      bar= new JMenuBar();
      setJMenuBar(bar);
      file= new CompJMenu(bar,"File");
      inicio= new CompJMenuItem(file,"Iniciar/reiniciar juego",this);
      salir= new CompJMenuItem(file,"Salir",this);
      
      //En esta parte pondremos el teclado.
      pTeclado= new JPanel();
      pTeclado.setBackground(Color.black);
      pTeclado.setLayout(new MigLayout("", "[50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill][50px,grow,fill]", "[33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill][33.00px,grow,fill]"));
      button_A = new JButton("A");
      button_A.addActionListener(this);
      button_B = new JButton("B");
      button_B.addActionListener(this);
      button_C = new JButton("C");
      button_C.addActionListener(this);
      button_D = new JButton("D");
      button_D.addActionListener(this);
      button_E = new JButton("E");
      button_E.addActionListener(this);
      button_F = new JButton("F");
      button_F.addActionListener(this);
      button_G = new JButton("G");
      button_G.addActionListener(this);
      button_H = new JButton("H");
      button_H.addActionListener(this);
      button_I = new JButton("I");
      button_I.addActionListener(this);
      button_J = new JButton("J");
      button_J.addActionListener(this);
      button_K = new JButton("K");
      button_K.addActionListener(this);
      button_L = new JButton("L");
      button_L.addActionListener(this);
      button_M = new JButton("M");
      button_M.addActionListener(this);
      button_N = new JButton("N");
      button_N.addActionListener(this);
      button_Ñ = new JButton("Ñ");
      button_Ñ.addActionListener(this);
      button_O = new JButton("O");
      button_O.addActionListener(this);
      button_P = new JButton("P");
      button_P.addActionListener(this);
      button_Q = new JButton("Q");
      button_Q.addActionListener(this);
      button_R = new JButton("R");
      button_R.addActionListener(this);
      button_S = new JButton("S");
      button_S.addActionListener(this);
      button_T = new JButton("T");
      button_T.addActionListener(this);
      button_U = new JButton("U");
      button_U.addActionListener(this);
      button_V = new JButton("V");
      button_V.addActionListener(this);
      button_X = new JButton("X");
      button_X.addActionListener(this);
      button_Y = new JButton("Y");
      button_Y.addActionListener(this);
      button_Z = new JButton("Z");
      button_Z.addActionListener(this);
      button_W = new JButton("W");
      button_W.addActionListener(this);
      pTeclado.add(button_A,"cell 0 1");
      pTeclado.add(button_B,"cell 1 1");
      pTeclado.add(button_C,"cell 2 1");
      pTeclado.add(button_D,"cell 3 1");
      pTeclado.add(button_E,"cell 4 1");
      pTeclado.add(button_F,"cell 5 1");
      pTeclado.add(button_G,"cell 6 1");
      pTeclado.add(button_H,"cell 7 1");
      pTeclado.add(button_I,"cell 0 2");
      pTeclado.add(button_J,"cell 1 2");
      pTeclado.add(button_K,"cell 2 2");
      pTeclado.add(button_L,"cell 3 2");
      pTeclado.add(button_M,"cell 4 2");
      pTeclado.add(button_N,"cell 5 2");
      pTeclado.add(button_Ñ,"cell 6 2");
      pTeclado.add(button_O,"cell 7 2");
      pTeclado.add(button_P,"cell 0 3");
      pTeclado.add(button_Q,"cell 1 3");
      pTeclado.add(button_R,"cell 2 3");
      pTeclado.add(button_S,"cell 3 3");
      pTeclado.add(button_T,"cell 4 3");
      pTeclado.add(button_U,"cell 5 3");
      pTeclado.add(button_V,"cell 6 3");
      pTeclado.add(button_W,"cell 7 3");
      pTeclado.add(button_X,"cell 0 4");
      pTeclado.add(button_Y,"cell 1 4");
      pTeclado.add(button_Z,"cell 2 4");
      
      
      getContentPane().add(pTeclado,"cell 0 5 6 3");
      getContentPane().add(pImgAhorcado,"cell 7 1 4 7");
      add(pError,"cell 1 3 4 1");
      
      restaurarColor();
      fin();
   }
   
   public void fin()
   {
      button_A.setEnabled(false);
      button_B.setEnabled(false);
      button_C.setEnabled(false);
      button_D.setEnabled(false);
      button_E.setEnabled(false);
      button_F.setEnabled(false);
      button_G.setEnabled(false);
      button_H.setEnabled(false);
      button_I.setEnabled(false);
      button_J.setEnabled(false);
      button_K.setEnabled(false);
      button_L.setEnabled(false);
      button_M.setEnabled(false);
      button_N.setEnabled(false);
      button_Ñ.setEnabled(false);
      button_O.setEnabled(false);
      button_P.setEnabled(false);
      button_Q.setEnabled(false);
      button_R.setEnabled(false);
      button_S.setEnabled(false);
      button_T.setEnabled(false);
      button_U.setEnabled(false);
      button_V.setEnabled(false);
      button_W.setEnabled(false);
      button_X.setEnabled(false);
      button_Y.setEnabled(false);
      button_Z.setEnabled(false);
   }
   public void restaurarColor()
   {
      button_A.setEnabled(true);
      button_B.setEnabled(true);
      button_C.setEnabled(true);
      button_D.setEnabled(true);
      button_E.setEnabled(true);
      button_F.setEnabled(true);
      button_G.setEnabled(true);
      button_H.setEnabled(true);
      button_I.setEnabled(true);
      button_J.setEnabled(true);
      button_K.setEnabled(true);
      button_L.setEnabled(true);
      button_M.setEnabled(true);
      button_N.setEnabled(true);
      button_Ñ.setEnabled(true);
      button_O.setEnabled(true);
      button_P.setEnabled(true);
      button_Q.setEnabled(true);
      button_R.setEnabled(true);
      button_S.setEnabled(true);
      button_T.setEnabled(true);
      button_U.setEnabled(true);
      button_V.setEnabled(true);
      button_W.setEnabled(true);
      button_X.setEnabled(true);
      button_Y.setEnabled(true);
      button_Z.setEnabled(true);
   }

   public void actionPerformed(ActionEvent pA)
   {
      if(pA.getSource().equals(button_A))
      {
         ahorcado.evaluar('A'); 
         button_A.setEnabled(false);
      }
      else if(pA.getSource().equals(button_B))
      {
         ahorcado.evaluar('B');
         button_B.setEnabled(false);
      }
      else if(pA.getSource().equals(button_C))
      {
         ahorcado.evaluar('C');
         button_C.setEnabled(false);
      }
      else if(pA.getSource().equals(button_D))
      {
         ahorcado.evaluar('D');
         button_D.setEnabled(false);
      }
      else if(pA.getSource().equals(button_E))
      {
         ahorcado.evaluar('E');
         button_E.setEnabled(false);
      }
      else if(pA.getSource().equals(button_F))
      {
         ahorcado.evaluar('F');
         button_F.setEnabled(false);
      }
      else if(pA.getSource().equals(button_G))
      {
         ahorcado.evaluar('G');
         button_G.setEnabled(false);
      }
      else if(pA.getSource().equals(button_H))
      {
         ahorcado.evaluar('H');
         button_H.setEnabled(false);
      }
      else if(pA.getSource().equals(button_I))
      {
         ahorcado.evaluar('I');
         button_I.setEnabled(false);
      }
      else if(pA.getSource().equals(button_J))
      {
         ahorcado.evaluar('J');
         button_J.setEnabled(false);
      }
      else if(pA.getSource().equals(button_K))
      {
         ahorcado.evaluar('K');
         button_K.setEnabled(false);
      }
      else if(pA.getSource().equals(button_L))
      {
         ahorcado.evaluar('L');
         button_L.setEnabled(false);
      }
      else if(pA.getSource().equals(button_M))
      {
         ahorcado.evaluar('M');
         button_M.setEnabled(false);
      }
      else if(pA.getSource().equals(button_S))
      {
         ahorcado.evaluar('S');
         button_S.setEnabled(false);
      }
      else if(pA.getSource().equals(button_N))
      {
         ahorcado.evaluar('N');
         button_N.setEnabled(false);
      }
      else if(pA.getSource().equals(button_Ñ))
      {
         ahorcado.evaluar('Ñ');
         button_Ñ.setEnabled(false);
      }
      else if(pA.getSource().equals(button_O))
      {
         ahorcado.evaluar('O');
         button_O.setEnabled(false);
      }
      else if(pA.getSource().equals(button_P))
      {
         ahorcado.evaluar('P');
         button_P.setEnabled(false);
      }
      else if(pA.getSource().equals(button_Q))
      {
         ahorcado.evaluar('Q');
         button_Q.setEnabled(false);
      }
      else if(pA.getSource().equals(button_T))
      {
         ahorcado.evaluar('T');
         button_T.setEnabled(false);
      }
      else if(pA.getSource().equals(button_U))
      {
         ahorcado.evaluar('U');
         button_U.setEnabled(false);
      }
      else if(pA.getSource().equals(button_R))
      {
         ahorcado.evaluar('R');
         button_R.setEnabled(false);
      }
      else if(pA.getSource().equals(button_V))
      {
         ahorcado.evaluar('V');
         button_V.setEnabled(false);
      }
      else if(pA.getSource().equals(button_W))
      {
         ahorcado.evaluar('W');
         button_W.setEnabled(false);
      }
      else if(pA.getSource().equals(button_X))
      {
         ahorcado.evaluar('X');
         button_X.setEnabled(false);
      }
      else if(pA.getSource().equals(button_Y))
      {
         ahorcado.evaluar('Y');
         button_Y.setEnabled(false);
      }
      else if(pA.getSource().equals(button_Z))
      {
         ahorcado.evaluar('Z');
         button_Z.setEnabled(false);
      }
      else if(pA.getSource().equals(inicio))
      {
         ahorcado = new Ahorcado(palabraOculta,error_icon,ahorcado_icon);         
         restaurarColor();
      }
      else if(pA.getSource().equals(salir))
      {
         dispose();
      }
      
   }
   
   public static void main(String [] args)
   {
      AhorcadoGUI a= new AhorcadoGUI();
      a.setVisible(true);
   }
}
