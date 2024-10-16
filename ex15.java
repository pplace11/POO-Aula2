package aula3;

public class ex15 {
    public static void main(String[] args) {
        System.out.println(ex15(5));
        System.out.println(ex15(7));
    }
    public static int ex15(int numero){
        int fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial *=i;
        }
        return fatorial;
    }
}
