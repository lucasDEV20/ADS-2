/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//professor eu copiei algumas partes do codigo dos meus colegas 
//pq tive dificuldade pra entender
//se o senhor quiser posso eexplicar o codigo pq eu estudei ele
//eu prefiropo falar a vferdade doque ficar me enganando
//prometo que isso nao vai msi acontecer

package classes;

/**
 *
 * @author Computador
 */
public class NumeroNatural {

    private long numero = 0;

    // construtores 
    //1 construtor defaut 
    //
    //---------------------------------------------------------------------------------------------
    public NumeroNatural() throws Exception {
        //este constrtor serve para inicializar o objeto e os  atributos
        numero = 0;
    }

    // 2 construtor encaminhadnodo os valores no construtor
    public NumeroNatural(long numero) throws Exception {
        if (numero < 0) {
            throw new Exception("numero nao pode ser menor que zero ");
        }
        this.numero = numero;
    }

    public NumeroNatural(NumeroNatural valor) {
        numero = valor.numero;
    }
   //-----------------------------------------------------------------------------------------------
    /**
     * @param numero , que retorna um valor depois de chamar o atribo eu set ele
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) throws Exception {
        /**
         * @param numero nao pode ser menor que zero primeiraa exessao
         */
        if (numero < 0) {
            throw new Exception("Numero nao pode ser menor que zero ");
        }

        this.numero = numero;

    }

    public void setNumero(NumeroNatural valor)throws Exception{
        //segundo set
     
        this.numero = valor.numero;
    }

   public NumeroNatural calcularFatorial() throws Exception {
        
        long fatorial = 1;
        for (long i = numero; i >= 1; i--) {
            fatorial *= i;

            if (fatorial <= 0) {
                throw new Exception(" FATORIAL < 0 ");
            }
        }
        return new NumeroNatural(fatorial);
    }
//-----------------------------------------------------------------------
    public boolean eQuadradoPerfeito() { //
       //long resultado que vai receber o atributo nu,mero e dar o valor do calculo 
       long resultado = (long)Math.sqrt(this.numero);
        if (resultado * resultado == numero) {
            return true ;
        }else{
            return false;
        }

    }
    
//=-----------------------------------------------------------------------
    

  public boolean eNumeroPerfeito() {
      //regras do numero perfeito
        long auxiliar =this.numero;
        long metadeDoNumero = auxiliar / 2;
        long soma = 0;
        for (int i = 1; i <= metadeDoNumero; i++) {
            if (auxiliar % i == 0) {
                soma += i;
            }
        }
        if (soma == auxiliar) {
            return true;
        } else {
            return false;

        }

    }
