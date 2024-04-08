package company;

public class ObjectSample {

    public static void main(String[] args) {
        
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);

        
        employee.report();
        employee.report(2);
        employee.joinMeeting();
        
        
        System.out.println("");

        
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Employee("田中", devDepartment, "一般社員", 88);

        
        engineer.report();
        engineer.joinMeeting();
    }

}