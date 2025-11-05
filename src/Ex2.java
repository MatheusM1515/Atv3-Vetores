import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("A soma é ");
        System.out.println(soma);

        sc.close();
    }

}

