import java.util.Scanner;

public class Q3 {

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String s1 = sc.nextLine();
    //     String s2 = sc.nextLine();
    //     System.out.println(s1.contains(s2));
    //     sc.close();
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();

        // int idx=s.indexOf(p);
        // if(idx!=-1){
        //     System.out.println(idx+" "+(idx+p.length()-1));
        // }else{
        //     System.out.println("Not found");
        // }

        //SLINDING WINDOW
        int m=s.length();
        int n=p.length();
        boolean flag;
        for(int i=0;i<m-n;i++){
            flag=true;
            for(int j=0;flag && j<n;j++){
                if(s.charAt(i+j)!=p.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("Index Range: "+i+" to "+(i+n-1));
                return;
            }
        }
        System.out.println("Not found");
    }
}
//wap to take input of 2 string s1 and s2 and check whether s2 is substring of s1 or not
