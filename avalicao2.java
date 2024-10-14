package aula3;

public class avalicao2 {
    public static void main(String[] args) {
        ex5(5);
    }
    public static void ex5(int n){
        int i = 0;
            while (i<=n){
                System.out.println("Falto acumulda " + i);
                if (i==n){
                    System.out.println("Atingiu o numero de falta");
                }
                i++;
            }
        }
}
