package aula3;

public class ex8 {
    public static void main(String[] args) {
      int x=10;
      if (x>0){
        int resultado = ex8(x);
      System.out.println(resultado);
        } else{
        System.out.println("erro");
        }
    }
    public static int ex8(int n){
        int i = 0;
        int soma = 0;
        while (i<n){
            soma = soma + i;
            i++;
        }
        return soma;
    }
}
