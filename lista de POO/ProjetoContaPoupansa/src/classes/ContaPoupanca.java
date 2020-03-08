/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Computador
 */
public class ContaPoupanca {

    //ATRIBUTOS DO PROJETO 
    private String nomeDoCliente = ""; //nome do cliente 
    private int numeroDaConta = 0; // numero da  conta 
    private int agencia = 0; // agemcia que o cliente pertence 
    private float saldo = 0; // saldo que o cilente possui na poupança 
    //agencia numero nome
   //get
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    //
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
}
