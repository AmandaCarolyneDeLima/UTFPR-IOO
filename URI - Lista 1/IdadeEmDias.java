//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class IdadeEmDias{
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            
            int idade = entrada.nextInt();
            int ano = idade / 365;
            int mes = (idade % 365) / 30;
            int dia = (idade % 365) % 30;

            System.out.printf("%d ano(s)\n",ano);
            System.out.printf("%d mes(es)\n",mes);
            System.out.printf("%d dia(s)\n",dia);
        }
    }
}