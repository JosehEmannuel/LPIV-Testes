package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraIMCTest {

    private Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa(0, 1.0, 'M');
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso() {
        pessoa.setPeso(20.6);
        pessoa.setSexo('M');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Abaixo do peso", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarMasculinoPesoNormal() {
        pessoa.setPeso(26.3);
        pessoa.setSexo('M');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Peso normal", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcima() {
        pessoa.setPeso(27.7);
        pessoa.setSexo('M');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Marginalmente acima do peso", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdeal() {
        pessoa.setPeso(31.0);
        pessoa.setSexo('M');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Acima do peso ideal", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarMasculinoObesidade() {
        pessoa.setPeso(31.1);
        pessoa.setSexo('M');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Obesidade", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarFemininoAbaixoPeso() {
        pessoa.setPeso(19.0);
        pessoa.setSexo('F');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Abaixo do peso", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarFemininoPesoNormal() {
        pessoa.setPeso(25.7);
        pessoa.setSexo('F');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Peso normal", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcima() {
        pessoa.setPeso(27.2);
        pessoa.setSexo('F');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Marginalmente acima do peso", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal() {
        pessoa.setPeso(32.2);
        pessoa.setSexo('F');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Acima do peso ideal", calculadora.classificarIMC());
    }

    @Test
    void deveRetornarFemininoObesidade() {
        pessoa.setPeso(32.3);
        pessoa.setSexo('F');
        CalculadoraIMC calculadora = new CalculadoraIMC(pessoa);
        assertEquals("Obesidade", calculadora.classificarIMC());
    }
}