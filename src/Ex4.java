import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho=10;
        double[] numeros = new double[tamanho];

        for (int j = 0; j<numeros.length; j++) {
            System.out.println("Digite o " + (j + 1) + ": numero ");
            numeros[j] = sc.nextDouble();
        }


            double maior = numeros[0];
            double menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O número maior é " + maior);
        System.out.println("O número menor é " + menor);

        }
    }
