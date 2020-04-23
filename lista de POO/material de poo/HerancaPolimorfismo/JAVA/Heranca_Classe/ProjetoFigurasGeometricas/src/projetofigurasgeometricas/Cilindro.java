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
public class Cilindro extends FiguraGeometrica{
  protected float altura = 0;
  
  public Cilindro (float raio, float altura){
    super(raio);
    this.altura =altura;
  }
  public void setAltura(float raio){// normal
    this.raio = raio;
  }
  public float gerAltura(){// normal
    return altura;
  }
  @Override
  public float areaTotal(){
    return (float)(2.0*Math.PI*raio*(altura+raio));
  }
  @Override
  public float volume(){
    return (float)(Math.PI*raio*raio*altura);
  }
  @Override
  public String tipoFigura(){
    return "Cilindro";
  }
  public float areaLateral(){
    return (float)(2.0*Math.PI*raio*altura);
  }		
  
}
