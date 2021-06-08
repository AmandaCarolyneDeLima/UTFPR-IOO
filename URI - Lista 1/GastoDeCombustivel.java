//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class GastoDeCombustivel{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int tempo = entrada.nextInt();
        int velocidade = entrada.nextInt();
        double kilometros = tempo * velocidade;
        double media = kilometros / 12;
        
        System.out.println(String.format("%.3f", media)); 
    }
}