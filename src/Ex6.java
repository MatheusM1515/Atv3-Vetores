import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (int k=7;k>0;k=k-1){
            System.out.print(numeros[k] + " ");
        }
    }
}