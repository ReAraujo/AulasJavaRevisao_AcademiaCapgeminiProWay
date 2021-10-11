package modulo1;

import java.util.Scanner;

public class a022 {
    public static void main(String[] args) {
        menu();
        int opcao = ler("Digite uma opção do menu: ");
        
    }

    static void menu(){
        System.out.println("============== Calculadora ==============");
        System.out.println("\t1 - Somar");
        System.out.println("\t2 - Devidir");
    }
    static void selecionar_menu(int opcao){
        switch(opcao){
            case 1:
                int n1 = ler("Digite o n1: ");
                int n2 = ler("Digite o n2: ");
                int s1 = somar(n1, n2);
                System.out.printf("A soma é: %d\n", s1);
            break;
            case 2:
                int n3 = ler("Digite o n3: ");
                int n4 = ler("Digite o n4: ");
                int d1 = dividir(n3, n4);
                System.out.printf("A divisão é: %d\n", d1);
            break;
        }    
    }


    static int ler(String mensagem){
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static int somar(int n1, int n2){
        int s = n1 + n2;
        return s;
    }

    static int dividir(int n1, int n2){
        int d =  n1 / n2;
        return d;
    }
    
}
