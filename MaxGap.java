/* Given an integer array nums, return the maximum difference between two successive elements in its sorted form. 
If the array contains less than two elements, return 0. You must write an algorithm that runs in linear time and 
uses linear extra space.
* Eg 1 : nums = [3,6,9,1]       Output = 3
* Eg 2 : nums = [10]            Output = 0
*/
import java.util.*;
public class MaxGap
{
      public int MaximumConsecutiveGap(int nums[])
      {
            PriorityQueue<Integer> MinHeap = new PriorityQueue<Integer>();     //*  Min Heap -> O(N)
            for(int i = 0; i < nums.length; i++)      //! Evaluation -> O(N)
                  MinHeap.add(nums[i]);
            int max = 0;
            while(MinHeap.size() != 1)    //! Comparison -> O(N)
            {
                  int x1 = MinHeap.poll();
                  int x2 = MinHeap.peek();
                  if(max < (x2 - x1))      // If we get a bigger gap...
                        max = x2 - x1;
            }
            return max;
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter the number of elements : ");
            x = sc.nextInt();
            int array[] = new int[x];
            for(int i = 0; i < array.length; i++)
            {
                  System.out.print("Enter number : ");
                  array[i] = sc.nextInt();
            }
            MaxGap maxgap = new MaxGap();      // Object creation...
            System.out.println("The Maximum Gap is : "+maxgap.MaximumConsecutiveGap(array));
            sc.close();
      }
}



//! Time Complexity -> O(N)
//* Space Complexity -> O(1)