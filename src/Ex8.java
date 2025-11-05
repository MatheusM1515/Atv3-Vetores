import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        int num[] = new int[5];

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Digite o " + (j + 1) + " número ");
            numeros[j] = sc.nextInt();
            num[j] = (numeros[j] * 2);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(num[k] + " ");
        }
    }
}