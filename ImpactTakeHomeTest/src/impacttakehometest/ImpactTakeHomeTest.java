/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impacttakehometest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author muttalibmoos
 */
public class ImpactTakeHomeTest implements NumberRangeSummarizer{
    
    String colour = "blue";
    
//collect the input for the range of numbers 
     public static void collect() {
        int n, temp;
       
        Scanner s = new Scanner(System.in);
        
         System.out.print("Enter no. of numbers you want in your range:");
         
            n = s.nextInt();
                int nums[] = new int[n];
                 int sum = 0;
                     double avg =0;    
                     
         System.out.println("Enter all the numbers:");
                       
            for (int i = 0; i < n; i++) 
             {
                    nums[i] = s.nextInt();
             }

             for (int i = 0; i < n; i++) 
              {
                for (int j = i + 1; j < n; j++) 
                 {
                    if (nums[i] > nums[j]) 
                     {
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                     }
                 }
              }
        
         List<String> res= summarizeCollection(nums);
       
       // printing the summarized range of numbers 
       
        for(String str:res)
            System.out.print(str); 
    }

    //get the summarized string
   
    
    public static List<String> summarizeCollection(int[] nums) 
    {      
        List<String> res= new ArrayList<String>();
        
         int i=0,n=nums.length;
            while(i<n)
            {
                int start,end;

                start=nums[i];            
                while(i+1<n && nums[i+1]==nums[i]+1) i++;
                end=nums[i];

                if(start==end)
                    res.add(start + ", ");
                else
                    res.add( start + "-" + end + ", " );  
                i++;          
            }  
        return res;
    
    }

    @Override
    public Collection<Integer> collect(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) 
    {
        ImpactTakeHomeTest ex = new ImpactTakeHomeTest();
        
        ex.collect();   
    }
  
}
