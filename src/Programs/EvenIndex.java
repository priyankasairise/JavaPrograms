package Programs;
import java.util.Scanner;

public class EvenIndex {
    public static void main(String[] args){
        int[] nums= new int[5];
        System.out.println("Enter Array Index Values:");
        for(int i=0; i<nums.length; i++){
            nums[i]= new Scanner(System.in).nextInt();
        }
        System.out.println("Even index from my array is:");
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0)
                System.out.println(nums[i]);
        }
    }
}
