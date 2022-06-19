package interpreter;

public class Estabelecimento {

    public static String formula = "produto - desconto";

    public static double calcularValorDesconto(double produto, double desconto) {
        String expressao;
        expressao = formula.replace("produto", Double.toString(produto));
        expressao = expressao.replace("desconto", Double.toString(desconto));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
