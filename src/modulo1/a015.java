package modulo1;

import java.util.Scanner;
// ler um valor N
// calcular e escrever seu respectivo fatorial
// fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// lembrando que, por definição, fatorial de 0 é 1

import java.util.Scanner;

public class a015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(sc.nextLine());

        //fatorial de 3 = 3*2*1
        //fatorial de 5 = 5*4*3*2*1

        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            System.out.printf("%d ", i);
            fatorial = fatorial * i;
        } 
        System.out.printf("= %d", fatorial);
        sc.close();
    }
    
}
