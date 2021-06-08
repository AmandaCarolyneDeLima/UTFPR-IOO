public class Triangulo{

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getLadoA(){
        return ladoA;
    }

    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }

    public double getLadoB(){
        return ladoB;
    }

    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }

    public double getLadoC(){
        return ladoC;
    }

    public void setLadoC(double ladoC){
        this.ladoC = ladoC;
    }

    public String getOrdem(){
        
        double aux;

        if (ladoB > ladoA && ladoB > ladoC) {
            aux = ladoA;
            ladoA = ladoB;
            ladoB = aux;
        } else if (ladoC > ladoA) {
            aux = ladoA;
            ladoA = ladoC;
            ladoC = aux;
        }
      
        return ladoA + "\n" + ladoB + "\n" + ladoC;
    }

    public String tipoTriangulo(){
     
        if (ladoA >= (ladoB + ladoC)) {
            return "NAO FORMA TRIANGULO";
        }
        else{
            if (ladoA * ladoA > (ladoB * ladoB) + (ladoC * ladoC)){
                return "TRIANGULO OBTUSANGULO";
            }else if (ladoA * ladoA < (ladoB * ladoB) + (ladoC * ladoC)) {
                return "TRIANGULO ACUTANGULO";
            }else{
                return "TRIANGULO RETANGULO";
            }
        }
    }

    public String formaTriangulo(){
        if ((ladoA == ladoB) && (ladoB == ladoC)){
            return "TRIANGULO EQUILATERO";
        }else if ((ladoA == ladoB) || (ladoA == ladoC)|| (ladoB == ladoC)){
            return "TRIANGULO ISOSCELES";
        }else
            return "";
    }
}