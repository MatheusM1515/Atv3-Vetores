import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Digite o " + (j + 1) + " número ");
            numeros[j] = sc.nextInt();
        }
        for (int k = 0; k < numeros.length; k++) {
            if (numeros[k] > 0) {
                System.out.println(numeros[k] + "é positivo");
            }
        }
    }
}
