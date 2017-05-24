package fattoriale;

import java.util.Scanner;


public class Fattoriale {

 

    public static void main(String[] args) {
        int i= 10;
         while(i!=0){
             Fatt f;
             f= new Fatt(i);
             f.start();
             i=i-1;
         }    

    } 
}
