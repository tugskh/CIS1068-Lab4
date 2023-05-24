/*
 * Tugsbileg Khaliunbat
 * CIS1068 001
 * Lab 04
 */
package cis1068lab04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tugsbilegkhaliunbat
 */
public class CIS1068Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.printf("The sum is %.2f \n",fractionSum());
        //smallestLargest();
        //pascalTriangle();
        //showTwos(120);
        //System.out.println(toBinary(294));
        pigLatin();
    }
    
    
    
    public static double fractionSum(){
        System.out.print("This is the sum of fraction program. Enter an integer: ");
        Scanner input= new Scanner(System.in);
        double n = input.nextInt();
        double sum = 0;
        for(double i = 1; i<=n; i++) 
            sum+=1/i;
        return sum;
               
    }
    
    
    
    
    public static void smallestLargest(){
        Scanner n = new Scanner(System.in);
        System.out.print("This is the smallestLargest program. How many numbers do you want to enter? ");
        int num = n.nextInt();
        System.out.print("Number " + 1 + ": ");
        int theNumber = n.nextInt();
        int smallest = theNumber;
        int largest = theNumber;
        for(int i=2; i<=num; i++) {
            System.out.print("Number " + i + ": ");
            theNumber = n.nextInt();
            if(theNumber<smallest)
                smallest = theNumber;
            if(theNumber>largest)
                largest = theNumber;
        } 
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
        
    }
    
    
    
    
    public static void showTwos(int n){
        while(n >0) {
            if(n%2==0){
                n = n/2;
                System.out.print("2 * ");          
            }
            else {
                System.out.println(n);
                break;
            }
                
        }
    }
    
    
    
    
    public static void pascalTriangle() {
        Scanner l = new Scanner(System.in);
        System.out.print("This is the pascalTriangle program. \nHow many lines of Pascal's triangle would you like? ");
        int line = l.nextInt();
        
        for(int i = 0; i < line; i++){
            for(int j=2; j<(line*2)-2*i;j++)
                    System.out.print(" ");
            for(int j = 0;j<= i; j++){
                int coefficent = fact(i)/(fact(i-j)*fact(j));
                System.out.printf("%4d",coefficent);     
            }
            
            System.out.println("");
            
        }    
    }
    
    
    
    
    public static int fact(int number) {
        int fact;
        for(fact = 1; number>1;number--){
            fact = fact*number;
        }
        return fact;
    }
    
    
    
    public static String toBinary(int n) {
        String binary = "";
        while(n>0) {
            binary = n%2+ binary;
            n = n/2;
        }
        return binary;
    }
    
    
    
    
    
    public static void pigLatin(){
        Scanner input = new Scanner(System.in);
        System.out.print("This is the Pig Latin program. \nEnter a word: ");
        String line = input.nextLine();
        Scanner sLine = new Scanner(line);
        while(sLine.hasNext()){
            String word = sLine.next();
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(isVowel(c)){
                    if(i==0){
                        System.out.print(word+"ay ");
                        break;
                    }         
                    else {
                        System.out.print(word.substring(i, word.length())+"-"+word.substring(0, i)+"ay ");
                        break;
                    }
                }
            }
        }
    }
    
    
    
    
    
    public static boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'|| c == 'I' || c == 'o' || c == 'O' || c == 'u'||c == 'U')
            return true;
        else
            return false;
    }
        
    
    
    
        
    
    
}
