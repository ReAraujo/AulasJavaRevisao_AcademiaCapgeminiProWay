package modulo1;

import java.util.Scanner;

public class a011A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        byte idade1 = Byte.parseByte(sc.nextLine());
        while(idade1 < 0){
            System.out.println("A idade não pode ser negativa.\nDigite novamente: ");
            idade1 = Byte.parseByte(sc.nextLine());
        }

        byte idade2 = 0;
        do{
            System.out.print("Digite a sua idade: ");
            idade2 = Byte.parseByte(sc.nextLine());
            if(idade2 < 0){
                System.out.println("A idade não pode ser negativa");
            }
        }while(idade2 < 0);





        System.out.println("========== Obrigada! ==========");



    }

}
