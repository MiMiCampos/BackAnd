import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota1 = sc.nextDouble();
    double nota2 = sc.nextDouble();
    double media = (nota1 + nota2) / 2;
    
        if (media >= 7.0) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }

        sc.close();
    }
}