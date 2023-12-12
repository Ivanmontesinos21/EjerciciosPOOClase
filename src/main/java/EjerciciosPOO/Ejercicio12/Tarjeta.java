package EjerciciosPOO.Ejercicio12;

public class Tarjeta {
    private static int siguienteNumero=1;
    private final  int LIMITE_MAXIMO;
    private Cuenta cuentaAsociada;
    private float saldoCredito;
    private int numeroTargeta;
    public Tarjeta(int limite_maximo, Cuenta cuenta){
        this.LIMITE_MAXIMO=limite_maximo;
        this.cuentaAsociada=cuenta;
        numeroTargeta=siguienteNumero++;
        saldoCredito=LIMITE_MAXIMO;
    }
//    public Tarjeta(Cuenta cuenta){
//        this.LIMITE_MAXIMO=3000;
//        this.cuentaAsociada=cuenta;
//        numeroTargeta=siguienteNumero++;
//        saldoCredito=LIMITE_MAXIMO;
//    }
    public Tarjeta(Cuenta cuenta) {
    this(3000, cuenta);
    }
    public boolean pagoCredito(float cantidad){
        if (cantidad<=0) return false;
        if (cantidad<=saldoCredito){
            saldoCredito-=cantidad;
            return true;

        }else
            return false;
    }
    public boolean pagoDebito(float cantidad){
        return cuentaAsociada.reintegro(cantidad);
    }



    public int getLIMITE_MAXIMO() {
        return LIMITE_MAXIMO;
    }

    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }

    public float getSaldoCredito() {
        return saldoCredito;
    }

    public int getNumeroTargeta() {
        return numeroTargeta;
    }

    public void reiniciarCredito(){
        if (cuentaAsociada.getSaldo()>=LIMITE_MAXIMO-saldoCredito){
            cuentaAsociada.reintegro(LIMITE_MAXIMO-saldoCredito);
            saldoCredito=LIMITE_MAXIMO;
        }else {
            float nuevosaldo = cuentaAsociada.getSaldo() - LIMITE_MAXIMO - saldoCredito;
            cuentaAsociada.setSaldo(nuevosaldo);
        }


    }
    @Override
    public String toString(){
        return "Numero tarjeta: " +numeroTargeta+"\n"+
                "Saldo disponible Credito " +saldoCredito + "\n"+
                cuentaAsociada;
    }

    }



