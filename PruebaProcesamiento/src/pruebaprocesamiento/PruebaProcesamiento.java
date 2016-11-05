
 
package pruebaprocesamiento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author forse
 */
public class PruebaProcesamiento {
static String palabra;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("prueba");
    if (!file.exists()) {
      System.out.println(args[0] + " does not exist.");
      return;
    }
    if (!(file.isFile() && file.canRead())) {
      System.out.println(file.getName() + " cannot be read from.");
      return;
    }
    try {
      FileInputStream fis = new FileInputStream(file);
      //BufferedReader rEntrada  = new BufferedReader(  new InputStreamReader(new FileInputStream(file), "UTF-8"));
      
InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
      int entrante=0;
      while (entrante!=-1) 
      {
         entrante=isr.read();
        
           
           
            if((entrante>64 && entrante<91) || (entrante>96 && entrante<123) || (entrante>191 && entrante<403))
            {
                if(palabra==null)
                {palabra= String.valueOf((char)entrante);
                
                }
                else
                {palabra+=(char)entrante;
                }
            }
            else
            {   if(palabra!=null)
                {
                System.out.print(palabra + " ");
                palabra=null;}
            }
      
      
      
      }
    
    
    } catch (IOException e) {
      e.printStackTrace();
    }
        
    
    }
    
    
    
     
    
    
    
}
