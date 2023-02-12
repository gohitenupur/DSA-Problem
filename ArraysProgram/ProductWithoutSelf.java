package ArraysProgram;

public class ProductWithoutSelf {
    public static void main(String[] args) {
        int []nums = {1,2,0,4};
        int len = nums.length;
        int [] ans =new int[len];
        int product =1;
        for(int i=0;i<ans.length;i++){
            if(nums[i]==0){
                continue;
            }
            product*=nums[i];
        }
        for(int i=0;i<ans.length;i++){
            if(nums[i]==0){
                ans[i]=0;
            }else{
                ans[i]=product/nums[i];
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
