package edu.ifpb.padroes.dao.model;

/**
 *
 * @author lyndemberg
 */
public class Professor {
    private String matricula;
    private String nome;

    public Professor() {
    }

    public Professor(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
