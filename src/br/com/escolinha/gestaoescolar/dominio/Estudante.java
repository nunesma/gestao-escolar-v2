package br.com.escolinha.gestaoescolar.dominio;

public class Estudante {

    private String nome;
    private String telefone;
    private String endereco;
    private String resposavel;

    public Estudante(String nome, String telefone, String endereco, String resposavel) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.resposavel = resposavel;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getResposavel() {
        return resposavel;
    }

}