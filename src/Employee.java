public class Employee {
    int dailyAttendance;
    int workPerDay=8;
    //int halfDay=4;
    int hourlyPage=20;
    int dailySalary;
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
        dailySalary=hourlyPage*workPerDay;
        if(dailyAttendance==1){
            System.out.println(dailySalary);
        }
        else if(dailyAttendance==2){
            System.out.println(dailySalary);
        }else{
            System.out.println("No pay");
        }
    }
}
