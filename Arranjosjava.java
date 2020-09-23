/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arranjosjava;

import java.util.Scanner;

/*ECO130
Prática 3 - Descrição do objeto do programa
Nome: Alessandro
Data: 22/09/2020
*/
public class Arranjosjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int fn1 = 1;
        int fn2 = 1;
        int valor1 = 0;
        int valor2 = 0;
        int arranjo1;
        int arranjo2;
                
        System.out.print("Digite a quantidade total de elementos do conjunto: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite a quantidade de elementos por arranjo: ");
        valor2 = teclado.nextInt();
        
        arranjo1 = valor1 - valor2;
        
                
        for (int cont = 1; cont <= valor1; cont++){
            fn1 = fn1 * cont;
        
            
        }
        
        for (int cont = 1; cont <= valor2; cont++){
            fn2 = fn2 * cont;
        }
        
        arranjo2 = (fn1 / fn2);
        System.out.println("\n Será possível formar " +arranjo2+ " arranjo(s)!");
    }
    
}
