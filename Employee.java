public class Employee
{
    public static void main(String args[])
    {
        System.out.println("DETAILS OF EMPLOYEES");
        employee1();
        
        employee2();
        
        employee3();
        
    }
    
   public static void employee1()
   {
       String name="Ankit Das";
       int salary=45000;
       int yoj=2021;
       String address="16/3, Beltala road, Kolkata=700021 ";
       
       System.out.println("NAME: "+name);
       System.out.println("SALARY: "+salary);
       System.out.println("YEAR OF JOINING :"+yoj);
       System.out.println("ADDRESS :"+address);
   }
   public static void employee2()
   {
       String name="Dipro Soren";
       int salary=55000;
       int yoj=2023;
       String address="424,Purbachal link road, Kolkata=700086 ";
       
       System.out.println("NAME: "+name);
       System.out.println("SALARY: "+salary);
       System.out.println("YEAR OF JOINING :"+yoj);
       System.out.println("ADDRESS :"+address);
   }
   public static void employee3()
   {
       String name="Arijit Bose ";
       int salary=30000;
       int yoj=2025;
       String address="144/b, Ekdalia Road, Kolkata=700064 ";
       
       System.out.println("NAME: "+name);
       System.out.println("SALARY: "+salary);
       System.out.println("YEAR OF JOINING :"+yoj);
       System.out.println("ADDRESS :"+address);
   }
}