public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public int raizCuadrada(int a) {
        if (a < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo");
            return -1; // Indicador de error
        }
        return (int) Math.sqrt(a);
    }

    public int usted(int a){
        return a/10;
    }

    public int yo (int a){
        return a/2
    }
}