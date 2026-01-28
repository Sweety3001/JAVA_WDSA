public class ElectricBill {
  public static void main(String[] args) {
      //0-100-> Rs.2/unit
      //101-200->Rs.3/unit
      //Rest->Rs.4/unit
      //fixed charge->50
      //if fill exceeds 2000 pay an extra 10%
      float unit=126;
      float bill=50;
      for(int i=1;i<=unit;i++){
        if(i<=100){
          bill+=2;
        }else if(i<=200){
          bill+=3;
        }else{
          bill+=4;
        }
      }
      if(bill>2000){
        bill+=(0.1*bill);
      }
      System.out.println(bill);
  }
}

