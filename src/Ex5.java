import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho=10;
        double[] numeros = new double[tamanho];

        for (int j = 0; j<numeros.length; j++) {
            System.out.println("Digite o " + (j + 1) + ": numero ");
            numeros[j] = sc.nextDouble();
        }


        int pares=0;
        int impares=0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                pares+=1;
            }
            if(numeros[i]%2!=0){
                impares+=1;
            }
        }
        System.out.println("Tem " + pares + " numeros pares");
        System.out.println("Tem " + impares + " numeros impares");

    }
}
