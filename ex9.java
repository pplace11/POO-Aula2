package aula3;

public class ex9 {
    public static void main(String[] args) {
        System.out.println(ex9(4.7));
        System.out.println(ex9(3.2));
        System.out.println(ex9(5));
    }
    public static int ex9(double numero){
        if (numero ==(int)numero){
            return (int) numero;
        }else{
            return (int)
            Math.round(numero);
        }
    }
}
