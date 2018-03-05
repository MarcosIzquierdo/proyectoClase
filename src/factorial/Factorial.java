/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

public class Factorial {

    public static void main(String[] args) {
        System.out.println( Factorial.factorial(3));
    }
    public static int factorial(int numero){
        int factorial = 0;
        while (numero != 0){
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
    }
    
}
