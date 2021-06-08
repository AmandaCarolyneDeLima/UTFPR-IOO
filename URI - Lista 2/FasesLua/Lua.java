public class Lua{

    private int num1;
    private int num2;

    public int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public String faseLua(){
        if (num1 >= 0 && num2 <= 2) {
            return "nova";
        } else if (num2 > num1 && num2 <= 96) {
            return "crescente";
        } else if (num1 >= num2 && num2 <= 96) {
            return "minguante";
        } else { 
            return "cheia";
        }
    }
}