import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma distância em metros:");
        double nmetro = 5;//teclado.nextDouble();

        double ncentimetro = nmetro * 100;

        System.out.printf("A distância é: %.2f cm", ncentimetro);
        teclado.close();
    }
}
