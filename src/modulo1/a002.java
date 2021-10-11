package modulo1;

public class a002 {

    public static void main(String[] args) {
        // variável
        // Tipagem estática = a variável possui um tipo e apenas um tipo (não muda de tipo durante a execução)

        String nome1 = "Renata";
        String msg = "11a5d6f12e2e6c";
        String letra1 = "a";
        char letra2 = 'a';    
        char l1 = 'b';
        char l2 = 'a';
        char l3 = 't';
        char l4 = 'a';
        char l5 = 't';
        char l6 = 'a';
        char lq  = 74; 
        // o char lq = 74 imprimirá o correspondente a 74 na tabela ASCII
        // o tipo char é de tipo número que armazena 1 byte
        // Conversão de explicita de dados
        String m1 = Character.toString(l1)+Character.toString(l2)+Character.toString(l3)+Character.toString(l4)+
        Character.toString(l5)+Character.toString(l6);
        
    }   
}
