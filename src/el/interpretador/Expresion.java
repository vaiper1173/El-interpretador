/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.interpretador;

/**
 *
 * @author victo
 */
public abstract class Expresion {
    
    public abstract String uno();
    public abstract String cuatro();
    public abstract String cinco();
    public abstract String nueve();
    public abstract int multiplicador();
    
    public void interpretador (Contexto contexto){
        if (contexto.entrada.startsWith(nueve())) {
            contexto.salida += (9 * multiplicador());
            contexto.entrada = contexto.entrada.substring(2);
        }
        
        else if (contexto.entrada.startsWith(cuatro())) {
            contexto.salida += (4 * multiplicador());
            contexto.entrada = contexto.entrada.substring(2);
        }
        
        else if (contexto.entrada.startsWith(cinco())) {
            contexto.salida += (5 * multiplicador());
            contexto.entrada = contexto.entrada.substring(1);
        }
        
        while (contexto.entrada.startsWith(uno())) {
            contexto.salida += (1 * multiplicador());
            contexto.entrada = contexto.entrada.substring(1);
        }
    }
}
