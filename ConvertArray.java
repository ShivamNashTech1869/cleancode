//java program for print the index of given array's elements for it's sorted version-
import java.util.ArrayList;
import java.util.Collections;
public class ConvertArray
{
 public static void getIndexOfArray(int []array , int []resultArray)
 {
 int arrayLength = array.length;
 //creating temp arr for find index of it's sorted order wethought effect given array
 ArrayList<Integer> tempArray = new ArrayList<Integer>(arrayLength);
 for(int index=0;index<arrayLength;index++)  
  tempArray.add(array[index]);
 //sort the temparray
 Collections.sort(tempArray);  
 //geting the index of given array elements
 for(int index=0;index<arrayLength;index++)
  resultArray[index] = tempArray.indexOf(array[index]);
 }
public static void main(String args[])
 {
  int array[] = {5,10,40,30,20};
  int arrayLength = array.length;
  int resultArray[] = new int[arrayLength];
  System.out.print("Enterd arr : ");
  for(int index=0;index<arrayLength;index++)
   System.out.print(array[index]+" ");
  //calling convert method
  getIndexOfArray(array,resultArray);    
  System.out.print("\nOutput : ");
  for(int index=0;index<arrayLength;index++)
   System.out.print(resultArray[index]+" ");
 }
}