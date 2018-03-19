/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    static void zadanie14(){
            int a = 9 << 5;
            System.out.println("Operator lewego przesuniecia ze znakiem <<: 9 << 5 to jest to samo co dziesietnie: " + a);
            int b = -15 >> 5;
            System.out.println("Operator prawego przesuniecia ze znakiem >>: -15 >> 5 to jest to samo co dziesietnie: " + b);
            int c = 9 >>> 5;
            System.out.println("Operator prawego przesuniecia bez znaku >>>: 9 >>> 5 to jest to samo co dziesietnie: " + c);
        }
    
    static void zadanie17(){
            System.out.println("NOT neguje wartosc, np:");
            boolean x = true;
            boolean y = false;
            boolean z = true;
            System.out.println(" x = "+x);
            System.out.println(" Not x = " + !x);
            System.out.println("XOR zwraca 1, gdy wartosci obu zmenych są rowne, np: ");
            System.out.println("x = " +x);
            System.out.println("y= " +y);
            System.out.println("z= " +z);
            if(x^y || z^y){
                System.out.println("X Xor Y lub Z Xor y - Zwrocona zostanie 1");
            }
            System.out.println("X Xor Z lub X Xor !Y - Zwrocone zostanie 0");
        }
    
    static void zadanie22(){
        String sl1 = new String("lubie placki XD");
        String sl2 = new String("cos innego");
        String sl3 = new String("pisane z MALYCH liter");
        String sl4 = new String("DURZE czy jednak male LITERKI");
        String sl5 = new String("     taki tam tekst ze spacjami          ");
         
        
        System.out.println(sl1.toCharArray());//
        System.out.println(sl1.getBytes());//String zmienia na tablice z znaków
        System.out.println(sl1.equals(sl2));//porównanie dwóch stringów 
        System.out.println(sl1.equalsIgnoreCase(sl3));//porównanie pomijając wielokośc znaków
        System.out.println(sl1.compareTo(sl4));//Porównuje ciąg znaków do innego ciągu znaków bez względu na wielkość liter
        System.out.println(sl1.compareTo(sl3));//Porównuje ciąg znaków do innego ciągu znaków bez względu na wielkość liter
        System.out.println(sl1.indexOf('p'));//Wyszukuje określony obiekt i zwraca indeks jego pierwszego wystąpienia
        System.out.println(sl1.lastIndexOf('m'));//  Wyszukuje określony obiekt i zwraca indeks jego ostatniego wystąpienia
        System.out.println(sl1.substring(4));//Metoda zwraca część ciągu znaku zaczynającego się od indeksu startString, możemy także określić indeks końcowy stopString
        System.out.println(sl1.substring(0,4));// 
        System.out.println(sl2.replace('e','d'));//zastępuje wszystkie wystąpienia jednego znaku na inny znak i zwraca zmieniony ciąg znaków
        System.out.println(sl5.trim());//Usuwa początkowe i końcowe białe znaki i zwraca poprawiony ciąg znaków
        System.out.println(sl3.toLowerCase());//zmienia na male litery
        System.out.println(sl4.toUpperCase());//zmienia na duze litery
        
        }
    static void zadanie33(){
            
        }
    static void zadanie34(){
            
        }
    
    private static int Iteracyjnie(int x, int y){
        int wynik=1;
        int n=0;
        while(n<y){
            wynik*=x;
            n++;
        }
        return wynik;

     }
    
    private static int Rekurencyjnie(int x, int y){
        int wynik;
        if ( y == 1) 
            return x;
        else wynik = Rekurencyjnie(x, y - 1);
        return x*wynik;

    }
    
    static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        Scanner scanner = new Scanner(System.in);
        
        //zadanie22();
        int i,j, zad;
        
        System.out.print("wybierz zadanie 14; 17; 22; 33; 34: ");
        zad = scanner.nextInt();
        
        
        switch(zad){
            case 14:{
                zadanie14();
                break;
            }
            case 17:{
                zadanie17();
                break;
            }
            case 22:{
                zadanie22();
                break;
            }
            case 33:{
                int x;
                System.out.println("1 Rekurencyjnie; 2 Iteracyjnie ");
                x = scanner.nextInt();
                switch(x) {
                    case 1:{
                        System.out.println("Podaj liczbe: ");
                        j = scanner.nextInt();
                        System.out.println("Podaj wykladnk: ");
                        i = scanner.nextInt();
                        System.out.println("Wynik potegowania: " + Rekurencyjnie(j,i) );
                        break;
                    }
                    case 2:{
                        System.out.println("Podaj liczbe: ");
                        j = scanner.nextInt();
                        System.out.println("Podaj wykladnk: ");
                        i = scanner.nextInt();
                        System.out.println("Wynik potegowania: " + Iteracyjnie(j,i) );
                        break;
                    }
                    default:{
                        System.out.println("zle dane");
                        break;
                    }
                }
                
                break;
            }
            case 34:{
                System.out.println("Podaj wartosc dla fibonacciego");
                int wartosc = scanner.nextInt();
                System.out.println(wartosc + " wyraz Fibonnaciego to: " + fib(wartosc));
                break;
            }
            default:{
                System.out.println("nie ma teakigo zdanka");
                break;
            }
        }
        
    }
    
}
