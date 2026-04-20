public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }

    public int calcular(int a, int b, char operador) throws OperadorInvalidoException {
        switch (operador) {
            case '+':
                return soma(a, b);
            case '-':
                return subtracao(a, b);
            case '*':
                return multiplicacao(a, b);
            case '/':
                return divisao(a, b);
            default:
                throw new OperadorInvalidoException("Operador inválido: " + operador);
        }
    }
}
