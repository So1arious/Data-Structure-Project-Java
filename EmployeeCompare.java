public class Employee
{
  //Data types
  private int id;
  private String name;
  private double salary;
  private String department;
  private String position;
  private int year;

  //Initialization
  public Employee()
  {
    id = 0;
    name = " ";
    salarly = 0.0;
    department = " ";
    position = " ";
    year = 0;
  }

  public Employee(int i, String n, double s, String d, String p, int y)
  {
    id = i;
    name = n;
    salary = s;
    department = d;
    position = p;
    year = y;
  }

//Set Method
public void setID(int i)
  { id = i; }
public void setName(String n)
  { name = n; }
public void setSalary(double s)
  { salary = s; }
public void setDepartment(String d)
  { department = d; }
public void setPosition(String p)
  { position = p; }
public void setYear(int y)
  { year = y; }

//Get Method
public int getId()
  { return id; }
public String getName()
  { return name; }
public double getSalary()
  { return salary; }
public String getDepartment()
  { return department; }
public String getPosition()
  { return position; } 
public int getYear()
  { return year; }
}
