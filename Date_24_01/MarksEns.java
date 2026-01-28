import java.util.*;
class Marks{
  private int marks;
  public void setMarks(int marks){
    if(marks>=0 && marks<=100){
      this.marks=marks;
    }else{
      System.out.println("Invalid Marks");
      this.marks=0;
    }
  
  }
  public int getMarks(){
    return this.marks;
  }
}
class MarksEns {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int inMark=sc.nextInt();
  Marks m=new Marks();
  m.setMarks(inMark);
  int res=m.getMarks();
  System.out.println("Marks are: "+res);
  }
}
//create a student validation program in which marks must be between 0 to 100 considering encapsulation in mind