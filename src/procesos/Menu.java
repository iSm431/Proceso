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
            System.out.print("\nMENU PROCESADOR "
                +"\n1.-LLENAR PILA"
                +"\n2.-IMPRIMIR TABLA"
                +"\n3.-Salir\n"
                + "Elige la opcion deseada: ");
            op=entrada.nextInt();
            
            switch (op){
                case 1:
                    int numal;
                    numal=50;
                    Pila_p.llenarLdC(numal);
                    break;
                case 2:
                    Pila_p.imprimirTab();
                    break;
                case 3: 
                    return;
                    default:System.out.println("\nDato incorrecto!!!");
            }
        }while(op!=3);
    }
}