package modulo1;

public class a004 {
    public static void main(String[] args) {

        System.out.println("=========== Tipo: Float =============");
        // float - Single Precision  = 32bits = 1sinal - 8 expoente e 23 de precisão
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        System.out.println(minF); // 1.4E-45
        System.out.println(maxF); // 3.4028235E38

        System.out.println("=========== Tipo: Double ============");
        // double - Double Precision = 64bits = 1 sinal - 11 expoente e 52 de precisão 
        double minD = Double.MIN_VALUE;
        double maxD = Double.MAX_VALUE;
        System.out.println(minD); // 4.9E-324
        System.out.println(maxD); // 1.7976931348623157E308

        System.out.println("=====================================");

        // float salario = 1998.89f;
        // double sal1 = 1998.89;

        // conversao implicita
        // double valor = 8888.88f;
        // double valor2 = salario;
    }
}
