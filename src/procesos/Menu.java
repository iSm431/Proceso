/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import java.util.Scanner;
/**
 *
 * @author ismael
 */
public class Menu {
    public void MenuPrincipal(){
        
        Scanner entrada = new Scanner(System.in);
        int op=0;
        pila Pila_p = new pila();
        do{
            System.out.println("\nMENU PROCESADOR "
                +"\n1.-LLENAR PILA"
                +"\n2._IMPRIMIR TABLA"
                +"\n3.-Salir\n"
                + "Elige la opcion deseada");
            op=entrada.nextInt();
            
            switch (op){
                case 1:
                    int numal;
                    numal=(int) (Math.random()*(50-1+1)+1);
                    Pila_p.llenarLdC(numal);
                    break;
                case 2:
                    Pila_p.imprimirTab();break;
                default:System.out.println(" Dato incorrecto!!!");
            }
        }while(op!=3);
    }
}