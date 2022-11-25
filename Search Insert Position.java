import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;


        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
        }
        return l;
    }
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Element: ");
        int n=sc.nextInt();
        System.out.println("Enter the Element: ");
        int[] nums=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the Target: ");
        int target=sc.nextInt();

        System.out.println(searchInsert(nums,target));
    }
}
