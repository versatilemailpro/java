public class ArraySwapFirstLastElement {
    public static void main(String[] args) {
        
        int [] nums = {10,20,30,50,90};

        int fNum= nums[0];
        int lNum = nums[nums.length-1];

        int temp;

        temp = fNum;
        fNum = lNum;
        lNum = temp;

        nums[0]= fNum;
        nums[nums.length-1]=lNum;

        for(int printArray: nums){
            System.out.print(printArray+" ");
        }





    }
}
