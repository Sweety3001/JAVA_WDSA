//binary search on answer problems
//if the answer is numeric and the feasibility changes monotonically true to false or
//  false to true we can binary serach on it , min possible , max possible , atleast ,
//  atmost capacity , limit , can we do in x
public class BinarySearch{
    static int Banana(int[] arr,int h){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int low=1,high=max,speed=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr,h,mid)){
                speed=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return speed;
    }

    static boolean isPossible(int arr[],int h, int mid){
        int hours=0;
        for(int i=0;i<arr.length;i++){
            hours+=(arr[i]+mid-1)/mid; 
        }
        if(hours<=h){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        int arr[]={3,6,7,11};
        int h=8;
        System.out.println(Banana(arr,h));
    }


}