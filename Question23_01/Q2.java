
import java.util.HashSet;
import java.util.Scanner;



public class Q2 {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String msg=sc.nextLine();
    //     int[] count=new int[200];
    //     for(int i=0;i<msg.length();i++){
    //       count[msg.charAt(i)]++;
    //     }
    //     for(int i=0;i<msg.length();i++){
    //       if(count[msg.charAt(i)]==1){
    //         System.out.println("First non repeating char: "+msg.charAt(i));
    //         break;
    //       }
    //     }
    //     for(int i=msg.length()-1;i>=0;i--){
    //       if(count[msg.charAt(i)]==1){
    //         System.out.println("Last non repeating char: "+msg.charAt(i));
    //         break;
    //       }
    //     }
    //     sc.close();
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String s = sc.nextLine();
    //     LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    //     }
    //     char f = '1';
    //     char l = '1';
    //     for (char c : map.keySet()) {
    //         if (map.get(c) == 1 && f == '1') {
    //             f = c;
    //         } else if (map.get(c) == 1) {
    //             l = c;
    //         }
    //     }
    //     if (f != '1') {
    //         System.out.println("First Non-Repeating: " + f);
    //     } else {
    //         System.out.println("First Non-Repeating:''");
    //     }
    //     if (l != '1') {
    //         System.out.println("Last Non-Repeating: " + l);
    //     } else {
    //         System.out.println("First Non-Repeating:''");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character>set2=new HashSet<>();

        for(int i=0;i<s.length();i++){
          if(set1.contains(s.charAt(i))){
            set1.remove(s.charAt(i));
            set2.add(s.charAt(i));
          }else if(!set2.contains(s.charAt(i))){
            set1.add(s.charAt(i));
          }
        }
        for(int i=0;i<s.length();i++){
          if(set1.contains(s.charAt(i))){
            System.out.println("First "+s.charAt(i));
            i=s.length();
          }
        }
        for(int j=s.length()-1; j>=0;j--){
           if(set1.contains(s.charAt(j))){
            System.out.println("Last: "+s.charAt(j));
            j=-1;
          }
        }
    }
  }

//wap to find first and last non repeating character in a string
