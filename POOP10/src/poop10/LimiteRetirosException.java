/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author gabri
 */
public class LimiteRetirosException extends Exception {
    public LimiteRetirosException() {
        super("Error: No se pueden realizar más de 3 retiros.");
    }
}
