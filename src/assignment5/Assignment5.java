/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import java.lang.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author S545533
 */
public class Assignment5 {
  String a;
  
    /**
     * @param args the command line arguments
     */
    public void reverse(){
     String g;   
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String here : ");
     String input=sc.nextLine();
     char[] in = input.toCharArray();
     int begin=0;
     int end=in.length-1;
     char temp,ch;
     while(end>begin){
        temp = in[begin];
        in[begin]=in[end];
        in[end] = temp;
        end--;
        begin++;
    }
     g=String.copyValueOf(in);
     System.out.println("result : "+g.toUpperCase());
     System.out.println("Enter the character to find the index: ");
     String h=sc.next();
     System.out.println("Index of the character is: "+g.indexOf(h)); 
    
    }
    public void comparingStrings(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String a=sc.nextLine();
        System.out.println("Enter the Second String:");
        String b=sc.nextLine();
        
        if(a.length()>b.length())
        {
            System.out.println("First string is grater than second");
        }
        else if(b.length()>a.length())
        {
            System.out.println("Second string is grater than first");
        }
        else
        {
            System.out.println("both are equal length");
        }
    }
    public void randomLetter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you want to print :");
        String s=sc.nextLine();
        System.out.println("The length of the string is:"+s.length());
        Random random = new Random();
        int index = random.nextInt(s.length());
        System.out.println("character "+s.charAt(index)+" is at position "+index);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Assignment5 a=new Assignment5();
        a.reverse();
        a.comparingStrings();
        a.randomLetter();
        
    }
    
}