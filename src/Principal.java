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

        System.out.println("Digite a nota 1 do estudante");
        var nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2 do estudante");
        var nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3 do estudante");
        var nota3 = leitor.nextDouble();

        var media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media do estudante: " + media);

        var aprovado = true;
        if (media >= 7) {
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
