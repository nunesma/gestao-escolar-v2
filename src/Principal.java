import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        var e1 = new Estudante();
        e1.nome = "Rodrigo";
        var e2 = new Estudante();
        e2.nome = "Ana";
        var e3 = new Estudante();
        e3.nome = "Maria";

        var turma1 = new Turma();
        turma1.codigo = "T01";
        turma1.estudantes = new ArrayList<Estudante>();
        turma1.estudantes.add(e1);
        turma1.estudantes.add(e2);
        turma1.estudantes.add(e3);

        for (Estudante estudante : turma1.estudantes) {
            System.out.println(estudante.nome);
        }




        /*
        var lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(15);
        lista.add(1200);
        lista.add(999);
        lista.add(0);
        lista.add(4);
        lista.add(10);

        //lista.remove(1);

        for (int numero : lista) {
            System.out.println(numero);
        }






        /*

        System.out.println("Cadastro de Estudantes");

        var leitor = new Scanner(System.in);

        System.out.println("Digite o numero de estudantes para cadastrar");
        var qtdEstudantes = Integer.parseInt(leitor.nextLine());
        var estudantes = new Estudante[qtdEstudantes];

        int qtdcadastrados = 0;
        while (qtdcadastrados != qtdEstudantes) {
            var estudante = new Estudante();

            System.out.println("Digite o nome do estudante");
            estudante.nome = leitor.nextLine();

            System.out.println("Digite o telefone do estudante");
            estudante.telefone = leitor.nextLine();

            System.out.println("Digite o endereco do estudante");
            estudante.endereco = leitor.nextLine();

            System.out.println("Digite o responsavel do estudante");
            estudante.responsavel = leitor.nextLine();

            estudantes[qtdcadastrados] = estudante;

            qtdcadastrados++;
        }

        for(Estudante e : estudantes) {
            System.out.println("Nome: " + e.nome);
            System.out.println("Telefone: " + e.telefone);
            System.out.println("Endereco: " + e.endereco);
            System.out.println("Responsavel: " + e.responsavel);
        }















        /*
        var estudante1 = new Estudante();
        var estudante2 = new Estudante();
        var turma1 = new Turma();
        var turma2 = new Turma();

        estudante1.nome = "Rodrigo";
        estudante1.telefone = "123456";
        estudante1.endereco = "Rua xpto";

        estudante2.nome = "Maria";
        estudante2.telefone = "999888";
        estudante2.endereco = "Quadra 1 numero 3";

        turma1.codigo = "T01";
        turma1.finalizada = false;

        turma2.codigo = "T02";
        turma2.finalizada = true;

        System.out.println(estudante2.nome);
        System.out.println(estudante2.telefone);
        System.out.println(estudante2.endereco);
        System.out.println(turma1.codigo);
        System.out.println(turma1.finalizada);






















        /*
        System.out.println("Boas vindas ao Sistema de Gestao Escolar!");
//        Scanner que vai ler do teclado
        var leitor = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        var nome = leitor.nextLine();

        System.out.println("Digite a idade do estudante");
        var idade = leitor.nextInt();

        var opcao = 0;
        var somatorio = 0.0;
        var quantidadesNotas = 0;
        var tirouZero = false;

        while (opcao != -1) {

            System.out.println("Digite a nota do estudante");
            var nota = leitor.nextDouble();

            if (nota == 0) {
                tirouZero = true;
            }

            somatorio += nota;
            quantidadesNotas++;

            System.out.println("Digite qualquer numero para informar outra nota? (0u -1 caso nao queira mais digitar notas)");
            opcao = leitor.nextInt();
        }

        var media = somatorio / quantidadesNotas;

        System.out.println("Media do estudante " + nome + " : " + media);

        var aprovado = true;
        if (media >= 7 && !tirouZero) {
            System.out.println("Estudante aprovado!");
        } else {
            System.out.println("Estudante reprovado");
            aprovado = false;
        }

        System.out.println(aprovado);

//        var passou = nota >= 7.0;
//
//        if (nota == 10) {
//            System.out.println("Parabens! Prova gabaritada");
//        }
//
//        if (passou) {
//            System.out.println("O estudante " + nome + " passou com nota: " + nota);
//        } else {
//            System.out.println("O estudante " + nome + " reprovou com nota: " + nota);
//        }

         */



    }
}
