/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Potencia {
  public int semRecursividade(int x, int y){
        int pot = x;
        
        for(int i=1; i<y; i++){
            pot = pot* pot;
        }
        
        return pot;
    } 
    
    public int comRecursividade(int x, int y){
        if(y == 0) return 1;
        return x * comRecursividade(x, (y-1));
    }
}