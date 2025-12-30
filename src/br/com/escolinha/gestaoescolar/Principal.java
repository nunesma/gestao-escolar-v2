package br.com.escolinha.gestaoescolar;

import br.com.escolinha.gestaoescolar.dominio.Estudante;
import br.com.escolinha.gestaoescolar.dominio.Turma;
import br.com.escolinha.gestaoescolar.funcionalidades.CadastroDeEstudante;
import br.com.escolinha.gestaoescolar.funcionalidades.CadastroDeTurma;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        var leitor = new Scanner(System.in);
        var opcaoDigitada = 0;

        while (opcaoDigitada != 5) {
            exibirMenu();
            opcaoDigitada = Integer.parseInt(leitor.nextLine());
            if (opcaoDigitada == 1) {
                cadastrarTurma(leitor);
            } else if (opcaoDigitada == 2) {
                cadastrarEstudante(leitor);
            } else if (opcaoDigitada == 3) {
                listarTurmas();
            } else if (opcaoDigitada == 4) {
                listarEstudantes();
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

    private static void listarEstudantes() {
        var cadastro = new CadastroDeEstudante();
        var estudantesCadastrados = cadastro.listar();
        for (var estudante : estudantesCadastrados) {
            System.out.println(estudante.getNome() + " - " +estudante.getTelefone() + " - " +estudante.getEndereco() + " - " +estudante.getResposavel());
        }
    }

    private static void listarTurmas() {
        var cadastro = new CadastroDeTurma();
        var turmasCadastradas = cadastro.listar();
        for (var turma : turmasCadastradas) {
            System.out.println(turma.getCodigo() + " - " +turma.getNome() + " - " +turma.getCapacidade());
        }
    }

    private static void cadastrarEstudante(Scanner leitor) {
        System.out.println("Digite o nome do estudante:");
        var nome = leitor.nextLine();
        System.out.println("Digite o telefone do estudante:");
        var telefone = leitor.nextLine();
        System.out.println("Digite o endereco do estudante:");
        var endereco = leitor.nextLine();
        System.out.println("Digite o nome do resposável pelo estudante:");
        var responsavel = leitor.nextLine();

        var estudante = new Estudante(nome, telefone, endereco, responsavel);

        var cadastro = new CadastroDeEstudante();
        try {
            cadastro.cadastrar(estudante);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar estudante: " +e.getMessage());
        }
    }

    private static void cadastrarTurma(Scanner leitor) {
        System.out.println("Digite o código da turma:");
        var codigo = leitor.nextLine();
        System.out.println("Digite o nome da turma:");
        var nome = leitor.nextLine();
        System.out.println("Digite a capacidade da turma:");
        var capacidade = Integer.parseInt(leitor.nextLine());

        var turma = new Turma(codigo, nome, capacidade);

        var cadastro = new CadastroDeTurma();
        try {
            cadastro.cadastrar(turma);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar turma: " +e.getMessage());
        }
    }

}