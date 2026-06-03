public class Calculadora {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== Calculadora UFAM ===");
        System.out.println("Soma (10 + 5):        " + calc.somar(10, 5));
        System.out.println("Subtração (10 - 5):   " + calc.subtrair(10, 5));
        System.out.println("Multiplicação (10*5): " + calc.multiplicar(10, 5));
        System.out.println("Divisão (10 / 5):     " + calc.dividir(10, 5));
    }
}