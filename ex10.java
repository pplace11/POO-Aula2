package aula3;

public class ex10 {
    public static void main(String[] args) {
        System.out.println(ex10(16));
        System.out.println(ex10(25));
        System.out.println(ex10(-9));
    }
    public static double ex10(double numero){
        if (numero<0){
            return -1;
        }else{
            return 
            Math.sqrt(numero);
        }
    }
}
