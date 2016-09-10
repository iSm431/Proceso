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
    public nodopila cima;
    public nodopila primero;
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
            primero=cima=nuevo;
            n_proc++;
        }
        else
        {
            nodopila nuevo = new nodopila(No_p,T);
            nuevo.sig=cima;
            cima = nuevo;
            n_proc++;
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
    
    public int sumaTTSp(){
        int TT=0;
        Listas_dobles lista_p=cima.listap;
        nodo lista_nodlp=lista_p.primero;
        while(lista_nodlp!=null){
            TT=TT+lista_nodlp.Tmp_proc;
            lista_nodlp=lista_nodlp.sig;
        }
        return TT;
    }
    
    public pila llenarLdC(int numAleatP){
        cima=null;
        Random rnd = new Random();
        int i = 1;
        
        while(i<=numAleatP){                                                    //llenar pila con la cima N            
            int numAleatSp = (int) (Math.random()*(20-1+1)+1);                  //numero aleatorio para los procesos
            int j=1,TTSp=0;
            this.llenarP(i,0);                                                  //invocar funcion para llenar pila                      
            Listas_dobles aux = new Listas_dobles();                            //instanciar una lista doble en aux
            while(j<=numAleatSp){                                               //llenar lista de la cima N                
                TTSp=(int) (Math.random()*(500-100+1)+100);                     //numero aletorio de subprocesos
                aux.alta(j, TTSp);                                              //invoca funcion para llenar lista dobe
                j++;
            }
            cima.listap=aux;                                                    //copiar la lista doble en aux
            //System.out.println(" proceso "+cima.No_p); 
            i++;
            cima.TT=sumaTTSp();
            System.out.println(" TT "+cima.TT);
        }
        return this;
    }
    
    public void imprimirTab(){
        nodopila cima2=cima;
        while(cima2!=null){
            int tt=0,n=0;
            System.out.println("No proceso = "+cima2.No_p+"\n\n");
            Listas_dobles lista_p=cima2.listap;
            nodo lista_nodlp=lista_p.primero;
            while(lista_nodlp!=null){
                tt=tt+lista_nodlp.Tmp_proc;
                n++;
                System.out.println(" No subproceso= "+lista_nodlp.No_proc+" No Tempo= "+lista_nodlp.Tmp_proc);
                lista_nodlp=lista_nodlp.sig;
            }
            System.out.println("TSp = "+n+"\n");
            cima2=cima2.sig;
        }
    }
}