//----------------------------------------------------------------------------------------------------
    public boolean eCapicula() {
//Para obter um número capicua a partir de outro, 
//inverte-se a ordem dos algarismos e soma-se com o número dado,
//um número de vezes até que se encontre um número capicua, como por exemplo:
//Partindo do número 84: 84+48=132;132+231=363, que é um número capicua.
        long auxiliar = 0, NnumeroInvestido, resto;
        auxiliar = this.numero;
        NnumeroInvestido = 0;
        resto = 0;
        resto = auxiliar % 10;
        auxiliar = auxiliar / 10;
        NnumeroInvestido = NnumeroInvestido * 10 + resto;
        while (auxiliar != 0) {
            resto = auxiliar % 10;
            NnumeroInvestido = NnumeroInvestido * 10 + resto;
            auxiliar = auxiliar / 10;
        }
        if (NnumeroInvestido == numero) {
            return true;
        }

        return false;

    }

    public boolean eNumeroPrimo() {
//        Números primos são os números naturais que têm apenas dois divisores diferentes:
//        o 1 e ele mesmo. Exemplos: 1) 2 tem apenas os divisores 1 e 2,
//        portanto 2 é um número primo. 2)
//        17 tem apenas os divisores 1 e 17, portanto 17 é um número primo.
        long auxiliar = this.numero;
        long conttador = 0;
        for (long i = 1; i <= auxiliar; i++) {
            if (auxiliar % i == 0) {
                conttador++;
            }
        }
        if (conttador == 2) {
            return true;
        }
        return false;

    }


        public String mudarBase(int base) {
// Assim, podemos montar o seguinte logaritmo:
//z = log b ay → utilizando uma das propriedades operatórias dos logaritmos, temos:
//z = y . log b a → substituindo z por log b x, temos:
//log b x = y . log b a → substituindo y por loga x, temos:
//log b x = loga x . log b a → isolando o logaritmo de base a, temos:
//loga x = log b x
//log b a
            
        long n = this.numero;
        String baseConvertida = Long.toString(n, base);
        return baseConvertida;
    }

    public NumeroNatural calcularMMC(NumeroNatural objeto) throws Exception {
//        O mínimo múltiplo comum (MMC) corresponde ao menor número inteiro positivo, 
//        diferente de zero, que é múltiplo ao mesmo tempo de dois ou mais números.
//        Lembre-se que para encontrar os múltiplos de um número,
//        basta multiplicar esse número pela sequência dos números naturais.
        long PrimeiroNumero = this.numero,SegundoNumero = objeto.numero, soma, auxiliar;
        if (PrimeiroNumero < SegundoNumero) {
            auxiliar = PrimeiroNumero;
            PrimeiroNumero = SegundoNumero;
            SegundoNumero = auxiliar;
        }
        soma = PrimeiroNumero;
        while (soma % SegundoNumero != 0) {
            soma += PrimeiroNumero;
        }

        return new NumeroNatural(soma);

    }

    public NumeroNatural calcularMDC(NumeroNatural objeto) throws Exception {
//        MDC significa máximo divisor comum.
//        O máximo divisor comum entre dois ou mais números naturais é o maior de seus divisores. 
//        Dois números naturais sempre têm divisores em comum.
//        Os divisores de um número natural podem ser encontrados dividindo
//        este número pelos números naturais maiores que zero. 
//        Quando a divisão for exata, ou seja, com resto zero,
//        então tal número é divisor do número dado.

 

        long auxiliar, resto;
        long PrimeiroNumero = this.numero, SegundoNumero = objeto.numero;

        if (PrimeiroNumero < SegundoNumero) {
            auxiliar = PrimeiroNumero;
            PrimeiroNumero = SegundoNumero;
            SegundoNumero = auxiliar;
        }

        resto = PrimeiroNumero % SegundoNumero;

        while (resto != 0) {
            PrimeiroNumero = SegundoNumero;
            SegundoNumero = resto;
            resto = PrimeiroNumero % SegundoNumero;
        }
        return new NumeroNatural(SegundoNumero);

    }
    public boolean saoPrimosEntreSi(NumeroNatural objeto) {
//        Dois números, são chamados de primos entre si, quando o seu único divisor em comum é a unidade. 
//        Desta definição resulta que o MDC (Máximo Divisor Comum) entre esses dois números é o número 1.
        long auxiliar, resto, Resultado_1, Resultado_2;
        long PrimeiroNumero = this.numero, SegundoNumero = objeto.numero;

        if (PrimeiroNumero < SegundoNumero) {
            auxiliar = PrimeiroNumero;
            PrimeiroNumero = SegundoNumero;
            SegundoNumero = auxiliar;
        }

        resto = PrimeiroNumero % SegundoNumero;

        while (resto != 0) {
            PrimeiroNumero = SegundoNumero;
            SegundoNumero = resto;
            resto = PrimeiroNumero % SegundoNumero;
        }
        Resultado_1 = SegundoNumero;
        if (SegundoNumero < PrimeiroNumero) {
            auxiliar = SegundoNumero;
            SegundoNumero = PrimeiroNumero;
            SegundoNumero = auxiliar;
        }

        resto = SegundoNumero % PrimeiroNumero;

        while (resto != 0) {
            SegundoNumero = PrimeiroNumero;
            PrimeiroNumero = resto;
            resto = SegundoNumero % PrimeiroNumero;
        }
        Resultado_2 = PrimeiroNumero;

        if (Resultado_1 == 1 && Resultado_2 == 1) {
            return true;
        }

        return false;
    }

}
