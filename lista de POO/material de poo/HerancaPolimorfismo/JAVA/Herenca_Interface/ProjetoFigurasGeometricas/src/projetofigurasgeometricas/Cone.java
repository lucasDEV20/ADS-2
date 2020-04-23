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
public class Cone extends Cilindro{
  public Cone(float raio, float altura){
    super(raio,altura);
  }
  public float geratriz() {
    return (float)(Math.sqrt((altura*altura)+(raio*raio)));
  }
  @Override
  public float areaTotal(){
    return (float)(Math.PI*raio*(geratriz()+raio));
  }
  @Override
  public String tipoFigura(){
    return "Cone";
  }
  @Override
  public float areaLateral(){ 
    return (float)(Math.PI*raio*geratriz());
  }
  public float volume(){
    return (float)(1.0/3.0 * super.volume());
  } 
  
   
}
