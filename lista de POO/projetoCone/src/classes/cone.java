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
public class cone {
    //atrbutos
    private float raio = 0 ;
    private float altura = 0 ;

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio) {
        this.raio = raio;
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
    
    
    public float calcularGeratriz(){
        float valor = altura * altura + raio * raio;
        return (float)(Math.sqrt(valor));
        
        
    }
    public float calcularAreaLaterl(){
        return(float)(3.1415 * raio * calcularGeratriz());
        
    }
    
    public float calcularAreaTotal(){
        return(float )(3.1415 * raio * calcularGeratriz() + raio);
        
    }
    public float calcularVolume(){
        return (float)(1.0 / 1.0 * 3.1415 * raio * raio * altura );
    }
}
