package polimorfismo;

public class Ejercicio4 {

   
    static class Cuenta {
        double saldo;

        public Cuenta(double saldo) {
            this.saldo = saldo;
        }

        public void depositar(double monto) {
            saldo = saldo + monto;
            System.out.println("Deposito normal realizado.");
            System.out.println("Saldo actual: Q" + saldo);
        }
    }

    static class CuentaAhorro extends Cuenta {

        public CuentaAhorro(double saldo) {
            super(saldo);
        }

        @Override
        public void depositar(double monto) {
            double interes = monto * 0.05;
            saldo = saldo + monto + interes;

            System.out.println("Deposito en cuenta de ahorro realizado.");
            System.out.println("Monto depositado: Q" + monto);
            System.out.println("Interes agregado: Q" + interes);
            System.out.println("Saldo actual: Q" + saldo);
        }
    }

    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorro(1000);

        cuenta.depositar(200);
    }
}