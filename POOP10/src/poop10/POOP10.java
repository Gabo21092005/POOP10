/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author gabri
 */
public class POOP10 {

    public static void main(String[] args) {
        // TODO code application logic here

        double a = 5;
        double b = 2;

        double c = a / b;
        System.out.println("El valor obtenido es = " + c);

        // Crear un arreglo e inicializarlo con los valores de i de 0 a 4
        int[] arreglo = new int[5];

        try {
            for (int i = 0; i < 5; i++) {
                arreglo[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException x) {
            x.printStackTrace();
        }

        try {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
        } catch (ArrayIndexOutOfBoundsException x) {
            x.printStackTrace();
        }

        // Crear un método que reciba 2 parámetros y que divida x/y
        double x = 5;
        double y = 0;

        double w = dividir(x, y);
        System.out.println("El resultado es = " + w);

        Cuenta cuenta1 = new Cuenta();

        try {
            // ✅ Ahora depositarSaldo está dentro del try-catch
            cuenta1.depositarSaldo(21000);
            cuenta1.consultarSaldo();

            cuenta1.retirarSaldo(500);
            cuenta1.retirarSaldo(500);
            cuenta1.retirarSaldo(300);
            cuenta1.retirarSaldo(100); // este cuarto retiro lanza LimiteRetirosException

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (LimiteRetirosException e) {
            System.out.println(e.getMessage());
        } catch (SaldoExcesivoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double dividir(double x, double y) throws ArithmeticException {
        return x / y;
    }
}

        
    

    
        

