//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class Esfera{
	
    public static final pi = 3.14159;
	
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        double raio = leitor.nextDouble();
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
