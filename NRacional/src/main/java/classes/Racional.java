/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Computador
 */
public class Racional {

    private int numerador = 0;
    private int denominador = 1;

    public Racional() { //defalt 
        this.numerador = 0;
        this.denominador = 1;

    }

    public Racional(int numerador, int denominador) throws Exception {
        this.numerador = numerador;
        if (denominador == 0) { //exception de divisao , as excessoes sao so feitas nas entradas 
            
            throw new Exception("Denominador nao pode ser igual a 0 ");
        }
        this.denominador = denominador;
    }

    public Racional(Racional objeto) {
        this.numerador = objeto.numerador;
        this.denominador = objeto.denominador;
    }
    public void set(int numerador , int denominador ){
        this.numerador = numerador;
        this.denominador = deno
    }
}
