import java.io*;

public class CreateEmployeeFile
{
  public static void main(String[] args)
  {
    try
    {
      PrintWriter writer = new PrintWriter(new FileWriter("Employee.txt"));
      
      //Employee 1
      writer.println("782390");
      writer.println("Sora");
      writer.println("$50.00");
      writer.println("Human Resources");
      writer.println("HR Specialist");
      writer.println("3");

      //Employee 2 
      writer.println("102938");
      writer.println("Riku");
      writer.println("$70.00");
      writer.println("Information Technology");
      writer.println("Software Engineer");
      writer.println("4");

      //Employee 3
      writer.println("774466");
      writer.println("Kairi");
      writer.println("$60.00");
      writer.println("Marketing");
      writer.println("Marketing Director");
      writer.println("2");

      //Employee 4
      writer.println("334455");
      writer.println("Donald");
      writer.println("$120.00");
      writer.println("Administrative");
      writer.println("Office Manager");
      writer.println("8");

      //Employee 5
      writer.println("990011");
      writer.println("Goofy");
      writer.println("$100.00");
      writer.println("Finance");
      writer.println("Financial Analyst");
      writer.println("7");

      writer.close();
      System.out.println("Employee.txt has been created successfully.");
    }

  catch (IOException e)
      {
        System.out.println("Error writing to file: " + e.getMessage());
      }
  }
}
