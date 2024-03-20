/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Somatoria {    
    public int semRecursividade(int n){
        int soma = 0;
        
        for(int i=0; i<=n; i++){
            soma +=i;
        }
        
        return soma;
    } 
    
    public int comRecursividade(int n){
        if(n == 1) return 1;
        
        return n + comRecursividade(n-1);
    }
}
