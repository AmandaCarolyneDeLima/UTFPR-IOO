//Modelo computacionalmente um retângulo, este pode ser instanciado: a) por
//meio de um construtor padrão, nessa caso o valor da base e da altura deve ser 1;
//b) informando o valor inicial de um dos lados; e, c) informando valor dos dois
//lados. A partir desses valores deve ser possível calcular a área e o perímetro.
//Também deve ser possível verificar se é um quadrado, se é maior que uma área
//informada e se é maior que outro retângulo informado.


public class Retangulo {
    private double ladoUm;
    private double ladoDois;
    
    public Retangulo(double lado) {
        this(lado, lado);
    }
    
    public Retangulo(double ladoUm, double ladoDois) {
        setLadoUm(ladoUm);
        setLadoDois(ladoDois);
    }
    
    public void setLadoUm(double ladoUm) {
        this.ladoUm = ladoUm;
    }
    public double getLadoUm() {
        return ladoUm;
    }
    
    public void setLadoDois(double ladoDois) {
        this.ladoDois = ladoDois;
    }
    public double getLadoDois() {
        return ladoDois;
    }
    
    public double getArea() {
        return ladoUm * ladoDois;
    }
    
    public double getPerimetro() {
        return ladoUm * 2 + ladoDois * 2;
    }
    
    public boolean eQuadrado() {
        return ladoUm == ladoDois;
    }
    
    public boolean temAreaMaiorQue(double area) {
        return getArea() > area;
    }
    
    public boolean temAreaMaiorQue(Retangulo r) {
        return getArea() > r.getArea();
    }
}