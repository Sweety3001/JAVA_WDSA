public class Bill {
  public static void main(String[] args) {
      //Calculate bill acc to hour
      //first 2 two hour = 50/h
      //next 3 hour=25/h
      //remainng = 10/h
      int h=7;
      int bill=0;
      for (int i = 1; i <= h; i++) {
            if (i <= 2) {
                bill += 50;
            } else if (i <= 5) {
                bill += 25;
            } else {
                bill += 10;
            }
      }
    System.out.println(bill);
  }
}
