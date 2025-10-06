package calculadora;

public class CalculadoraIMC {
    private Pessoa pessoa;

    public CalculadoraIMC(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcularIMC() {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        char sexo = pessoa.getSexo();

        if (sexo == 'F') {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "Peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obesidade";
            }
        } else {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "Peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obesidade";
            }
        }
    }

    public String resultadoFinal() {
        return String.format("Seu IMC é: %.2f%nClassificação: %s", calcularIMC(), classificarIMC());
    }
}
