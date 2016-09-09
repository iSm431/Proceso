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
public class pila {
    protected nodopila cima;
    protected nodopila primero;
    int n_proc;
    
    public pila(){
        cima=null;
        primero=null;
        n_proc=0;
    }
    
    public boolean estaVacia(){
        return cima==null;
    }
    
    public void llenarP(int No_p, int T){
        
        if(estaVacia())
        {
            nodopila nuevo = new nodopila(No_p,T);
            primero=nuevo;
            nuevo.sig=cima;
            //cima.sig = nuevo;
        }
        else
        {
            nodopila nuevo = new nodopila(No_p,T);
            nuevo.sig=cima;
            cima.sig = nuevo;
        }
    }
    
    public int sacar(){
        int aux=cima.No_p;
        cima=cima.sig;
        n_proc--;
        return aux;
    }
    
    public int cima(){
        return cima.No_p;
    }
    
    public int tampila(){
        return n_proc;
    }
    
    public void limpila(){
        while(!estaVacia()){
            sacar();
        }
    }
    
    public int sumaTTSp(int TTSp){
        int TT=0;
        nodo actual=cima.listap.primero;
        while(actual!=null){
            TT=TT+cima.listap.ultimo.getT();
            System.out.println(TT+"\n\n");
        }
        return TT;
    }
    
    public void llenarLdC(int numAleatP){
        Random rnd = new Random();
        int i = 1;
        
        while(i<=numAleatP){
            int numAleatSp = (int) (Math.random()*(20-1+1)+1);
            System.out.println(numAleatSp);
            int j=1;
            //llenar pila con la cima
            this.llenarP(i,0);
            while(j<=numAleatSp){
                //llenar lista de la cima N
                int TTSp=(int) (Math.random()*(500-100+1)+100);
                System.out.println(TTSp);
                cima.listap.alta(j,TTSp); 
                j++;
            }
            this.cima.TT=
            i++;
        }
    }
    
    public void imprimirTab(){
        nodopila cima2=primero;
        while(cima!=null){
            System.out.println(cima2.No_p+"\n\n\n\n");
            while(cima.listap!=null){
                System.out.println(cima2.No_p);
            }
        }
    }
}
