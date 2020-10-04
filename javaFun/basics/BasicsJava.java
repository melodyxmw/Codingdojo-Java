import java.util.ArrayList;


public class BasicsJava {
    
    public void OneTo255(){
        for (int i =0; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void OddTo255(){
        for (int i =1; i <=255; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void PrintSum(){
        int sum =0;
        for (int i =0; i<=255; i++){
            sum +=i;
            System.out.println(i);
            System.out.println(sum);
        }
    }

    public void LoopArray(int[] arr){
        for(int val:arr){
            System.out.println(val);
        }
    }

    public int FindMax(int[] arr){
        int currMax = Integer.MIN_VALUE;
        for (int val:arr){
            if(val > currMax){
                currMax = val;
            }
            return currMax;
        }
    }

    public double GetAverage(int[] nums){
        int sum = GetArraySum(nums);
        double avg = (double)sum/nums.length;
        System.out.println(String.format("Sum:%d, Average:%f", sum,avg));
        return avg;
    }

    public ArrayList<Integer> OddArray(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0; i <=255; i++){
            if( i % 2 !=0) {
                nums.add(i);
            }
        return nums;
        }
    }

    public int GreaterThanY(int[] arr, int y){
        int count = 0;
        for(int num:arr){
            if(num >y){
                count++;
            }
        return count;
        }
    }

    public void SquareArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
    }

    public void EliminateNegatives(int[] nums){
        for(int i = 0 ; i < nums.length; i++){
            if (nums[i] < 0){
                nums[i] = 0;
            }
        }
    }

    public void MaxMinAverage (int[] nums){
        int min = FindMin(nums);
        int max = FindMax(nums);
        double avg = GetAverage(nums);
        System.out.println(String.format("Max: %d, Min:%d, Average:%f", max,min,avg));
    }

    
}

