/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author DELL
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int s=7;
       int k=1;
       int r;

       for(int i=1;i<=s;i++){
           int num=1;
           r=i;
           int col=0;
           for(int j=1;j<=2*s-1;j++){

               if(j <= s-i)
               System.out.print("  ");
               else if(j >= s+i)
               System.out.print("  ");
               else{
                   if(k%2 ==0){
                       System.out.print("  ");

                   }
                   else{
                        if (col > 0) {
                            num = num * (r - col) / col;    
                        }

                    System.out.print(num+" ");
                       col++;
                   }
               k++;
               }
           }
           System.out.println("");
           k=1;
       }

	
}
    
    

