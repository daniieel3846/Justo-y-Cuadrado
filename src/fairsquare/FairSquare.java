
package fairsquare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FairSquare {

 
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new FileReader("entrada.txt"));
        int Firstline = Integer.parseInt(bf.readLine());
        //for(int i=0;i<Firstline;i++){
        String linea=bf.readLine();
        String[] arr=linea.split(" ");
        int A=Integer.parseInt(arr[0]);
        int B=Integer.parseInt(arr[1]);
        int n=36;
        String resultado=String.valueOf(Math.sqrt(n));
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
        
        int posicionPunto=0;
        for(int j=0;j<resultado.length();j++){
            if(resultado.charAt(j)== '.'){
                //int Numero=Integer.parseInt(resultado.charAt(j));
                posicionPunto=resultado.indexOf('.');
            }
        }
        String []arreglo=resultado.split("");
        int Numero=Integer.parseInt(arreglo[posicionPunto+1]);
        
        if(!ValidarRaizExacta(Numero)){
            System.out.println("No es un cuadrado");
        }
        //System.out.println(posicionPunto);
        
        
        
        
        //for(int h=posicionPunto+1;h<resultado.length();h++){
            //System.out.println(resultado);
            //Pattern P = Pattern.compile(resultado);
       // }
        //}
      
    }
    public static void Recorrido(int A,int B){
        while(A<=B){
            A++;
        }
    }
    public static boolean ValidarRaizExacta(int N){
        boolean b=true;
        if(N!=0){
            b=false;
        }
        return b;
    }
    
}