import java.util.Scanner;
public class Demo1 {
    public static void main(String args[]){    
        try{  
            int a = 10;
            int b = 0;
            if(b == 0){
                throw new ArithmeticException("DIVIDED BY ZERO");
            }
            int d = a/b;
        }    
        catch(ArithmeticException e){
            System.out.println(e);   
            System.out.println("task1 is completed");
            }    
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
        catch(Exception e){
            System.out.println(e);
            System.out.println("common task completed");}    
        System.out.println("rest of the code...");    
      }       
}
