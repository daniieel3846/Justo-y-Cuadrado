
package fairsquare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FairSquare {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("entrada.txt"));
        int Firstline = Integer.parseInt(bf.readLine()); //primera linea del archivo = numero de casos
        for(int i=0;i<Firstline;i++){
            int justoC = 0;
            String linea = bf.readLine();
            String[] arr = linea.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            while(A<=B){
                justoC=(JustoYCuadrado(A,justoC));
                A++;
            }
            System.out.println("Case #"+(i+1)+": "+justoC);
        }
    }
    public static int JustoYCuadrado(int n, int justoC) {
        if (Palindromo(String.valueOf(n))){
            //System.out.println("es palindromo");
            String resultado = String.valueOf(Math.sqrt(n)); //la raiz cuadrada del numero
            int posicionPunto = 0; //posicion del punto e la cadena
            for (int j = 0; j < resultado.length(); j++) {
                if (resultado.charAt(j) == '.') posicionPunto = resultado.indexOf('.');
            }
            String[] arreglo = resultado.split(""); //separar la cadena
            int Numero = Integer.parseInt(arreglo[posicionPunto + 1]); //numero a evaluar despues del punto
            if (ValidarRaizExacta(Numero)) {
                //System.out.println("Es cuadrado tiene raiz exacta");
                double raiz = Math.sqrt(n);
                if (Palindromo(String.valueOf(Math.round(raiz)))) {
                    //System.out.println("El cuadrado es palindromo");
                    justoC++;
                }
            }
        }
        return justoC;
    }
    public static boolean Palindromo(String n){
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
        if(N!=0)b=false;
        return b;
    }
}
