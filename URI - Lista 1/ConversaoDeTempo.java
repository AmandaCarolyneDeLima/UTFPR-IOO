//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class ConversaoDeTempo{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int duracaoSegundos = entrada.nextInt();
        
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;
        
        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;
        
        int segundos = duracaoSegundos;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);		
    }
}