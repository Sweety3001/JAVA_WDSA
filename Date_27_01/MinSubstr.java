
public class MinSubstr {
    public static void main(String[] args) {
        String s = "abbabadcbba";
        String p = "abc";
        
        //I
        int n = s.length();
        int m = p.length();
        //II
        int[] freq=new int[128];
        for(int i=0;i<m;i++){
            freq[p.charAt(i)]++;
        }
        //variable size window
        int count=m,l=0,min=Integer.MAX_VALUE,start=0;
        for(int r=0;r<=n-1;r++){
            if((freq[s.charAt(r)]--)>0){
                count--;
            }
            while(count==0){
                if ((r-l+1)<min) {
                    min=r-l+1;
                    start=l;
                }
                if((++freq[s.charAt(l++)])>0){
                    count++;
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            System.out.println("No valid substring");
        }else{
            System.out.println("MinimumWindow: "+s.substring(start,start+min)+" Index range from: "+start+ " to: "+(start+min));
        }
}
}