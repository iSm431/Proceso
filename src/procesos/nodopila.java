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
public class nodopila {
    int No_p;
    int TT;
    nodopila sig;
    Listas_dobles listap;
    public nodopila(int d, int T){
        No_p=d;
        TT=T;
        sig=null;
    }

    nodopila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
