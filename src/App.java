import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double nmetro;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma distância em metros:");
        nmetro = teclado.nextDouble();
        double ncentimetro = nmetro * 100;
        System.out.print("A distância é: " +ncentimetro);
        System.out.print(" cm");
    }
}
