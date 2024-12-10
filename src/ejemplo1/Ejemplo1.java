package ejemplo1;

import java.util.Scanner;

//Author: Nestor German Bolivar, Diego Francisco Mendez
//Abstract: This code is a simulator of the different operations related to 
//restaurants.
 
public class Ejemplo1 {
    
    public static void main(String[] args) {
        Alimento pizza = new Alimento(1,0,100,"Pizza hawaiana","Deliciosa pizza con jamon y piña en almibar");
        Alimento hotdog = new Alimento(2,0,50,"Perro caliente","Delicioso alimento a base de caninos reales");
        Alimento arepcho = new Alimento(3,0,100,"Arepa con chorizo","Arepa con un chorizo");
        Alimento caviar = new Alimento(4,0,112358,"Caviar","Animal indeterminado");
        
        Ejemplo1.menuUsuario();
        
    }
    
    public static void menuUsuario(){
        Scanner s = new Scanner(System.in);
        boolean check = true;
        System.out.println("¡Bienvenido a Pizzas El Dorado");
        while (check == true) {
            System.out.println("Ingrese un número para elegir una opción");
            System.out.println("(Si ingresa un valor distinto a un número entero el sistema entrará en error)");
            System.out.println("1: Mostrar menu");
            System.out.println("2: Hacer un pedido");
            System.out.println("3: Ver pedido");
            System.out.println("Cualquier otro número: Salir");
            int index = Integer.parseInt(s.nextLine());
            switch(index){
                case 1:
                    System.out.println("1");
                    break;

                default:
                    Ejemplo1.seleccionar();
                    check=false;
            }
        }
    }
    
    
    
    
    public static void seleccionar(){
        System.out.println("Hola");
        
    }
}
//return Integer.parseInt(s.nextLine());