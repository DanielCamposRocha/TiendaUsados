package Tienda;

/*Clase para gestionar lo relacionado con los vechiculos*/

import java.util.Scanner;
import java.util.regex.Pattern;
import Utilidades.Utilidades;

public class Vehiculos {
    private final String matricula;
    private double precio;
    private String marca;
    private int kilometros;
    private String descripcion;
    //nome_propietario e DNI_propietario son los datos del antigo propietario del vehiculo, se podria incluir en objeto
    // de clase persona y llamarlo a el, posible mejora ¿TODO?
    private final String nombre_propietario;

    private final String DNI_propietario;

    /*Intento usar nuevo vehiculo, como un set para proteger la creacion de objetos*/
    private Vehiculos(String matricula, double precio, String marca, int kilometros, String descripcion, String nombre_propietario, String dni_propietario) {
        this.matricula = matricula;
        this.precio = precio;
        this.marca = marca;
        this.kilometros = kilometros;
        this.descripcion = descripcion;
        this.nombre_propietario = nombre_propietario;
        DNI_propietario = dni_propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public String getDNI_propietario() {
        return DNI_propietario;
    }

    public static void nuevoVehiculo() {

        String mat;
        Double pre;
        String mar;
        int recorrido;
        String descrip;
        String nome_propietario;
        String DNI;

        Vehiculos v;
        Scanner scn=new Scanner(System.in);

        System.out.println("Alta de Vehiculo");
        do{// hago un bucle para validar la matricula, de esta forma garantizo que se vuelve al menu de solicitar la matricula
            System.out.print("Matricula: ");
            mat=scn.nextLine();
        }while(Pattern.matches("\\d{4}[A-Z]{3}",mat)==false);
        do{
            System.out.print("Precio: ");
            pre=scn.nextDouble();
            scn.nextLine();
        }while(pre<0);
            System.out.print("Marca: ");
            mar=scn.nextLine();
        do{
            System.out.print("Kilometraje: ");
            recorrido=scn.nextInt();
            scn.nextLine();
        }while(recorrido<0);
            System.out.print("Descripcion: ");
            descrip=scn.nextLine();
        do{
            System.out.print("Nome e apelidos do anterior propietario ");
            nome_propietario=scn.nextLine();
        }while(Utilidades.validaNombre(nome_propietario)==false);
        do {
            System.out.print("DNI do anterior propietario ");
            DNI=scn.nextLine();
        }while(Pattern.matches("\\d{8}[A-HJ-NP-TV-Z]",DNI)==false);
        /*TODO incluir metodo validarDNI en utilidades*/

        v=new Vehiculos(mat,pre,mar,recorrido,descrip,nome_propietario,DNI);
        Inventario.addStock(v);
    }

}
