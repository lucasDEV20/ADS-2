/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetofigurasgeometricas;

/**
 * Cronstrução da Classe abstrata Figura Geometrica.
 * @author eugeniojulio
 */
public class FiguraGeometrica {
  //Atributo protegido
  protected float raio = 0;
  
  public FiguraGeometrica(float raio ){this.raio = raio;}
  public float getRaio() {return raio;}
  public void setRaio(float raio ) {this.raio = raio;}
}
