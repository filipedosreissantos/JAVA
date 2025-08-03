import java.util.Scanner;

public class NumeroPrimo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = 0;
        int counter = 0;

        System.out.println("TESTE SE EH NUMERO PRIMO!");
        System.out.println("");

        System.out.print("Entre com o numero: ");
        scan = scanner.nextInt();

        System.out.print(scan + " eh divisivel por: ");
        for(int i = 1; i <= scan; i++) {
            if(scan % i == 0) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        if(counter == 2) {
            System.out.println(scan + " eh primo");
        } else {
            System.out.println(scan + " nao eh primo");
        }

        scanner.close();
    }

}