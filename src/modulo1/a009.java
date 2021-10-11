package modulo1;

public class a009 {
    public static void main(String[] args) {
        
        //byte idade = 18;

        //while(idade >= 18){
        //    System.out.println("De maior");
        //}

        int repeticoes = 1;
        while(repeticoes < 5){
            System.out.printf("\n Repetição %d", repeticoes);
            repeticoes =  repeticoes + 1;
        }

        repeticoes = 1;
        while(repeticoes <= 5){
            System.out.printf("\n Repetição %d", repeticoes);
            repeticoes += + 1; // é igual utilizar repeticoes =  repeticoes + 1;
        }
        repeticoes = 1;
        while(repeticoes <= 5){
            System.out.printf("\n Repetição %d", repeticoes);
            repeticoes++; // é igual utilizar repeticoes =  repeticoes + 1; e repeticoes += + 1;
                          // somente altera que o repeticoes++ repetirá somente 1 vez, sem poder alterar para mais   
        }
    }
    
}
