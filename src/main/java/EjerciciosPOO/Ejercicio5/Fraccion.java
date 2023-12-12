package EjerciciosPOO.Ejercicio5;

public class Fraccion {
    private int numerador;
    private  int denominador;
    public Fraccion(int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public Fraccion multiplicar(Fraccion fraccion){
        return simplificar(new Fraccion(numerador* fraccion.numerador,denominador* fraccion.denominador));
    }
    public Fraccion Dividir(Fraccion fraccion){
        return simplificar(new Fraccion(numerador* fraccion.denominador,denominador* fraccion.numerador));
    }
    public static int maximoComunDivisor(int a,int b){
        int temporal;//para no perder b
        while (b!=0){
            temporal=b;
            b=a%b;
            a=temporal;
        }
        return  a;
    }
    public void simplificar(){
        int mcd=maximoComunDivisor(numerador,denominador);
        numerador/=mcd;
        denominador/=mcd;
    }
    public Fraccion sumar(Fraccion fraccion){
   return simplificar(new Fraccion(numerador* fraccion.denominador+denominador* fraccion.numerador,denominador* fraccion.denominador));
    }
    public Fraccion resta(Fraccion fraccion){
        return simplificar(new Fraccion(numerador* fraccion.denominador-denominador* fraccion.numerador,denominador* fraccion.denominador));

    }
    public static Fraccion simplificar(Fraccion fraccion){
        int mcd=maximoComunDivisor(fraccion.numerador,fraccion.denominador);
        return new Fraccion(fraccion.numerador/mcd, fraccion.denominador/mcd);
    }
    @Override
    public String toString(){
        return numerador+"/" +denominador;

    }

}
