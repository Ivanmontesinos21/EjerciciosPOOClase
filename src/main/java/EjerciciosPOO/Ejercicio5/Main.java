package EjerciciosPOO.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Fraccion fraccion=new Fraccion(3,4);
        Fraccion fraccion2=new Fraccion(4, 5);
     Fraccion resultado=fraccion.multiplicar(fraccion2);
     Fraccion suma=fraccion.sumar(fraccion2);
        Fraccion resta=fraccion.resta(fraccion2);
        System.out.println(fraccion + " * " + fraccion2 +" = " + resultado );
        System.out.println(fraccion + " + " + fraccion2 +" = " + suma );
        System.out.println(fraccion + " - " + fraccion2 +" = " + resta );
    }
}
