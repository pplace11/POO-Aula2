package aula3;

public class ex12 {
    public static void main(String[] args) {
        ex12(95);
        ex12(75);
        ex12(55);
        ex12(45);
    }
    public static void ex12(int nota){
        if (nota>=90&&nota<=100){
            System.out.println("Excelente");
        }else if (nota>=70&&nota<90){
            System.out.println("Bom");
        }else if(nota>=50&&nota<70){
            System.out.println("Suficiente");
        }else if (nota<50){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Nota Inaválida");
        }
    }
}
