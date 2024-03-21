## Fatorial
```java
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
```

## Potencia
```java
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
```


## Somatoria
```java
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
```

## Principal
```java
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
```
