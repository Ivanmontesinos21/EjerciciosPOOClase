package EjerciciosPOO.Ejercicio3;

public class Contador {
    private  int cantidad=0;
    public void incrementar(){
        cantidad++;
    }
    public void decrementar(){
        cantidad--;
    }
    @Override
    public String  toString(){
        return "El total es : " + cantidad;
    }
}
