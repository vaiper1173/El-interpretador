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
public class decenaExpresion extends Expresion{

    @Override
    public String uno() {
        return "X";
    }

    @Override
    public String cuatro() {
        return "XL";
    }

    @Override
    public String cinco() {
        return "L";
    }

    @Override
    public String nueve() {
        return "XC";
    }

    @Override
    public int multiplicador() {
        return 10;
    }
    
}
