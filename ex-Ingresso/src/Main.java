import calculation.Ingresso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do filme? ");
        double valorFilme = sc.nextDouble();
        sc.nextLine();

        System.out.println("Qual o Nome do Filme? ");
        String nomeFilme = sc.nextLine();

        System.out.println("Qual o Tipo do Filme? ");
        String tipoFilme = sc.nextLine();

        Ingresso ingresso = new Ingresso(valorFilme, nomeFilme, tipoFilme);

        System.out.println("O nome do filme é: " + ingresso.getNomeFilme());
        System.out.println("O filme é: " + ingresso.getTipoFilme());
        System.out.println("O valor do ingresso meia é: " + ingresso.getValorMeia());
        System.out.println("O valor família é: " + ingresso.getValorFamilia());

        sc.close();

    }

}
