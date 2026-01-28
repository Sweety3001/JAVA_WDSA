import java.util.*;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String msg=sc.nextLine();
        String words[]=msg.split(" ");
        String revmsg="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=word.length()-1;j>=0;j--){
                revmsg+=word.charAt(j);
            }
            if(i<words.length-1){
                revmsg+=" ";
            }
        }
        System.out.println(revmsg);
    }
}
//wap reverse each word of a string