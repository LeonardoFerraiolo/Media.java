import java.util.Scanner;
public class Media {
    public static void main(String[] args) {

        int nota1, nota2, nota3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        nota1 = scan.nextInt();
        System.out.println("Digite a nota 2");
        nota2 = scan.nextInt();
        System.out.println("Digite a nota 3");
        nota3 = scan.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media e: " + media);
    }
}