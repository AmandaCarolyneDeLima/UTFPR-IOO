//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import java.util.Scanner;

public class SalarioComBonus{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
  
        String nome = entrada.next();
        double salFixo = entrada.nextDouble();
        double vendas = entrada.nextDouble();
        double total = ((vendas * 15) / 100) + salFixo;
        
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
}