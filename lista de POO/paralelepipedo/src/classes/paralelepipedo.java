/*
 Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto
 paralelepípedo em conformidade com o paradigma orientado a objeto. Posteriormente
 implemente esta classe. A classe deverá ter as seguintes características: altura, largura,
 comprimento, calcular volume e calcular área. O cálculo do volume (altura * comprimento *
 largura) e o cálculo da área ( 2 * (altura * largura + altura * comprimento + largura *
 comprimento)).
 */
package classes;

public class paralelepipedo {

    private int altura = 0;
    private int largura = 0;
    private int comprimento = 0;

    /**
     * @return a altura
     */
    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param altura a altura para definir
     */
    public void setAltura(int altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("altura invalida");
        }

        this.altura = altura;
    }

    /**
     * @param largura a largura para definir
     * @return a largura
     */
    public void setLargura(int largura) throws Exception {
        if (altura <= 0) {
            throw new Exception("largura invalida");
        }
        this.largura = largura;
    }

    /**
     * @param comprimento o comprimento para definir
     * @return a comprimento
     */
    public void setComprimento(int comprimento) throws Exception {
        if (altura <= 0) {
            throw new Exception("comprimento invalida");
        }
        this.comprimento = comprimento;
    }

    public int calcularVolume() throws Exception {
        if (altura <= 0 || largura <= 0 || comprimento <= 0) {
            throw new Exception("medidas invalidas");
        }
        return (altura * comprimento * largura);
    }
    public int calcularArea() throws Exception {
        if (altura <= 0 || largura <= 0 || comprimento <= 0) {
        throw new Exception("medidas invalidas ");
        
    }
    return (2 * (altura * largura + altura * comprimento + largura * comprimento));
    }
}

