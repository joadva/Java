package Colores;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CompBoton3 extends JButton
{
   public CompBoton3(JPanel pPanel,String pEtiqueta,ActionListener pAccion, String pUbicacion)
   {
      this(pPanel,pEtiqueta,pAccion,pUbicacion,Color.RED,12);
   }
   
   public CompBoton3(JPanel pPanel,String pEtiqueta,ActionListener pAccion,String pUbicacion,Color pColor, int pTAM_FUENTE)
   {
      if(pEtiqueta==null) pEtiqueta="Nuevo boton";
      this.setText(pEtiqueta);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setBackground(pColor);
      this.setForeground(Color.BLACK);
      this.setFont(new Font("Arial",Font.PLAIN,11));
      this.addActionListener(pAccion);
      if(pPanel!=null) pPanel.add(this,pUbicacion);
   }
}
