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
public class ProjetoFigurasGeometricas {

  /**
   * @param args the command line arguments
   */
  //Criacao do metodo que usa o polimorfismo
  public static void imprimirObjeto(FiguraGeometrica objeto){
    System.out.println("****  Metodo Imprimir Objeto ****");
    System.out.println("Figura: " + objeto.tipoFigura());
    System.out.println("Raio: " + objeto.getRaio());
    System.out.println("Area Total: " + objeto.areaTotal());
    System.out.println("Volume: " + objeto.volume());
    System.out.println("**********************************");
}
  public static void main(String[] args) {
    // TODO code application logic here
    
    // Criando instancias das Classes Esfera, Cilindro e Cone;
    Esfera objetoEsfera = new Esfera(5);
    Cilindro objetoCilindro = new Cilindro(5,5);
    Cone objetoCone = new Cone(3,4);

    //Mostrando os dados do Objeto Esfera
    imprimirObjeto(objetoEsfera);
    System.out.println();
    //Mostrando os dados do  Objeto Cilindro
    imprimirObjeto(objetoCilindro);
    System.out.println("Areal Lateral: " +objetoCilindro.areaLateral());
    System.out.println("**********************************\n");
    //Mostrando os dados do objeto Cone
    imprimirObjeto(objetoCone);
    System.out.println("Areal Lateral: " + objetoCone.areaLateral()) ;
    System.out.println("Geratriz: " + objetoCone.geratriz()) ;   
    System.out.println("**********************************\n");
    
  }
  
}
