import java.util.*;
public class WarehouseInv {
  public static void main(String[] args) {
//warehouse inventory
// you have n products
//for each product input current stock and min required stock
//if any product stock does not meets required stock print "restock needed for product x" where x is product number
//print the total number of products that need restocking
//else print "stock sufficient"
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int curr_st=sc.nextInt();
      int req_st=sc.nextInt();
      if(req_st>curr_st){
        System.out.println("Restock needed for Product: "+i);
        int pr=req_st-curr_st;
        System.out.println("Total products needed for restock"+pr);
      }
      
    }
  }
}
