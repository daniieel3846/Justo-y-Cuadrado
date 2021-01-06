
package fairsquare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FairSquare {

 
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("entrada.txt"));
        int Firstline = Integer.parseInt(bf.readLine());
        for(int i=0;i<Firstline;i++){
            int justo_Y_Cuadrado = 0;
            String linea = bf.readLine();
            String[] arr = linea.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            Recorrido(A,B,justo_Y_Cuadrado);
        }

    }
    public static void Recorrido(int A,int B,int justoC){
        while(A<=B){
            
            A++;
        }
    }
    public static void JustoYCuadrado(int n, int justoC) {
        if (Palindromo(String.valueOf(n))) {
            System.out.println("es palindromo");
            String resultado = String.valueOf(Math.sqrt(n));
            int posicionPunto = 0;
            for (int j = 0; j < resultado.length(); j++) {
                if (resultado.charAt(j) == '.') {
                    //int Numero=Integer.parseInt(resultado.charAt(j));
                    posicionPunto = resultado.indexOf('.');
                }
            }
            String[] arreglo = resultado.split("");
            int Numero = Integer.parseInt(arreglo[posicionPunto + 1]);

            if (ValidarRaizExacta(Numero)) {
                System.out.println("Es cuadrado");
                double raiz = Math.sqrt(n);
                if (Palindromo(String.valueOf(Math.round(raiz)))) {
                    System.out.println("El cuadrado es palindromo");
                    justoC++;
                }
            }
        }
    }
    public static boolean Palindromo(String n){
        System.out.println(n);
        String[]array=n.split("");
        int i=0,j=array.length;
        int Coincide=0,NoCoincide=0;
        while(i<=j){
           if(array[i].equalsIgnoreCase(array[j-1])){
                 Coincide++;
            }else{
                NoCoincide++;
            }
            i++;
            j--;
        }
        if(Coincide>NoCoincide)return true;
        
        return false;
        
    }
    
    public static boolean ValidarRaizExacta(int N){
        boolean b=true;
        if(N!=0){
            b=false;
        }
        return b;
    }
    
    
     //System.out.println(posicionPunto);
        
        
        //System.out.println(resultado);
        /*double r=Math.sqrt(n);
        if((r%2)!=0){
            System.out.println("Resultado decimal No es Cuadrado");
        }*/
        /*Pattern P = Pattern.compile("^([.][0-9])$");//^[0-9]+([.][0-9]+)?$
        Matcher M = P.matcher("5.0");
        if(M.matches()){
            System.out.println("tiene numeros decimales");
        }*/
        
        //for(int h=posicionPunto+1;h<resultado.length();h++){
            //System.out.println(resultado);
            //Pattern P = Pattern.compile(resultado);
       // }
        //}
}
