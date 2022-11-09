public class ArrayFristLastCheck {
    
    public static void main(String[] args) {
         int [] nums ={10,20,30,-10,10};
 int temp=0;
         if(nums[0]==nums[nums.length-1]){
            temp = temp+1;
         }
    

    if(temp==0){
        System.out.println("First and last element don't match.");
    }
    else{
        System.out.println("First and last element match.");
    }
}
}