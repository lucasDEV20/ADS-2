/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.numero;

/**
 *
 * @author Computador
 */
public class conplexo {

    //atributos do programa 
    //um numero imaginario possui a seguinte forma
    //parte real + parte imaginaria *i(imaginaria) (s+bi)
    //onde i e a raiz quadrada   de - 1 
    private int parteReal = 0;
    private int parteImaginaria = 0;

    //metodos construtores 
    public conplexo() {
        parteReal = 0;
        parteImaginaria = 0;

    }

    public conplexo(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;

    }

    public conplexo(conplexo objeto) {
        this.parteReal = objeto.parteReal;
        this.parteImaginaria = objeto.parteImaginaria;

    }

    public String get() {
        return String.format("%d + %di", parteReal, parteImaginaria);
    }

    public void set(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;

    }

    public void set(conplexo objeto) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;

    }

    // Cálculos
    // v. adicionar, recebe uma outra instância da classe Número Complexo e adiciona este
    // número complexo com o encapsulado usando a fórmula (a+bi)+(c+di) = (a+c)+(b+d)i e
    // devolve um novo Número Complexo como resposta;
    public conplexo adicionar(conplexo objeto) {
        int real = this.parteReal + objeto.parteReal;
        int imaginario = this.parteImaginaria + objeto.parteImaginaria;
        conplexo aux = new conplexo(real, imaginario);
        return aux;

    }

    // vi. subtrair, recebe uma outra instância da classe Número Complexo e subtrai este número
    // complexo com o encapsulado usando a fórmula (a+bi)−(c+di) = (a−c)+(b−d)i e devolve
    // um novo Número Complexo como resposta;
    public conplexo subtrair(conplexo objeto) {
        int real = this.parteReal + objeto.parteReal;
        int imaginario = this.parteImaginaria - objeto.parteImaginaria;
        conplexo aux = new conplexo(real, imaginario);
        return aux;

    }

    // vii. multiplicar, recebe uma outra instância da classe Número Complexo e multiplica este
    // número complexo com o encapsulado usando a fórmula (a+bi)∗(c+di) = (ac−bd)+(ad+bc)i
    // e devolve um novo Número Complexo como resposta;
    public conplexo multiplicar(conplexo objeto) {
        conplexo aux = new conplexo();
        return aux;
    }
      // viii. dividir, recebe uma outra instância da classe Número Complexo e divide este número
    // complexo com o encapsulado usando a fórmula (a+bi)/(c+di) = (ac+bd)/(c 2 +d 2 ) + ((bc-
    // ad)/(c 2 +d 2 ))i e devolve um novo Número Complexo como resposta.
    public conplexo dividir(conplexo objeto){
        conplexo aux = new conplexo();
        return aux;
    }
    // iv. verificar a igualdade, recebe uma outra instância da classe Número Complexo e retorna
    // true se os valores dos campos encapsulados forem iguais aos da instância passada
    // como argumento;
    public boolean igual (conplexo objeto ){
          conplexo aux = new conplexo();
          return (aux == objeto);   
    }
}
