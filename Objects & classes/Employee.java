public class Employee {
    

    String EmployeeName ;
    int age;
    String designation;
    int salary;

    // CONSTRUCTOR

    public Employee( String name, int age, String position, int salary ){
        
        
        this.EmployeeName = name;
        this.age = age;
        this.designation = position;
        this.salary = salary;

    }


    // METHODS

    
    public void employeeInfo(){
        System.out.println( "Name of the Employe:" +  this.EmployeeName);
        System.out.println("Age:" + this.age);
        System.out.println("Position :" + this.designation);
        System.out.println( "Getting Salary of pkr:" + this.salary);
    }

    public String empName(){
        return this.EmployeeName;
    }
    public void setEmpName(String setName){
        this.EmployeeName = setName;
    }





    public int empAge(){
        return this.age;
    }

    public void setAge(int umar){
        this.age = umar;
    }





    public String empDesig(){
        return this.designation;
    }

    public void setDesignation(String posi){
        this.designation = posi;
    }




    public int empSalary(){
        return this.salary;
    }

    public void setSalary(int tankhwa){
        this.salary = tankhwa;
    }
}
