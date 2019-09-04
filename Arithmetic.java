
import java.util.Scanner;

public class Arithmetic{

      public static void main(String[] args){

      /**
       *Author:Min LI   Student number:li000611
       *This is a program about compute.
       *this is the example provided by instruction
       */
       double cm,in;
       
       System.out.println("please enter the measurement value in centimetres:");

       Scanner input = new Scanner(System.in);

       cm = input.nextDouble();

       in = cm/2.54;

       System.out.format("%.3f cm is equivalent to %.3f inches\n",cm,in);

       System.out.format("the area of the square is %.3f square cm or 3%.3f square inches\n",cm*cm,in*in);

       System.out.format("the perimeter of the square is %.3f cm or %.3f inches\n",4*cm,4*in);

       System.out.format("the volume of the cube is %.3f cubic cm or %.3f cubic inches\n",cm*cm*cm,in*in*in);

       input.close();
     }

}