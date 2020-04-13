/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.NumeroNatural;

public class teste {

    public static void main(String[] args) throws Exception {
        NumeroNatural obj1 = new NumeroNatural(5);
        
        NumeroNatural obj2 = new NumeroNatural(2);

        System.out.println("Resultado do Quadrado Perfeita : " + obj1.eQuadradoPerfeito());

        System.out.println("Resultado do Capcula : " + obj1.eCapicula());

        System.out.println("Resultado do numero perfeito : " + obj1.eNumeroPerfeito());

        System.out.println("Resultado do numero primo : " + obj1.eNumeroPrimo());

        System.out.println("Resultado do numero base : " + obj1.mudarBase(0));
        
        System.out.println("Resultado do Fatorial : " + obj1.calcularFatorial().getNumero());

        System.out.println("Resultado do MDC : " + obj1.calcularMDC(obj2).getNumero());

        System.out.println("Resultado DO MMC : " + obj1.calcularMMC(obj2).getNumero());
    }

}
