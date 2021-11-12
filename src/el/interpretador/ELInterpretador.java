/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.interpretador;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author victo
 */
public class ELInterpretador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String romano = "XIX";
        Contexto contexto = new Contexto(romano);
        // Armamos las cosas
        ArrayList<Expresion> arbol = new ArrayList<Expresion>();
        arbol.add(new centenaExpresion());
        arbol.add(new decenaExpresion());
        arbol.add(new unidadExpresion());
        
        //ahora Invoacamos al Supremo Interpretador
        Iterator<Expresion> it = arbol.iterator();
        do {            
            Expresion ex = it.next();
            ex.interpretador(contexto);
        } while (it.hasNext());
        
        System.out.println(contexto.salida);
    }
    
}
