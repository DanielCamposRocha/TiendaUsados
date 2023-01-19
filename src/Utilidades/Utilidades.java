package Utilidades;

public class Utilidades {

    /*metodo que comprueba que un nombre cumpla que esta compuesto de nombre y dos apellidos
    * realmente solo comprueba un String buscando que solo este compuesto por letras y que contanga dos espacios*/
    public static boolean validaNombre(String nombre){
        if (nombre.length()>40) return false;


        int espacios=0;
        for (int i=0;i<nombre.length();i++){
            //se comprueba que solo haya caracteres entre a y z mayuscula o minuscula y espacios en blanco
            char c=nombre.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')){
                return false;
            }
            //busca si hay al menos dos espacios en blanco en el string para decidir si hay nombre y dos apellidos
            if (nombre.charAt(i)== ' ') espacios++;
        }
        if (espacios<2) return false;
        else return true;
    }
}
