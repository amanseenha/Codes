class Employee{
    int Salary;
    String Name;
    public int getSalary() {
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String newName){
        Name=newName;
    }
}
public class ps8q1 {
    public static void main(String[] args) {
    Employee arnab = new Employee();
        arnab.Salary = 4280;
        System.out.println(arnab.getSalary());
        arnab.setName("Rubina");
        System.out.println(arnab.getName());
    }
}
