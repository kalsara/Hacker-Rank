/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mini_Max_sum{
   

      static  Long[] value=new Long[5];
       static  long max;
       static long min;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        
        
        value[0]=a;
        value[1]=b;
        value[2]=c;
        value[3]=d;
        value[4]=e; 
        Mini_Max_sum obj=new Mini_Max_sum();
        obj.Max();
        obj.Min();
        obj.calculation(max, min);
        
    }
    
    
    public long Max(){
         max=value[0];
         int countM=0;
        for(int i=0;i<5;i++){

           if(value[i]>=max){
              
            max=value[i];
           }
           
       }

    return max;

   }
    
     public long Min(){
         min=value[0];
        for(int i=0;i<5;i++){
           if(value[i]<=min){
              min=value[i];
              
           }
             
       }
        System.out.println(min);
    return min;

   }
     
     public void calculation(long Max,long Min){
         long  MaxSum=0;
         long  MaxMin=0;
         for(int j=0;j<5;j++){
             MaxSum=MaxSum+value[j];
             
             
             MaxMin=MaxMin+value[j];
             
             
         }
         
         System.out.print((MaxMin-max)+" "+(MaxSum-min));

     
     }
    
}
