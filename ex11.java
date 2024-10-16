package aula3;

public class ex11 {
    public static void main(String[] args) {
        System.out.println(ex11(5));
        System.out.println(ex11(-3));
    }
    public static double ex11(double raio){
        if (raio<0){
            System.err.println("Erro: O raio deve ser um número positivo");
            return -1;
        }else{
            return Math.PI*Math.pow(raio, 2);
        }
    }
}
