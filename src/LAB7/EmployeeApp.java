package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

        //use default constructor
        Employee emp1 =new Employee();
        // assign constructor
        Employee emp2 = new Employee("Mukda",22,"Student",120000);

        //call displayData
        emp1.displayData();
        emp2.displayData();

        //assign data to emp1
        emp1.setName("Mukda");
        emp1.setAge(22);
        emp1.setPosition("Student");
        emp1.setSalary(120000);

        emp1.displayData();
        System.out.println("Emp name:"+emp1.getName());



    }//main
}//class
