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
public abstract class FiguraGeometrica {
  //Atributo protegido
  protected float raio = 0;
  
  public FiguraGeometrica(float raio ){this.raio = raio;}
  public float getRaio() {return raio;}
  public void setRaio(float raio ) {this.raio = raio;}
  public abstract float areaTotal(); // Metodo Abstrato - sem codigo
  public abstract float volume();// Metodo Abstrato - sem codigo
  public abstract String tipoFigura();// Metodo Abstrato - sem codigo

}
