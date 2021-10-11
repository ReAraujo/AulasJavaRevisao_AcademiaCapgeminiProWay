package modulo1;

public class a003 {
    public static void main(String[] args) {

        // usa-se %d para todos abaixo:
        
        // Byte = 8bits 0-255 - 11111111   
        System.out.println("=========== Tipo: Byte ============");
        byte idade = 127; /// -128 até +127 = total 255
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        System.out.println(min); // -128
        System.out.println(max); // 127

        System.out.println("=========== Tipo: Short ============");

        // Short = 2Bytes = 16bits = -32768 até + 32767 = 0-65535 
        short minS = Short.MIN_VALUE; // -32768
        short maxS = Short.MAX_VALUE; // 32767
        System.out.println(minS); 
        System.out.println(maxS); 

        System.out.println("============ Tipo: Int =============");

        // int = 4Bytes = 32bits = 0-4294967296
        int minI = Integer.MIN_VALUE; // -2147483648
        int maxI = Integer.MAX_VALUE; // 2147483647
        System.out.println(minI); 
        System.out.println(maxI); 

        System.out.println("=========== Tipo: Long ============");

        // long = 8Bytes = 64bits = 0-65535
        long minL = Long.MIN_VALUE; // -9223372036854775808
        long maxL = Long.MAX_VALUE; // 9223372036854775807
        System.out.println(minL); 
        System.out.println(maxL); 

        System.out.println("===================================");

        // long n1 = minI; == conversao implicita
        // explicitas - cast
        // byte n2 = (byte)minL; // nao converte corretamente = 0
        // long n3 = (long)"Renata"; /// não funciona
        // System.out.println(n2);




            



    }
}
