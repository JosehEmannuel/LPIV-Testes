import calculadora.CalculadoraIMC;
import calculadora.Pessoa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("=== Calculadora de IMC ===");

        double peso = 50 + (100 * random.nextDouble());
        double altura = 1.5 + (0.5 * random.nextDouble());
        char sexo = random.nextBoolean() ? 'M' : 'F';

        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.println("Sexo: " + sexo);

        Pessoa pessoa = new Pessoa(peso, altura, sexo);
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);

        String resultado = calculadora.resultadoFinal();
        System.out.println("\nResultado:");
        System.out.println(resultado);

    }
}
