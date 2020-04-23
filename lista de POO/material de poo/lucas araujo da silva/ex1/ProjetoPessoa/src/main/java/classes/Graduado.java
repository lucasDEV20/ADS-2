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
public class Graduado extends Estudante{
    private String AnoDaConclusao;
    private String AnoDaColacaoDeGrau;
    private String NumeroDoDiploma;
    
    public Graduado (){
        
    }

    public Graduado(String AnoDaConclusao, String AnoDaColacaoDeGrau, String NumeroDoDiploma) {
        this.AnoDaConclusao = AnoDaConclusao;
        this.AnoDaColacaoDeGrau = AnoDaColacaoDeGrau;
        this.NumeroDoDiploma = NumeroDoDiploma;
    }

    public Graduado(String AnoDaConclusao, String AnoDaColacaoDeGrau, String NumeroDoDiploma, String matricula, String campus, String Vcurso, String nome, String endereço, String telefone, String email) {
        super(matricula, campus, Vcurso, nome, endereço, telefone, email);
        this.AnoDaConclusao = AnoDaConclusao;
        this.AnoDaColacaoDeGrau = AnoDaColacaoDeGrau;
        this.NumeroDoDiploma = NumeroDoDiploma;
    }

    public String getAnoDaConclusao() {
        return AnoDaConclusao;
    }

    public void setAnoDaConclusao(String AnoDaConclusao) {
        this.AnoDaConclusao = AnoDaConclusao;
    }

    public String getAnoDaColacaoDeGrau() {
        return AnoDaColacaoDeGrau;
    }

    public void setAnoDaColacaoDeGrau(String AnoDaColacaoDeGrau) {
        this.AnoDaColacaoDeGrau = AnoDaColacaoDeGrau;
    }

    public String getNumeroDoDiploma() {
        return NumeroDoDiploma;
    }

    public void setNumeroDoDiploma(String NumeroDoDiploma) {
        this.NumeroDoDiploma = NumeroDoDiploma;
    }
    
}
