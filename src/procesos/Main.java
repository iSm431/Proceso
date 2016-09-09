/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;
import java.util.Random;
/**
 *
 * @author ismael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Listas_dobles list_p1 = new Listas_dobles();
        
        for(int i=1;i!=11;i++){
            list_p1.alta(i,i);
        }
        
        list_p1.imprimir2();*/
                
        Random rnd = new Random(3816);
        int numal;
        numal=(int) (Math.random()*(50-1+1)+1);
        System.out.println(numal);
        pila Pila_p = new pila();
        Pila_p.llenarLdC(numal);
        Pila_p.imprimirTab();
    }    
}
