import java.lang.*;
import java.io.*;

class test1{
    public static int add(int a,int b){
        return (a+b);
    }
    public static double add(double a,double b){
        return (a+b);
    }
    public static void main(String args[]){
        System.out.println("INT : "+add(1,3)+" DOUBLE : "+add(23.4,45.3));
    }
}