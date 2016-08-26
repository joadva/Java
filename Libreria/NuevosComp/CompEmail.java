package NuevosComp;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.activation.*;

import com.sun.mail.handlers.message_rfc822;

import java.util.*;


public class CompEmail 
{
  String usuarioCorreo,password,rutaArchivo,NombreArchivo,destinatario,asunto,mensaje;
  
  public CompEmail(String usuarioCorreo,String password,String rutaArchivo,String NombreArchivo,String destinatario,String asunto,String mensaje)
  {
	  this.usuarioCorreo=usuarioCorreo;
	  this.password= password;
	  this.rutaArchivo= rutaArchivo;
	  this.NombreArchivo= NombreArchivo;
	  this.destinatario= destinatario;
	  this.asunto= asunto;
	  this.mensaje= mensaje;
  }
  public CompEmail(String usuarioCorreo,String password,String destinatario,String asunto,String mensaje)
  {
	  this(usuarioCorreo,password,"","",destinatario,asunto,mensaje);
  }
  public CompEmail(String usuarioCorreo,String password,String destinatario,String mensaje)
  {
	  this(usuarioCorreo,password,"","",destinatario,"",mensaje);
  }
  
  public boolean enviarMensaje()
  {
	  try
	  {
		Properties props= new Properties();
		props.put("mail.smtp.host","smtp.gmail.com");
		props.setProperty("mail.smtp.starttls.enable","true");
		props.setProperty("mail.smtp.port","587");
		props.setProperty("mail.smtp.user", usuarioCorreo);
		props.setProperty("mail.smtp.auth", "true");
		
		Session sesion= Session.getDefaultInstance(props,null);
		BodyPart texto = new MimeBodyPart();
		texto.setText(mensaje);
		
		BodyPart adjunto = new MimeBodyPart();
		if(!rutaArchivo.equals(""))
		{
			adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaArchivo)));
			adjunto.setFileName(NombreArchivo);
		}
		MimeMultipart multiParte= new MimeMultipart();
		multiParte.addBodyPart(texto);
		if(!rutaArchivo.equals(""))
		{
			multiParte.addBodyPart(adjunto);
		}
		
		MimeMessage menssage = new MimeMessage(sesion);
		menssage.setFrom(new InternetAddress(usuarioCorreo));
		menssage.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
		menssage.setSubject(asunto);
		menssage.setContent(multiParte);
		
		Transport t= sesion.getTransport("smtp");
		t.connect(usuarioCorreo,password);
		t.sendMessage(menssage,menssage.getAllRecipients());
		t.close();
		return true;
		
	  }catch(Exception e)
	  {
		  JOptionPane.showMessageDialog(null, "No funciona");
		  return false;
	  }
  }
  
  public static void main(String [] args)
  {
	  String clave="ser_slash_457";
	  CompEmail email= new CompEmail("sergioarsosa95@gmail.com",clave, "sergioarsosa@hotmail.com","prueba","probando");
	  if(email.enviarMensaje())
	  {
		  JOptionPane.showMessageDialog(null, "Mensaje Enviado");
	  }else
	  {
		  JOptionPane.showInputDialog(null,"Mensaje no enviado");
	  }
  }
}
