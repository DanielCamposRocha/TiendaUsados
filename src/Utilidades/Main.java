package Utilidades;

/*
* recuerda la clase main la puse en utilidades por que en la clase menu las variables son privadas para poder
* usarla deben estar em el mismo paquete
* */

import Tienda.Inventario;
import Tienda.Vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       run();

    }

    private static void run() {
        char opcion;
        Menu m= new Menu("MENU PRINCIPAL",new String[] {"1.-Nuevo Vehículo","2.-Listar Vehículos","3.-Buscar Vehículo", "4.-Modificar kms Vehículo","5.-Sair"},"12345", Menu.Direccion.VERTICAL);

        do{
            opcion= m.getOption();
            switch (opcion){
                case '1':
                    Vehiculos.nuevoVehiculo();
                    System.out.println(Inventario.nvhculo);
                    break;
                case '2':
                    Inventario.imprimir();
                    break;
                case '3':
                    Scanner scn=new Scanner(System.in);
                    System.out.println("Matricula: ");
                    String matricula=scn.nextLine();
                    Inventario.buscaVehiculo(matricula);
                    break;
                case '4':
                    Inventario.modKms();
                    break;
            }
        }while(opcion!='5');

    }


}