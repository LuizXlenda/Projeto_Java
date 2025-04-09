package Exercicio_01;

public class Main01 {

    public static void main(String[] args) {
        System.out.println(">Calculadora<");

        double num1 = inputHelper.inputDouble("Digite o primeiro numero: ");
        String sinais = inputHelper.inputString("Digite a operação(+ = adição, - = subtração, * = multiplicação, / = divisão, % = resto da divisão): ");
        double num2 = inputHelper.inputDouble("Digite o segundo numero: ");

        switch(sinais){
            case "+":
                double adc = Calculadora.adicao(num1, num2);
                System.out.printf("Resultado: %.2f", adc);
                break;
            case "-":
                double sub = Calculadora.sub(num1, num2);
                System.out.printf("Resultado: %.2f", sub);
                break;
            case "*":
                double mult = Calculadora.mult(num1, num2);
                System.out.printf("Resultado: %.2f", mult);
                break;
            case "/":
                double div = Calculadora.div(num1, num2);
                System.out.printf("Resultado: %.2f", div);
                break;
            case "%":
                double res = Calculadora.res(num1, num2);
                System.out.printf("Resultado: %.2f", res);
                break;
            default:
                System.out.print("Erro - Sinal inválido.");

        }

    }

}
