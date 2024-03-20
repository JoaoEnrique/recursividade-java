/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fatorial {
    public int semRecursividade(int n){
        int fator = 1;
        
        for(int i=1; i<=n; i++){
            fator *=i;
        }
        
        return fator;
    } 
    
    public int comRecursividade(int n){
        if(n == 1 || n == 0) return n;
        
        return n * comRecursividade(n-1);
    }
}
