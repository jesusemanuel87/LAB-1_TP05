
package arreglos;

import java.util.Scanner;

/**
 *
 * @author jesus.garcia
 */
public class Arreglos {
    
/** Arreglo Unidimensional
 * 
 * Método sumarLista que reciba por parámetro un arreglo unidimensional
 * de enteros y muestre por pantalla la suma y promedio de los mismos
 */ 
    public static void sumarLista(int tamanio){       
       
        int suma = 0;
        
        int lista[]=new int [tamanio];
        Scanner scanner=new Scanner (System.in);
        
        System.out.println("Ingrese los numeros enteros: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i]=scanner.nextInt();
            suma+=lista[i];
        }
        System.out.println("Suma Total: "+suma);
        System.out.println("Promedio: "+suma/lista.length);
        
        
    }

/**Arreglo bidimensional e irregular
 * 
 * Método buscarMayor que reciba por parámetro un arreglo bidimensional 
 * e irregularde enteros y retorne el entero más grande que se encuentra en el arreglo
 */    
    public static void buscarMayor(int tam){
        
        int mayor = 0;
        
        int lista[]=new int [tam];
        Scanner scanner=new Scanner (System.in);
        
        System.out.println("Ingrese los numeros enteros: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i]=scanner.nextInt();
                if (mayor<lista[i]) {
                    mayor=lista[i];
            }
        }
        System.out.println("El numero mayor es: "+mayor);   
    }
    
    
/**Cuenta Vocales
 * 
 * Método cuentaVocales, que reciba por parámetro un String y 
 * retorne la cantidad de vocales que tiene la cadena
 */    
    public static void cuentaVocales(String Palabra){
        
        int contador = 0;
        for(int x=0;x<Palabra.length();x++) {
                if ((Palabra.charAt(x)=='a') || (Palabra.charAt(x)=='e') || (Palabra.charAt(x)=='i') || (Palabra.charAt(x)=='o') || (Palabra.charAt(x)=='u')){ 
                contador++;
              }
        }
        System.out.println("La palabra " +Palabra + ", contiene " + contador + " vocales");
    }
    
    
/**Cuenta Caracter
 * 
 * Método cuentaCaracter que reciba por parámetro un String y un caracter,
 * luego retorne la cantidad de veces que se repite en la cadena el carácter recibido
 */    
    public static void cuentaCaracter(String Palabra2, char caracter){
            int contador = 0;
        for(int x=0;x<Palabra2.length();x++) {
                if ((Palabra2.charAt(x)== caracter)){ 
                contador++;
              }
        }
        System.out.println("La palabra *" +Palabra2 + "* contiene " + contador + " caracteres con *"+caracter+"*");
    }
    }
   