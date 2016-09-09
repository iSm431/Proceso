/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

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
        Listas_dobles list_p1 = new Listas_dobles();
        
        /*for(int i=0;i!=10;i++){
            list_p1.alta(i,i);
        }*/
        
        list_p1.alta(1,2);
        list_p1.alta(2,2);
        
        list_p1.imprimir();
        //list_p1.delete(2);
        //list_p1.imprimir2();
    }
    
}
