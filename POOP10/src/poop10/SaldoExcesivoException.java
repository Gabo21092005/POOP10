/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author gabri
 */
public class SaldoExcesivoException extends Exception {
    public SaldoExcesivoException() {
        super("Error: El saldo no puede superar los 20,000 pesos.");
    }
}