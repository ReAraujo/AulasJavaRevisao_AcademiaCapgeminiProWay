package modulo1;

public class a006 {
    public static void main(String[] args) {
        
        boolean executa = false;
        if(executa){
            System.out.println("Entrou no if");
        }

        // (!verdade) o ! na frente representa inverter o valor booleano 
        boolean verdade = true;
        if(!verdade){
            System.out.println("Entrou no segundo if");
        }

        // o if somente executa o que for verdadeiro/true
        if(verdade || executa){
            System.out.println("Entrou no terceiro if");
        }

        // o && representa que ambas as variáveis precisam ser verdadeiras para poder entrar no if 
        if(verdade && executa){
            System.out.println("Entrou no terceiro if");
        }
        
        boolean dado_valido = true;
        if(!dado_valido){
            System.out.println("O dadi informado é inválido");
        }

        boolean resultado = verdade && !executa;
        if(resultado){
            
        }
    }    
}
