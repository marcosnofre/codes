import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius:");
    double temperatura = entrada.nextDouble();

    double F = (temperatura * 1.8 ) + 32;

    System.out.print("valor em Fahrenheit e: ");
    System.out.print(F);

  }
}