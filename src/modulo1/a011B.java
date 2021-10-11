package modulo1;

import java.util.Scanner;

public class a011B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        byte idade = 0;
        boolean valido = true;
    
        do{
            System.out.print("Digite a sua idade: ");
            idade = Byte.parseByte(sc.nextLine());
            if(idade < 0){
                System.out.println("A idade não pode ser negativa");
                valido = false;
            }
        }while(valido);





        System.out.println("========== Obrigada! ==========");



    }
    
}
