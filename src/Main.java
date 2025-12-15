public class Main{
    public static void main(String[] args){

        Company x1=new Company("X1",30,20,6100);
        Company x2=new Company("X2",35,25,8000);
        Employee e = new Employee();
        e.computeWage(x1);
        e.computeWage(x2);
    }
}