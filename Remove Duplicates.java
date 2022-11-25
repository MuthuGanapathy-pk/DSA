public class duplicate {
    public static int removeDuplicates(int[] arr,int n) {
        int[] nums = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                nums[j++] = arr[i];
            }
        }

        nums[j] = arr[arr.length - 1];

        int i = arr.length - 1;
        while (nums[i] == 0) {
                i--;
        }
        String s=Arrays.toString(nums);
        System.out.println(s);
        return i;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Element: ");
        int n=sc.nextInt();
        System.out.println("Enter the Element: ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(nums,n));

    }
}
