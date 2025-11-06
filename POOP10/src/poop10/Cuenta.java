/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author gabri
 */
public class Cuenta {
    private double saldo;
    private int contadorRetiros; // 🔹 nuevo atributo

    public Cuenta() {
        this.saldo = 0;
        this.contadorRetiros = 0;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.contadorRetiros = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void depositarSaldo(double monto) throws SaldoExcesivoException {
        saldo += monto;
        if (saldo > 20000) {
            throw new SaldoExcesivoException();
        }
        System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
    }

    public void retirarSaldo(double monto) throws SaldoInsuficienteException, LimiteRetirosException {
        if (contadorRetiros >= 3) {
            throw new LimiteRetirosException();
        }
        if (saldo < monto) {
            throw new SaldoInsuficienteException();
        }
        saldo -= monto;
        contadorRetiros++;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}

