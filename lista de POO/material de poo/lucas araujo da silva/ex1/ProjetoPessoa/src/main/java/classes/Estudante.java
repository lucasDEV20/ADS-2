/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class Estudante extends Pessoa{
    private String matricula ;
    private String campus ;
    private String Vcurso ; 
    
    public Estudante (){
        
    }

    public Estudante(String matricula, String campus, String Vcurso) {
        this.matricula = matricula;
        this.campus = campus;
        this.Vcurso = Vcurso;
    }

    public Estudante(String matricula, String campus, String Vcurso, String nome, String endereço, String telefone, String email) {
        super(nome, endereço, telefone, email);
        this.matricula = matricula;
        this.campus = campus;
        this.Vcurso = Vcurso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getVcurso() {
        return Vcurso;
    }

    public void setVcurso(String Vcurso) {
        this.Vcurso = Vcurso;
    }
    
}
