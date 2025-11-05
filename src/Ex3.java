import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite a " + (i + 1) + " nota ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

         media = soma / numeros.length;

        System.out.println("O valor da média é");
        System.out.println(media);

        sc.close();
    }

}

