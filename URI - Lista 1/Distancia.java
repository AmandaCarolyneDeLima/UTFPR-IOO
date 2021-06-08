//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class Distancia{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int km = entrada.nextInt();
        int minutos = (60 * km) / 30;
        
        System.out.println(minutos + " minutos"); 
    }	
}