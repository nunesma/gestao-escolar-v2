import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
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



    }
}
