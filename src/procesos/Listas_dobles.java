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
public class Listas_dobles {
    nodo primero;
    nodo ultimo;
    Listas_dobles()
    {
        primero=null;
        ultimo=null;
    }
 
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public Listas_dobles alta(int no, int T)
    {
        if(estavacio())
        {
            nodo nuevo = new nodo(no,T);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodo nuevo = new nodo(no,T);
            ultimo.sig = nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
 
    public Listas_dobles borrar(int a)
    {
        nodo w=primero;
        nodo y;
        for(int i=0;i<a;i++)
        {
            y=w.ant;
            w=w.sig;
        }
        y=w.ant;
        return this;
    }
 
    public boolean delete(int num)
    {
        nodo anterior=null;
        nodo actual=primero;
        while(actual!=ultimo)
        {
            if(actual.getNo()==num)
            {
                if(anterior==null)
                {
                    primero=actual.sig;
                    primero.ant=null;
                }
                else{
                    anterior.sig=actual.sig;
                    nodo temporal;
                    temporal=actual.sig;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.sig;
        }
        if(num==ultimo.getNo())
        {
            ultimo=actual.ant;
            return true;
        }
        return false;
    }
 
    public void imprimir2()
    {
        nodo actual;
        actual=ultimo;
        while(actual != null)
        {
            System.out.println(actual.No_proc);
            actual=actual.ant;
        }
    }
    
    public void imprimir()
    {
        nodo actual;
        int i=0;
        actual=primero;
        while(actual != null)
        {
            System.out.println(actual.No_proc);
            actual=actual.sig;
        }
    }
} 