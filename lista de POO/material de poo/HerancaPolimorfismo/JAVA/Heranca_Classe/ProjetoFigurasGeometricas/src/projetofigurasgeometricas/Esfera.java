/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetofigurasgeometricas;

/**
 *
 * @author eugeniojulio
 */
public class Esfera extends FiguraGeometrica{

    public Esfera(float raio){super(raio);} 

    @Override
    public float areaTotal() {return (float)(4*Math.PI*raio*raio);} 
    @Override
    public float volume(){return (float)((4.0/3.0)*Math.PI*raio*raio*raio);} 
    @Override
    public String tipoFigura() {return "Esfera";};

}
