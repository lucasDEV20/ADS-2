/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author aluno
 */
//tudo que esta entre essas chaves e o escpo que se comunica entree si 
public class Piramede {
    private float base = 0;
    private float altura  = 0;

    /**
     * @return the base
     */
    public float getBase() {
        return base;
       //esta dentro da calsse pirmade 
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
        // so se encaixa dentro de um atributo 
        // pegue o atributo e faça ele recber um parametro 
        // quando eu esrevo this ele ja sabe que e um atributo base
        // sempre que ele perguntar ele quer saber o escopo 
        // so vai ocorrer erro se os nomes estverem iguais , e dentro do mesmo escopo
        // THIS e so pra distinguir  o paraetro o atributo 
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float caucularVolume(){
        return (float)(1.0/3.0 * base * altura);
        //return (float)(coersao em real  * base * altura);
        //formula do volume 
        //os numeros tem que ser intero
        //qualquer numero divido por 0 vai ser 0 , e depende do numero
        //um numero real e conposto da parte numerica e da parte fracionaria 
        //conversao e coersao 
        // int , cnjunto dos numeros inteiros
        // quando vc atribui em um long automaticamnete a coversao ocorre
        // o princpio da coersao, faça um valor se tornar u int
        //do menor paraa o menor eu nao preiso me preocupar , e do maior para o menor sim
        // int cabe pouco e um long e um int maior
        
    }
}
