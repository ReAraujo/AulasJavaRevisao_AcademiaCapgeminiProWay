package modulo1;

public class a008 {
    public static void main(String[] args) {
        
        byte idade = 19;

        if(idade >= 18){
            System.out.println("De maior");
        }
        else{
            System.out.println("De menor");
        }

        if (idade > 18){
            System.out.println("Passou da idade");
        }
        else if (idade == 18){
            System.out.println("Alistamento");
        }
        else{
            System.out.println("Abaixo da idade");
        }

    }


    
    
}
