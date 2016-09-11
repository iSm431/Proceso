/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;
import java.io.*;
import javax.swing.JOptionPane;

public class Imprimir_tabla {
   public void escribeTabla(int p2, int np, int tp,int tsp){  
      File archivo;
      BufferedWriter out = null;
      try{
         out = new BufferedWriter(new FileWriter("GenerarTabla.txt", true));
         if(p2< 10){
             if(np<10){
               
                out.write("No proceso = 0"+p2+"\t\t");            
                out.write("||\t\tNo subproceso = 0"+np+"\t\t||\t\t No Tempo = "+tp+"\t\t");             
                out.write("||\t\tTSp = 0"+tsp+"\t\t");
                out.newLine();
                out.close();
             }else{
                
                out.write("No proceso = 0"+p2+"\t\t");            
                out.write("||\t\tNo subproceso = "+np+"\t\t||\t\t No Tempo = "+tp+"\t\t");             
                out.write("||\t\tTSp = "+tsp+"\t\t");
                out.newLine();
                out.close();
             }             
        }else{
             if(np<10){
                out.write("No proceso = "+p2+"\t\t");            
                out.write("||\t\tNo subproceso = 0"+np+"\t\t||\t\t No Tempo = "+tp+"\t\t");             
                out.write("||\t\tTSp = 0"+tsp+"\t\t");
                out.newLine();
                out.close();
             }else{
                out.write("No proceso = "+p2+"\t\t");            
                out.write("||\t\tNo subproceso = "+np+"\t\t||\t\t No Tempo = "+tp+"\t\t");             
                out.write("||\t\tTSp = "+tsp+"\t\t");
                out.newLine();
                out.close();
             }
         }         
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"error en el archivo"+e);
      }
   } 
}
