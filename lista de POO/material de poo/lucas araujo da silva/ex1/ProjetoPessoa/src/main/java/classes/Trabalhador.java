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
public class Trabalhador  extends Pessoa{
    private String Vfunçao ;
    private String salario ;
    private String departamento ;
    
    public Trabalhador (){
        
    }

    public Trabalhador(String Vfunçao, String departamento, String nome, String endereço, String telefone, String email) {
        super(nome, endereço, telefone, email);
        this.Vfunçao = Vfunçao;
        this.departamento = departamento;
    }

    public String getVfunçao() {
        return Vfunçao;
    }

    public void setVfunçao(String Vfunçao) {
        this.Vfunçao = Vfunçao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
