package JuegoAhorcado;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import src.JuegoAhorcado.AhorcadoGUI;

public class Ahorcado
{
   JTextField       jt;
   JLabel           lb;
   JLabel           lb2;
   private boolean  play        =false;
   private String[] diccionario ={"ABEJA","AEROPUERTO","COMPUTADOR","OSO",
                                "JAVA","NEVERA","PROGRAMA","INFORMATICA","COMPUTACION","COMPUTADOR","CORAZON","BANANO","PLATANO",
                                "AUTOMOVIL","PERRO","COLOMBIA","LONDRES","CEPILLO","BRAZO","CABEZA","CUERPO","DEPORTE","SALUD",
                                "ANONYMOUS","CUADERNO","PANTALLA","UBUNTU","SEMAFORO","LINUX","LOBO","AMOR","MOSCA","ZANAHORIA",
                                "PINGUINO","HACKER","SISTEMA","ELEFANTE","CASCADA","JUEGOS","LARGO","BONITO","IMPOSIBLE","UNIDOS","ZOMBIE",
                                "MATEMATICAS","CALCULO","ALGEBRA","DICCIONARIO","BIBLIOTECA","COCINA","PELICULA","COMERCIAL","GRANDE","PEQUEÃ‘O",
                                "GATO","SAPO","JIRAFA","FERROCARRIL","FACEBOOK","PERSONA","BICICLETA","CONTROL","PANTALON","AEROSOL",
                                "ERROR","COPA","COPA","PROGRAMADOR","LICENCIA","NUEVE","PROCESADOR","GARAJE","MODERNO","TABLA","DISCOTECA",
                                "LENGUAJE","PROGRAMACION","HERRAMIENTAS","INTERNET","EJECUTAR","PROYECTO","PERIODICO","COCODRILO","TORTUGA","CABALLO",
                                "APLICACION","PERA","SOFTWARE","ADMINISTRACION","VENTANA","MANTENIMIENTO","INFORMACION","PRESIDENTE","PERSONA","GENTE",
                                "NARANJA","PRUEBA","MANZANA","JARRA","CELULAR","TELEFONO","CONTAMINACION","COLOR","ROMANO","ADIVINAR","MARCADOR",
                                "INSTRUCCION","CUADERNO","CASA","PALA","ARBOL","PUENTE","PAPEL","HOJA","HELICOPTERO","BARCO","GOLF","CARRERA",
                                "TUBERIA","PLOMERO","FUTBOL","BALONCESTO","ESTADIO","JEAN","FUENTE","LEOPARDO","REGLA","PRIMERO","SEGUNDO",
                                "BLUSA","CAMISA","AGUA","FUEGO","INDUSTRIA","AIRE","TIERRA","NATURALEZA","MIERCOLES","FOTOGRAFIA","LEON",
                                "TIGRE"}; // 90
   private char[]   palabra_secreta;
   private char[]   palabra;
   int              intentos    =0;
   boolean          cambios     =false;
   public AhorcadoGUI g= new AhorcadoGUI();;
   
   public Ahorcado()
   {
   }
   public Ahorcado(JTextField texto,JLabel loser,JLabel ahorcado)
   {
      palabra_secreta=Random().toCharArray();
      String var="";
      // llena un string con "_"
      for(int i=0; i<=this.palabra_secreta.length-1; i++)
      {
         var=var+"_";
      }
      // convierte este en un array
      palabra=var.toCharArray();
      jt=texto;
      lb=loser;
      lb2=ahorcado;
      jt.setText(var);
      lb.setIcon(new ImageIcon(new ImageIcon("src/loser/loser.jpg").getImage().getScaledInstance(250,50,Image.SCALE_FAST)));
      lb2.setIcon(new ImageIcon(new ImageIcon("src/ahorcado/0.jpg").getImage().getScaledInstance(220,300,Image.SCALE_FAST)));
      JOptionPane.showMessageDialog(null,"La palabra  tiene "+palabra_secreta.length+"letras");
      play=true;
   }
   
   // evalua el juego de acuerdo a los caracteres que se le pase
   public void evaluar(char word)
   {
      if(play)
      {
         String p="";
         // controla que aun se pueda jugar
         if(intentos==7)
         {
            lb2.setIcon(new ImageIcon(new ImageIcon("src/ahorcado/8.jpg").getImage().getScaledInstance(220,300,Image.SCALE_FAST)));
            String RESPT="";
            for(int i=0; i<=this.palabra_secreta.length-1; i++)
            {
               RESPT+=palabra_secreta[i];
            }
            JOptionPane.showMessageDialog(null,"¡PERDISTE! La palabra oculta era: "+RESPT);
            g.fin();
         }
         else
         {
            // evalua caracter por caracter
            for(int j=0; j<=palabra_secreta.length-1; j++)
            {
               // si el caracter se encuentra en la palabra secreta
               if(palabra_secreta[j]==word)
               {
                  palabra[j]=word;// se asigna para que se pueda ver en
                                       // pantalla
                  cambios=true;
               }
               p+=palabra[j];
            }// fin for
             // si no se produjo ningun cambio, quiere decir que el jugador se
             // equivoco
            if(cambios==false)
            {
               intentos+=1; // se incrementa
               lb.setIcon(new ImageIcon(new ImageIcon("src/loser/loser"+intentos+".jpg").getImage().getScaledInstance(250,50,Image.SCALE_FAST)));
               lb2.setIcon(new ImageIcon(new ImageIcon("src/ahorcado/"+intentos+".jpg").getImage().getScaledInstance(220,300,Image.SCALE_FAST)));
               if(this.intentos<8)
               {
                  JOptionPane.showMessageDialog(null,"¡Has Fallado! \n\n\t Te quedan "+((8)-intentos)+" intentos mas");
               }
            }
            else
            {
               cambios=false;
            }
            jt.setText(p);
            // comprobamos el estado del juego
            gano();
         }
         
      }
   }

   private void gano()
   {
      boolean win=false;
      for(int i=0; i<=this.palabra_secreta.length-1; i++)
      {
         if(this.palabra[i]==this.palabra_secreta[i])
         {
            win=true;
         }
         else
         {
            win=false;
            break;
         }
      }
      if(win==true)
      {
         //g.fin();
         JOptionPane.showMessageDialog(null,"Te tomo "+ intentos +" Pero ganaste, !FELICIDADEEEEESS¡");
      }
   }
   
   private String Random()
   {
      int num=(int)(Math.random()*(diccionario.length));
      return diccionario[num];
   }
}
