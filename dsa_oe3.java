//Programmer: Isaac Morallo
import java.util.Scanner;

public class dsa_oe3{

    //method-function definition
    static void printArray(int n[]){
        for(int x=0; x < n.length; x++ ){
            System.out.print(" " + n[x]);
        }
    }

        //method-function to sort elements of the array
    static void sortArray(int n[]){
        int num = n.length, i, j, temp;

        for(i = 0; i < num; i++){
            for(j = i - 1; j >= 0 && n[j+1] < n[j]; j--){
                //swapping - temp variable to avoid loss of data
                temp = n[j+1];
                n[j+1] = n[j];
                n[j] = temp;
            }
        }
    }

   public static void main(String[] args) {

        //declaration of array in Java with new operator - create instance of the array object
        

        //THE ELEMENTS OF THE ARRAY SHOULD BE ENTERED BY THE USER
        //USE SCANNER CLASS
        //Find the smallest element of the array

        System.out.print("Enter the size of the array : ");
        //scanner variable

        int num_array2[] = new int[10]; // empty array - fixed size

        // declare and initialize the value of the array 
        //int num_array2[] = {50,90,70,40,10,60,30,80,20};

        /*traverse the elements of the array and print all - iteration - looping statements
        for(int x = 0; x < num_array2.length; x++){
            System.out.print(" " + num_array2[x]);
        } */

        //calling the method
        System.out.print("\n Unsorted array : ");
        printArray(num_array2);

        sortArray(num_array2);
        System.out.print("\n Sorted array   : ");
        printArray(num_array2);
        

        //perform addition of all the elements in the array = sum
        int sum = 0;
        for(int x = 0; x < num_array2.length; x++ ){  //CONTROL THE FLOW of the program - BOOLEAAN
            sum = sum + num_array2[x];
        }
        System.out.print("\n\nThe sum of num_array2 is >> " + sum);

        //Find the largest element = highest of the array
        int highest = num_array2[0];
        for(int x = 1; x < num_array2.length; x++  ){
            if(num_array2[x] > highest){
                highest = num_array2[x]; 
            }
        }
        System.out.print("\nThe max of num_array2 is >> " + highest);
    }
}