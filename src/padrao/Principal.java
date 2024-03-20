/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Somatoria s = new Somatoria();
        Fatorial f = new Fatorial();
        Potencia p = new Potencia();
        
        System.out.println("Somatoria");
        System.out.println(s.semRecursividade(5));
        System.out.println(s.comRecursividade(5));
        System.out.println();
        
        System.out.println("Fatorial");
        System.out.println(f.semRecursividade(5));
        System.out.println(f.comRecursividade(5));
        System.out.println();
        
        System.out.println("Potencia");
        System.out.println(p.semRecursividade(5, 2));
        System.out.println(p.comRecursividade(5, 2));
    }
    
}
