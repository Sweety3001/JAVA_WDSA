import java.util.*;
public class Notes {
  //take an input of amount
  //divide this amount into higher denomination as possible of 2000, 500, 100
  //try to issue least number of notes
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int amount=sc.nextInt();
      int numNo=0;
      if(amount%100!=0){
          System.out.println("Notes of this amount not available ");
      }else
      {
        while(amount>0){
        int t1=amount/2000;
        numNo+=t1;
        amount=amount-(t1*2000);
        int t2=amount/500;
        numNo+=t2;
        amount=amount-(t2*500);
        int t3=amount/100;
        numNo+=t3;
        amount = amount - (t3 * 100);
        
      }
      System.out.println(numNo);
    }
  }
}

// wap to print sum of numbers taken by user 
//you have to take input till user enters zero