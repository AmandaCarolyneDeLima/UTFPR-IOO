//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class Consumo{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int x = entrada.nextInt();
        double y = entrada.nextDouble();
        double media = x / y;
        
        System.out.println(String.format("%.3f km/l", media));   
    }
}