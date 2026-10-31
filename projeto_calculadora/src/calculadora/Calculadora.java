package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 * 
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *   <li>Técnicas de revisão estática (caixa branca)</li>
 *   <li>Aplicação de refatoração em código Java</li>
 *   <li>Documentação com Javadoc</li>
 * </ul>
 * 
 * <p>A separação das operações em métodos facilita a legibilidade,
 * manutenção e realização de testes unitários.</p>
 * 
 * @author Marcos Paulo Alcantara Leme
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} por {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da divisão ou 0 caso o divisor seja zero
     */
    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro, divisão por zero, operação irregular");
            return 0;
        }
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     * 
     * <p>Operadores aceitos:</p>
     * <ul>
     *   <li>"+": Soma</li>
     *   <li>"-": Subtração</li>
     *   <li>"*": Multiplicação</li>
     *   <li>"/": Divisão</li>
     * </ul>
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @param op símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     */
    public int calc(int a, int b, String op) {
        int r = 0;

        switch (op) {
        
        //Caso que trata se o operador for soma (+)
            case "+":
                r = somar(a, b);
                break;
                
              //Caso que trata se o operador for subtração (-)
            case "-":
                r = subtrair(a, b);
                break;
                
              //Caso que trata se o operador for multiplicação (*)
            case "*":
                r = multiplicar(a, b);
                break;
              //Caso que trata se o operador for divisão (/)
            case "/":
                r = dividir(a, b);
                break;
            default:
                System.out.println("Operação inválida");
                r = 0;
                break;
        }
        
        //Fórmula de como o resultado será demonstrado ao usuário no console
        System.out.println("Resultado = " + r);
        return r;
    }
}
