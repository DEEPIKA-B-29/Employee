public class Employee {
    int dailyAttendance;
    int workPerDay=8;
    //int halfDay=4;
    int partTime=8;
    int hourlyWage=20;
    int monthlySalary;
    int dailySalary;
    int workingDay=20;
    public void calculateAttendance(){
        if(((Math.random()*100)%3)==0){
            dailyAttendance=0;
            System.out.println("Absent");
        }else if(((Math.random()*100)%3)==1){
            dailyAttendance=1;
            System.out.println("Part time");
        }
        else{
            dailyAttendance=2;
            System.out.println("present");
        }
    }
    public void dailyWage(){
        switch(dailyAttendance){
            case 1:{
                dailySalary=hourlyWage*workPerDay;
                System.out.println("Daily salary: "+dailySalary);
                monthlySalary=dailySalary*workingDay;
                System.out.println("Monthly salary: "+monthlySalary);
                break;
            }
            case 2:{
                dailySalary=partTime*hourlyWage;
                System.out.println("Daily salary: "+dailySalary);
                monthlySalary=dailySalary*workingDay;
                System.out.println("Monthly salary: "+monthlySalary);
                break;
            }
            default:System.out.println("No pay");
        }
    }
}