
package arreglos;

import java.util.Scanner;
//import java.io.PrintStream;
//import java.util.Arrays;


/**
 *
 * @author jesus.garcia
 */
public class PruebaArreglos {

   
    @SuppressWarnings("SleepWhileInLoop")
    public static void main(String[] args) throws InterruptedException {
        
        //Arreglos arreglos = new Arreglos();
        
        Scanner scanner=new Scanner (System.in);
        
        int opcion;
        do{
            System.out.println(" ");
        System.out.println("***********************");
        System.out.println("*     LABORATORIO     *");
        System.out.println("*         TP 05       *");
        System.out.println("***********************");
        System.out.println("* 1. Sumar Lista      *");
        System.out.println("* 2. Buscar Mayor     *");
        System.out.println("* 3. Cuenta Vocales   *");
        System.out.println("* 4. Cuenta Caracter  *");
        System.out.println("* 5. Salir            *");        
        System.out.println("***********************");        
        
        System.out.println("Digita una opcion: ");
        
        opcion = scanner.nextInt();
              
        switch(opcion){
            case 1:
                   System.out.println("Ingrese la cantidad de números a sumar: ");
                   int tamanio=scanner.nextInt();
                   Arreglos.sumarLista(tamanio);                   
                break;
            case 2:
                System.out.println("Ingrese la cantidad de números a comparar: ");
                   int tam=scanner.nextInt();
                  Arreglos.buscarMayor(tam);
                break;
            case 3: 
               Scanner q = new Scanner(System.in);
               String Palabra;
               
                System.out.println("Introduzca la palabra:");
		Palabra=q.nextLine();
		//System.out.println("La palabra ingresada es: "+Palabra);
                Arreglos.cuentaVocales(Palabra);                    
                break;
                        
            case 4:
                Scanner q2 = new Scanner(System.in);
                String Palabra2;
                System.out.println("Ingresar Palabra: ");
                Palabra2=q2.nextLine();
                System.out.println("Ingrese el Caracter: ");
                char caracter = scanner.next().charAt(0);
                    Arreglos.cuentaCaracter(Palabra2,caracter);
                break;
            case 5:
                System.out.println("SALIENDO...Hasta la proxima!!!");
                break;
            default:
                System.out.println("¡Opcion Invalida!");                   
            }
        
            Thread.sleep(2000);

        }while (opcion != 5);
        
    }
    
}
