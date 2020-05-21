import java.util.Scanner;

public class Leitor {
    private Scanner scanner;

    public Leitor() {
        scanner = new Scanner(System.in);
    }

    public String leString() {
        return scanner.nextLine();
    }

    public int leInteiro() {
        int retorno = scanner.nextInt();
        scanner.nextLine();
        return retorno;
    }
}
