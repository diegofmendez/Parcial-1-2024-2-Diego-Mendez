package ejemplo1;

import java.util.Scanner;

//Author: Nestor German Bolivar, Diego Francisco Mendez
//Abstract: This code is a very simplified version of a bank software
 
public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        Cliente cliente = Ejemplo1.registro();
        Cuenta cuenta = new Cuenta(cliente);
        Ejemplo1.menu(cuenta, cliente);
        
    }   
    public static Cliente registro(){
        Scanner s = new Scanner(System.in);
        System.out.println("Creación de cuenta nueva:");
        System.out.println("Ingresa tu nombre completo");
        String nombre = s.nextLine();
        System.out.println("Ingresa tu numero de cedula");
        int cedula = Integer.parseInt(s.nextLine());
        return new Cliente(nombre, cedula);
        }
    
    public static void menu(Cuenta cuenta, Cliente cliente){
        Scanner s = new Scanner(System.in);
        boolean check = true;
        System.out.println("Bienvenido");
        while (check == true) {                
            System.out.println("Elije una opción");
            System.out.println("1: Mostrar saldo");
            System.out.println("2: Hacer una consignación");
            System.out.println("3: Retirar saldo");
            System.out.println("Cualquier otro número: Salir");
            int index = Integer.parseInt(s.nextLine());
            if (index==1){
                System.out.println(cliente.getNombre());
                System.out.println("Saldo actual: "+cuenta.getSaldo());
            } else if(index==2){
                System.out.println("Ingrese monto a consignar(Decimales con punto)");
                cuenta.consignacion(Double.parseDouble(s.nextLine()));
                
            } else if(index==3){
                System.out.println("Ingrese monto a retirar(Decimales con punto)");
                cuenta.retiro(Double.parseDouble(s.nextLine()));
            } else{
                check=false;
            }
        }
    }
}
