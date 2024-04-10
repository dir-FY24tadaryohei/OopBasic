package company;

public class ParttimeWorker implements Workable{

    protected final String name;
    private final Department department;

    public ParttimeWorker(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    
    @Override
    public void work() {
        System.out.println("アルバイトとして働きます。名前：" + name + slogan);
    }
}
