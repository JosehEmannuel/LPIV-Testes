package calculadora;

public class Pessoa {

    private double peso;
    private double altura;
    private char sexo;

    public Pessoa(double peso, double altura, char sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = Character.toUpperCase(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = Character.toUpperCase(sexo);
    }
}
