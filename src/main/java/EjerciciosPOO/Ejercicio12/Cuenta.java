package EjerciciosPOO.Ejercicio12;

public class Cuenta {
    private static int siguienteNumeroCuenta=1;
    private int numeroCuenta;
    private String nombre;
    private float saldo;

    public Cuenta( String nombre) {
        this.numeroCuenta = siguienteNumeroCuenta++;
        this.nombre = nombre;
        this.saldo = 0;
    }
    public Cuenta( String nombre,float saldo) {
        this.numeroCuenta = siguienteNumeroCuenta++;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getNombre(){
        return nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta Numero " +
                  numeroCuenta +
                ",\n nombre=" + nombre + '\n' +
                " saldo=" + saldo + " € "
                ;
    }
    public boolean ingresar(float cantidad) {
        if (cantidad > 0) {
            saldo+=cantidad;
            return true;
        } else
            return false;

    }
    public boolean reintegro(float cantidad){
        if (cantidad>saldo) {
            return false;
        }else
            saldo-=cantidad;
        return true;

    }
  public boolean transferir(Cuenta destino,float cantidad){
        if (reintegro(cantidad))
            return destino.ingresar(cantidad);
        return false;

  }
    }



