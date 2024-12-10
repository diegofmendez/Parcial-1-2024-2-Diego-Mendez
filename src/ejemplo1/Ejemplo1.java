package ejemplo1;

import java.util.Scanner;

//Author: Nestor German Bolivar, Diego Francisco Mendez
//Abstract: This code is a simulator of the different operations related to restaurants.
 
public class Ejemplo1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean check = true;
        
        Alimento pizza = new Alimento(5000,100,"Pizza hawaiana","Deliciosa pizza con jamon, queso y piña en almibar");
        Alimento hotdog = new Alimento(4500,50,"Perro caliente","Perro de 32cm con doble salchicha a base de perro real, cebolla, queso americano, papas fosforito y salsas");
        Alimento burger = new Alimento(8000,100,"Hamburguesa","Hamburguesa con pan integral, pollo apanado, lechuga, tomate, pepinillos, queso americano y salsas");
        Alimento caviar = new Alimento(12000,112358,"Caviar","Animal indeterminado");
        
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
                    Ejemplo1.menuAlimento(pizza, hotdog, burger, caviar, s);
                    break;
                case 2:
                    Ejemplo1.hacerPedido(pizza, hotdog, burger, caviar, s);
                    break;
                case 3:
                    Ejemplo1.verPedido(pizza, hotdog, burger, caviar, s);
                    break;
                default:
                    check=false;
            }
            System.out.println("Ingresar un número cualquiera para continuar");
            Integer.parseInt(s.nextLine());
        }
        s.close();
    }
    
    public static void menuAlimento(Alimento alimento1, Alimento alimento2, Alimento alimento3, Alimento alimento4, Scanner s){
        System.out.println("--Menu--");
        System.out.println("------------------");
        Ejemplo1.mostrarAlimento(alimento1);
        Ejemplo1.mostrarAlimento(alimento2);
        Ejemplo1.mostrarAlimento(alimento3);
        Ejemplo1.mostrarAlimento(alimento4);
        
    }
    
    public static void mostrarAlimento(Alimento alimento){
        System.out.println("|"+alimento.getNombre()+"|");
        System.out.println("$"+alimento.getPrecio());
        System.out.println(alimento.getDescripcion());
        System.out.println("------------------");
    }
    
    
    public static void hacerPedido(Alimento alimento1, Alimento alimento2, Alimento alimento3, Alimento alimento4, Scanner s){
        System.out.println("Realización pedido");
        System.out.println("Elija la comida que desea pedir");
        System.out.println("1: Pizza Hawaiana");
        System.out.println("2: Hotdog hawaiano");
        System.out.println("3: Hamburguesa de pollo");
        System.out.println("4: Caviar sencillo");
        switch(Integer.parseInt(s.nextLine())){
                case 1:
                    System.out.println("Recuerde que no añade más unidades sino que determina cuantas va a pedir");
                    System.out.println("¿Cuantas unidades?");
                    alimento1.setCantidad(Integer.parseInt(s.nextLine()));
                    break;
                case 2:
                    System.out.println("Recuerde que no añade más unidades sino que determina cuantas va a pedir");
                    System.out.println("¿Cuantas unidades?");
                    alimento2.setCantidad(Integer.parseInt(s.nextLine()));
                    break;
                case 3:
                    System.out.println("Recuerde que no añade más unidades sino que determina cuantas va a pedir");
                    System.out.println("¿Cuantas unidades?");
                    alimento3.setCantidad(Integer.parseInt(s.nextLine()));
                    break;
                case 4:
                    System.out.println("Recuerde que no añade más unidades sino que determina cuantas va a pedir");
                    System.out.println("¿Cuantas unidades?");
                    alimento4.setCantidad(Integer.parseInt(s.nextLine()));
                    break;
                default:
                    System.out.println("Recuerde que no añade más unidades sino que determina cuantas va a pedir");
                    System.out.println("No existe");
                    break;
            }
        System.out.println("Desea pedir más?");
        System.out.println("1: Si");
        System.out.println("Otro numero: No");
        if(Integer.parseInt(s.nextLine())==1){
            Ejemplo1.hacerPedido(alimento1, alimento2, alimento3, alimento4, s);
        }
    }
    
    public static void verPedido(Alimento alimento1, Alimento alimento2, Alimento alimento3, Alimento alimento4, Scanner s){
        int costo=0;
        System.out.println("Pedido:");
        if(alimento1.getCantidad()>0){
            System.out.println("Usted pidio "+alimento1.getNombre()+" x "+alimento1.getCantidad());
            costo=costo+alimento1.precio;
        }
        if(alimento2.getCantidad()>0){
            System.out.println("Usted pidio "+alimento2.getNombre()+" x "+alimento2.getCantidad());
            costo=costo+alimento2.precio;
        }
        if(alimento3.getCantidad()>0){
            System.out.println("Usted pidio "+alimento3.getNombre()+" x "+alimento3.getCantidad());
            costo=costo+alimento1.precio;
        }
        if(alimento4.getCantidad()>0){
            System.out.println("Usted pidio "+alimento4.getNombre()+" x "+alimento4.getCantidad());
            costo=costo+alimento2.precio;
        }
        System.out.println("El costo total es:"+costo);
    }
}