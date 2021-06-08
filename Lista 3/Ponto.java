//Modele computacionalmente a representação de um ponto no plano cartesiano.
//Sabe-se que um ponto deve ter valor inicial 0 (zero) tanto para o eixo x quanto
//para o eixo y. Além disso, deve ser possível instanciar um ponto informando os
//valores de x e y, também deve ser possível acessá-los e alterá-los. A
//representação em String de um ponto é P(x,y)

public class Ponto
{
   private int x;
   private int y;
   
   public Ponto() {
       this(1,1);
   }
   
   public Ponto(int x, int y) {
       this.x = x;
       this.y = y;
   }
   
   public String toString() {
     return "P(" + x + ", " + y +")";
   }
}