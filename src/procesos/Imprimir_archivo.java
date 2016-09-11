/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.io.*;
import javax.swing.JOptionPane;

public class Imprimir_archivo {
   public void escribeArchivo(int c, int r){
  
      File archivo;
      BufferedWriter out = null;
      try{
         out = new BufferedWriter(new FileWriter("GenerarArchivo.txt", true));
         if(c<10){
            out.write("P# 0"+c+" || TT "+r+"\n"); 
            out.newLine();
            out.close();
         }else{
            out.write("P# "+c+" || TT "+r+"\n"); 
            out.newLine();
            out.close();
         }         
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"error en el archivo"+e);
      }
   } 
}

