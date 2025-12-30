import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        /*
         * Exibir o menu principal
         * Ler do teclado opcao do usuario
         * Para cada opcao, implementar algoritmo especifico, ate que a opcao 5 seja escolhida
         * Opcao 1: cadastrar turma
         * Opcao 2: cadastrar estudante
         * Opcao 3: listar turmas
         * Opcao 4: lsitar estudantes
         * Opcao 5: sair
         */

        var turmas = Path.of("turmas.csv");
        if (!Files.exists(turmas)) {
            Files.createFile(turmas);
        }
        var estudantes = Path.of("estudantes.csv");
        if (!Files.exists(estudantes)) {
            Files.createFile(estudantes);
        }
        var leitor = new Scanner(System.in);
        var opcaoDigitada = 0;

        while (opcaoDigitada != 5) {
            exibirMenu();
            opcaoDigitada = Integer.parseInt(leitor.nextLine());
            if (opcaoDigitada == 1) {
                cadastrarTurma(leitor, turmas);
            } else if(opcaoDigitada == 2) {
                cadastrarEstudante(leitor, estudantes);
            } else if(opcaoDigitada == 3) {
                listarTurmas(turmas);
            } else if(opcaoDigitada == 4) {
                listarEstudantes(estudantes);
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("Menu principal:");
        System.out.println("1 - Cadastrar turma");
        System.out.println("2 - Cadastrar estudante");
        System.out.println("3 - Listar turmas");
        System.out.println("4 - Listar estudantes");
        System.out.println("5 - Sair");
        System.out.println("Digite o código da opção desejada:");
    }

    private static void listarEstudantes(Path arquivo) {
//        for(var estudante : estudantes) {
//            System.out.println("Nome: " +estudante.getNome());
//            System.out.println("Telefone: " +estudante.getTelefone());
//            System.out.println("Endereco: " +estudante.getEndereco());
//            System.out.println("Responsável: " +estudante.getResposavel());
//        }
    }

    private static void listarTurmas(Path arquivo) throws IOException {
        var linhas = Files.readAllLines(arquivo);

        for(var linha : linhas) {
            var campos = linha.split(",");
            System.out.println(campos[0] + " - " + campos[1] + " - " + campos[2]);
        }
    }

    private static void cadastrarEstudante(Scanner leitor, Path arquivo) throws IOException {
        System.out.println("Digite o nome do estudante:");
        var nome = leitor.nextLine();
        System.out.println("Digite o telefone do estudante:");
        var telefone = leitor.nextLine();
        System.out.println("Digite o endereco do estudante:");
        var endereco = leitor.nextLine();
        System.out.println("Digite o nome do resposável pelo estudante:");
        var responsavel = leitor.nextLine();

        var estudante = new Estudante(nome, telefone, endereco, responsavel);
        Files.writeString(
                arquivo,
                estudante.getNome() + "," + estudante.getTelefone() + "," + estudante.getEndereco() + "," + estudante.getResposavel() + "\n",
                StandardOpenOption.APPEND);
    }

    private static void cadastrarTurma(Scanner leitor, Path arquivo) throws IOException {
        System.out.println("Digite o código da turma:");
        var codigo = leitor.nextLine();
        System.out.println("Digite o nome da turma:");
        var nome = leitor.nextLine();
        System.out.println("Digite a capacidade da turma:");
        var capacidade = Integer.parseInt(leitor.nextLine());

        var turma = new Turma(codigo, nome, capacidade);
        Files.writeString(
                arquivo,
                turma.getCodigo() + "," + turma.getNome() + "," + turma.getCapacidade() + "\n",
                StandardOpenOption.APPEND);
    }

}