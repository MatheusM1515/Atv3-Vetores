import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int[] num3 = new int[10];

        for (int j = 0; j < num1.length; j++){
        System.out.println("Digite o " +  (j + 1)  + " número ");
        num1[j]= sc.nextInt();
    }
        for (int k = 0; k < num2.length; k++){
            System.out.println("Digite o " +  (k + 1)  + " número ");
            num2[k]= sc.nextInt();
        }

        for(int x = 0;x<num1.length;x++){
            num3[x]=num1[x];
        }
        for(int m = 0;m<num2.length;m++){
            num3[(m+5)]=num2[m];
        }

        for(int o=0;o<=num3.length;o++) {
            System.out.print(num3[o] + " ");
        }
    }
}