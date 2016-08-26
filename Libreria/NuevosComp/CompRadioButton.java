package NuevosComp;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class CompRadioButton extends JRadioButton
{
   
   public CompRadioButton(JPanel pPanel,ButtonGroup pBu,String pTitulo,String pPosicion)
   {
      pPanel.add(this,pPosicion);
      this.setText(pTitulo);
      pBu.add(this);
   }
   public CompRadioButton(JPanel pPanel,String pTitulo, ButtonGroup pBu,ActionListener pA)
   {
      pPanel.add(this);
      this.setText(pTitulo);
      this.addActionListener(pA);
      pBu.add(this);
   }
   public CompRadioButton(JPanel pPanel,String pTitulo, ButtonGroup pBu,String pCoordenadas,ActionListener pA)
   {
      pPanel.add(this,pCoordenadas);
      this.setText(pTitulo);
      this.addActionListener(pA);
      pBu.add(this);
   }
   
   public CompRadioButton(JPanel pPanel,String pTitulo, ButtonGroup pBu,String pCoordenadas)
   {
      pPanel.add(this,pCoordenadas);
      this.setText(pTitulo);
      pBu.add(this);
   }
   
   public CompRadioButton(JPanel pPanel,String pTitulo, ButtonGroup pBu,String pCoordenadas,Color pColor)
   {
      pPanel.add(this,pCoordenadas);
      this.setBackground(pColor);
      this.setText(pTitulo);
      pBu.add(this);
   }
   
   public CompRadioButton(JPanel pPanel,String pTitulo, ButtonGroup pBu,String pCoordenadas,Color pColor, Color pFore)
   {
      pPanel.add(this,pCoordenadas);
      this.setBackground(pColor);
      this.setForeground(pFore);
      this.setText(pTitulo);
      pBu.add(this);
   }
   
   public CompRadioButton(JPanel pPanel,String pTitulo, ButtonGroup pBu,String pCoordenadas,ActionListener pA,Color pColor, Color pFore)
   {
      pPanel.add(this,pCoordenadas);
      this.addActionListener(pA);
      this.setBackground(pColor);
      this.setForeground(pFore);
      this.setText(pTitulo);
      pBu.add(this);
   }
}
