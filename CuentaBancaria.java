/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Info6
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    private String titular;

    // Contructor a pelo
    public CuentaBancaria() {

    }

    // Constructor con parametros
    public CuentaBancaria(String numeroCuenta, int saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // SETTERS
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // GETTERS
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // TO STRING
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + '}';
    }

    // METODOS
    public double depositar(double monto) {

        if (monto > 0) {
            this.saldo = this.saldo + monto;

            System.out.println("------");
            System.out.println("Se ha Depositado "+monto+" a la cuenta!");
            System.out.println("Saldo Actual: "+this.saldo);
            return this.saldo;
        }

        return this.saldo;
    }

    public double retirar(double monto) {

        if (monto > 0) {
            this.saldo = this.saldo - monto;
           System.out.println("------");
           System.out.println("Se ha Retirado "+monto+" de la cuenta!");
           System.out.println("Saldo Actual: "+this.saldo);
            return this.saldo;
        }

        return this.saldo;
    }

}
