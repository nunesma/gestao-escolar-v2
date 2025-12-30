import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class CadastroDeEstudante {

    private Path arquivo;

    public CadastroDeEstudante() {
        try {
            this.arquivo = Path.of("estudantes.csv");
            if (!Files.exists(arquivo)) {
                Files.createFile(arquivo);
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo de estudantes!");
        }
    }

    public void cadastrar(Estudante estudante) {
        //validacoes
        if (estudante.getNome().isBlank()) {
            throw new IllegalArgumentException("Campo nome é obrigatório!");
        }

        if (estudante.getTelefone().isBlank()) {
            throw new IllegalArgumentException("Campo telefone é obrigatório!");
        }

        if (estudante.getEndereco().isBlank()) {
            throw new IllegalArgumentException("Campo endereço é obrigatório!");
        }

        if (estudante.getResposavel().isBlank()) {
            throw new IllegalArgumentException("Campo responsável é obrigatório!");
        }

        try {
            Files.writeString(
                    arquivo,
                    estudante.getNome() + "," + estudante.getTelefone() + "," + estudante.getEndereco() + "," + estudante.getResposavel() + "\n",
                    StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar estudante no arquivo!");
        }
    }

    public ArrayList<Estudante> listar() {
        var lista = new ArrayList<Estudante>();

        try {
            var linhas = Files.readAllLines(arquivo);

            for(var linha : linhas) {
                var campos = linha.split(",");
                var estudante = new Estudante(campos[0], campos[1], campos[2], campos[3]);
                lista.add(estudante);
            }

            return lista;
        } catch (Exception e) {
            System.out.println("Erro ao carregar estudantes do arquivo!");
            return lista;
        }
    }

}
