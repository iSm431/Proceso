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
public class nodo {
    protected int No_proc;
    protected int Tmp_proc;
    
    protected nodo sig;
    protected nodo ant;
    boolean dato;
    
    nodo(int no, int T){
        this.No_proc = no;
        this.Tmp_proc = T;
        this.sig = null;
        this.ant = null;
    }

    nodo() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setNo(int No){
        No_proc = No;
    }
    
    public void setT(int T){
        Tmp_proc = T;
    }
    
    public int getNo(){
        return No_proc;
    }
    
    public int getT(){
       return Tmp_proc;
    }
}
