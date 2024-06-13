public class SoftwareHouse {
    

    public static void main(String[] args) {
        

        Employee developer = new Employee("Riyad", 19, "React Developer", 180000 );
        Employee softEng = new Employee("Arham", 19, "Senior Software Eng.", 220000 );
        Employee tester = new Employee(null, 0, null, 0);
        // Employee SQA = new Employee();
         developer.employeeInfo() ;
        //  tester.employeeInfo();

      
        // System.out.println(softEng.empDesig());
        
        tester.setEmpName("FahadAshraf");
        tester.setDesignation("junior web Developer");
        tester.setAge(20);
        tester.setSalary(90000);



        tester.employeeInfo();


        // SQA.employeeInfo();
    }

}
