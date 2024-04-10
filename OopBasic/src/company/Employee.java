package company;


public abstract class Employee implements Workable {
    
    protected final String name;
    protected final Department department; // protectedに変更
    private final String position;
    private final int employeeId;

   
    public Employee(String name, Department department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }


    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }


    public void report() {
        report(1);
    }


    public abstract void joinMeeting();

   
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
    }
}