
public class Turma {

    private String codigo;
    private String nome;
    private int capacidade;

    public Turma(String codigo, String nome, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

}