package com.github.tiagogomes187.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*        System.out.println("Digite seu nome completo: ");
        String nome = scan.nextLine();
        System.out.println("Olá " + nome);

        System.out.println("----------+----------+----------");

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("----------+----------+----------");

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("----------+----------+----------");

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/

        System.out.println("----------+----------+----------");

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação(true)ou (false): ");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte  qtdeFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeito nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Quantidade filhos: " + qtdeFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinhos? "+ temPet);

        scan.close();
    }
}
