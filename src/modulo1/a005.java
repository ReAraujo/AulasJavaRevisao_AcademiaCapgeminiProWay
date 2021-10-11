package modulo1;

import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {

        // cria-se uma classe Scanner com uma variável sc para leitura  
        Scanner sc = new Scanner(System.in);
        
        // sempre que der um nextLine, o tipo de retorno que vem é tipo String
        String linha1 = sc.nextLine(); // nextLine = lê a linha inteira 
        System.out.println("Foi lido 1: " + linha1);

        String linha2 = sc.next();// next lê até o próximo espaço e não a linha inteira
        System.out.println("Foi lido 2: " + linha2);

        String linha3 = sc.next();
        System.out.println("Foi lido 3: " + linha3);

        int n1 = Integer.parseInt(sc.nextLine()); // solução para ler uma linha e pegar a parte numérica 
        System.out.println("Foi lido 4: " + n1);

        int n2 = sc.nextInt(); // lê um número inteiro até o espaço ou entender
        System.out.println("Foi lido 5: " + n2);

        double sal1 = sc.nextDouble();

        double sal2 = Double.parseDouble(sc.nextLine());

        float sal3 = Float.parseFloat(sc.nextLine());

    } 
}
