import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o aluno " + (i + 1) + " :");
            alunos[i] = sc.nextLine();
        }

        System.out.println("Qual o aluno que você quer buscar?");
        String busca = sc.nextLine();

        for (String x:alunos){
            if(x.contains(busca)){
                System.out.println("Tem um aluno com este nome no sistema!");
            }
        }

    }
}
