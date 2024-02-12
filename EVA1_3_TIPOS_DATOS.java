/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_tipos_datos;

/**
 *
 * @author Mimas
 */
public class EVA1_3_TIPOS_DATOS {

    public static void main(String[] args) {
    byte pruebaByte; //1 Byte = 8bits ---- 256
     // pruebaByte = 256: // 256 no cabe en la variable
    pruebaByte = -127; //acepta de -128 a 127
    pruebaByte = 127;
    pruebaByte = -128;
    short pruebaShort; //2 bites = 16 bits = --- 65536
     //pruebaShort = -32769; NO CABE
     pruebaShort = -32768;
     pruebaShort = 32767;  
     System.out.println(pruebaShort);
     pruebaShort++;
     System.out.println(pruebaShort);
     
        // TODO code application logic here
    }
    
}
