//Amanda Carolyne de Lima

import java.util.Scanner;

public class Salario{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int func = entrada.nextInt();
        int horas = entrada.nextInt();
        double valorHora = entrada.nextDouble();
        double salario = horas * valorHora;
        
        System.out.println("NUMBER = " + func);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
}