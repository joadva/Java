package componentes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CompAtomo extends JButton implements MouseListener
{
   private String simbolo;
   private String nombre;
   private double masaAtomica;
   private int    numeroAtomico;
   private int    numValencia;
   private Color  fondo;
   
   public CompAtomo(JPanel pPanel,String pSimbolo,String pNombre,double pMasa,int pAtomico,int pValencia,ActionListener pAccion,String pUbicacion,Color pFondo,Color pLetra,int pI )
   {
      simbolo=pSimbolo;
      nombre=pNombre;
      masaAtomica=pMasa;
      numeroAtomico=pAtomico;
      numValencia=pValencia;
      this.setText(simbolo);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setBackground(getBackground());
      this.setBackground(getBackground());
      this.setFont(new Font("Arial",Font.PLAIN,pI));
      this.addActionListener(pAccion);
      this.addMouseListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setVisible(true);
      if(pPanel!=null) pPanel.add(this,pUbicacion);
   }
   
   public String toString()
   {
      return String.format("%s","%s","%f","%d","%d",simbolo,nombre,masaAtomica,numeroAtomico,numValencia);
   }
   
   public void imprimir()
   {
      JPanel panel= new JPanel(new BorderLayout());
             JLabel n=(new JLabel(""+numeroAtomico));panel.add(n,BorderLayout.NORTH);n.setHorizontalAlignment(JLabel.CENTER);
             JLabel s= new JLabel(simbolo);panel.add(s,BorderLayout.CENTER);s.setFont(new Font("Arial",Font.BOLD,48));s.setHorizontalAlignment(JLabel.CENTER);
             panel.add(new JLabel(nombre),BorderLayout.SOUTH);
      JOptionPane.showMessageDialog(null,panel,nombre,JOptionPane.INFORMATION_MESSAGE);
   }
   
   public void dibujar(Graphics pG)
   {
   }
   
   public void mouseClicked(MouseEvent pE)
   {
   }
   
   public void mouseEntered(MouseEvent pE)
   {
      this.setBackground(Color.BLUE);
   }
   
   public void mouseExited(MouseEvent pE)
   {
      this.setBackground(fondo);
   }
   
   public void mousePressed(MouseEvent pE)
   {
   }
   
   public void mouseReleased(MouseEvent PArg0)
   {
   }
}
