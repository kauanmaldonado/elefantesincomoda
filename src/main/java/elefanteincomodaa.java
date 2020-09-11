import java.util.Scanner;

public class elefanteincomodaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira um numero inteiro");
        int numero = input.nextInt();

        if (numero == 1) {
            System.out.println("elefante incomoda");
        }
        if (numero == 2) {
            System.out.println("elefante incomoda incomoda");
        }
        if (numero == 3) {
            System.out.println("elefante incomoda incomoda incomoda muito mais");
        }
        if (numero > 3) {
            System.out.println("escreva um valor menor que 3");
        }


    }
}
