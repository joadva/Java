package componentes;

import java.awt.Color;
import java.awt.Font;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CompBoton extends JButton
{
    
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion)
   {
      this(pPanel,pEtiqueta,pAccion,Color.MAGENTA);
   }
   public CompBoton(JPanel pPanel, String pEtiqueta,ActionListener pAccion,Color pColor)
   {
      if(pEtiqueta==null)pEtiqueta="Nuevo boton";
      this.setText(pEtiqueta);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setBackground(new Color(147,112,219));
      this.setForeground(Color.BLACK);
      this.setFont(new Font("Arial",Font.PLAIN,11));
      this.addActionListener(pAccion);
      if(pPanel!=null)pPanel.add(this);     
   }
   
   public CompBoton(JPanel pPanel, String pEtiqueta,ActionListener pAccion, int ptaLetra)
   {
      if(pEtiqueta==null)pEtiqueta="Nuevo boton";
      this.setText(pEtiqueta);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setFont(new Font("Arial",Font.PLAIN,ptaLetra));
      this.addActionListener(pAccion);
      if(pPanel!=null)pPanel.add(this);     
   }
   public CompBoton(JPanel pPanel, String pEtiqueta,ActionListener pAccion, int ptaLetra,String pMigLayout)
   {
      if(pEtiqueta==null)pEtiqueta="Nuevo boton";
      this.setText(pEtiqueta);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setFont(new Font("Arial",Font.PLAIN,ptaLetra));
      this.addActionListener(pAccion);
      pPanel.add(this,pMigLayout);     
   }
   
}
             
