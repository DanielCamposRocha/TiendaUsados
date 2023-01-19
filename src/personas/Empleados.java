package personas;


public enum Empleados {
    JefeTaller(2000,"8 a 16 de Lunes  Viernes","Dirigir, organizar y asignar trabajos en taller"),
    Mecanico(1500,"8 a 16 o 16 a 22 Lunes a Viernes","Ejecutar las reparaciones"),
    Vendedor(1300,"8 a 16 o 16 a 22 Lunes a Viernes","Recibir y atender a los clientes derivar al jefe de compras para los vendedores"),
    Administrativo(1100,"8 a 16 Lunes a Viernes", "tramites administrativos de cualquier tipo"),
    JefeCompras(2500, "8 a 16 o 16 a 22 Lunes a Viernes","Valorar y negociar compras de vehiculos");

    private double sueldo;
    private String horario;
    private String deberes;



     Empleados(double sueldo, String horario, String deberes) {
        this.sueldo = sueldo;
        this.horario = horario;
        this.deberes = deberes;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDeberes() {
        return deberes;
    }

    public void setDeberes(String deberes) {
        this.deberes = deberes;
    }


}
