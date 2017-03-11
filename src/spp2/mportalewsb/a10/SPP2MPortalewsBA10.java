/*Maythé Portales Barrios
 Actividad 10
Ing. Industrial y de Sistemas
 */
package spp2.mportalewsb.a10;
import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalewsBA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a, b, r;
        int tamaño;
        tamaño = solicitaTamaño();
        a = crearMatriz("A", tamaño);
        b = crearMatriz("B", tamaño);
        imprimirMatriz("Matriz A", a);
        imprimirMatriz("Matriz B", b);
        r = restaMatriz(a, b);
        multiplicaMatriz(a, b);
    }

    public static int solicitaTamaño() {
        int tamaño = 0;
        boolean flag;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce el tamaño");
                tamaño = teclado.nextInt();
                flag = false;
                return tamaño;
            } catch (Exception ex) {
                System.out.println("NO es un numero de tamaño");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return tamaño;
    }

    public static int[][] crearMatriz(String dato, int tamaño) {
        System.out.println("Matriz " + dato);
        int[][] miMatriz = new int[tamaño][tamaño];
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                miMatriz[i][j] = solicitaEntero();
            }
        }
        return miMatriz;
    }

    public static int solicitaEntero() {
        Scanner teclado = new Scanner(System.in);
        int entero = 0;
        boolean flag;
        do {
            try {
                System.out.println("Introduce enteros");
                entero = teclado.nextInt();
                flag = false;
            } catch (Exception ex) {
                System.out.println("No son enteros");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return entero;
    }

    public static void imprimirMatriz(String dato, int a[][]) {
        System.out.println(dato);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static int[][] restaMatriz(int[][] a, int[][] b) {
        System.out.println("La resta de matrices es");
        int[][] r = new int[a.length][a.length];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                r[i][j] = (a[i][j] - b[i][j]);
                System.out.print("[" + r[i][j] + "]");
            }
            System.out.println();
        }
        return r;
    }

    public static void multiplicaMatriz(int[][] a, int[][] b) {
        int [][] m= new int [a.length][a.length];
        int [][] p= new int [a.length][a.length];
        System.out.println("Multiplicacion de matrices");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    m[i][j] = a[i][k] * b[k][j];
                    p[i][j]=p[i][j]+m[i][j];                    
        System.out.print("["+m[i][j]+"]");        
        }           
        }
        System.out.println();
         }
        System.out.println("Resultado");
        for (int i=0; i<a.length;i++){           
        for (int j=0;j<a.length;j++){ 
            p[i][j]=0;  
        for (int k = 0; k < a.length; k++) {
                    m[i][j]=a[i][k]*b[k][j];
              p[i][j]=p[i][j]+m[i][j];  
        } 
        System.out.print("["+p[i][j]+"]");           
        }
        System.out.println();
         }   
}
}
