import java.util.*;
class EmpDetail{
  private String name;
  private int age;
  private String department;
  public void setName(String name){
    this.name=name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public void setDepartment(String department){
    this.department=department;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public String getDepartment(){
    return this.department;
  }
}
class EmployeeDet{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      EmpDetail emp=new EmpDetail();
      System.out.println("Enter Employee Name:");
      String name=sc.nextLine();  
      emp.setName(name);
      System.out.println("Enter Employee Age:");
      int age=sc.nextInt();
      emp.setAge(age);
      sc.nextLine(); // Consume newline
      System.out.println("Enter Employee Department:");
      String department=sc.nextLine();
      emp.setDepartment(department);
      System.out.println("Employee Details:");
      System.out.println("Name: " + emp.getName());
      System.out.println("Age: " + emp.getAge());
      System.out.println("Department: " + emp.getDepartment());
      sc.close();
  }
}
