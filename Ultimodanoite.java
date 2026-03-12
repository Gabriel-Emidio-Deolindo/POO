import java.util.Scanner;
public class Ultimodanoite {
    public static void main(String[] args) {

        String nome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um nome: ");
        nome = scanner.nextLine();

        System.out.println("Insira sua idade: ");
        idade = scanner.nextInt();

        System.out.println("O nome inserido foi: " + nome);
        System.out.println("A idade inserida foi: " + idade);

    }
}