//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Rick Mackall
 */

public class Main {
  public static void main(String[] args) 
  {
    
    System.out.println("hello, world!");

    int nums[] = {5, 9, 3,12,7,3,11,5};
    
     Lab1 lab = new Lab1();
      int i = 0;
     while(i < nums.length ){
      System.out.println(nums[i]);
      i++;
     }

     for(int j = nums.length - 1; j >= 0; j--){

        System.out.println(nums[j]);
      
     }

     System.out.println(nums[0]);
     System.out.println(nums[7]);

    System.out.println(lab.increment(1));
    System.out.println(lab.ifMax(789, 987));
    System.out.println(lab.ifMin(3406, 738));
    System.out.println(lab.sum(nums));
    System.out.println(lab.average(nums));
    System.out.println(lab.maxVal(nums));
    System.out.println(lab.minVal(nums));
    
   }
  }
// Add all of the methods here


class Lab1 {

  public int increment(int num) {
    return ++num;
  }

  public int ifMax(int a, int b){
    if(a > b){
      
      return a;
    }
    else{
      return b;
    }

  }

  public int ifMin(int a, int b){

if ( a < b){

  return a;
}
else{

  return b;
}

  }

  public int sum(int nums[]){
    
    int total = 0;
    for (int i = 0; i < nums.length; i++){
      total += nums[i];
  
    }
    return total;

  }

  public  int average(int nums[]){

    int total = 0;
    int length = nums.length;
    

    for(int i= 0; i < nums.length; i++){

      total += nums[i];

    }
    int average = total/length; 
     
     return average;
    
    }
      
  

  public int maxVal(int [] nums ){

    int max = nums[0];

    for (int i = 0; i < nums.length; i++)
    if (nums[i] > max){
    max = nums[i];
    }
    return max;

  }

  public int minVal(int [] nums){

    int min = nums[0];
    for (int i = 0; i < nums.length; i++)
    if (nums[i] < min){

      min = nums[i];
    }
    return min;


  }

}

