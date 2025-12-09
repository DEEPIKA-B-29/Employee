public class Employee {
    static int dailyAttendance;
    static int workPerDay = 8;
    static int partTime = 4;
    static int hourlyWage = 20;
    static int monthlySalary;
    static int dailySalary;

    static int totalHours = 0;
    static int totalDays = 0;

    public static void calculateAttendance(){
        if(((Math.random()*100)%3)==0){
            dailyAttendance = 0;
            System.out.println("Absent");
        } else if(((Math.random()*100)%3)==1){
            dailyAttendance = 1;
            System.out.println("Part time");
        } else {
            dailyAttendance = 2;
            System.out.println("Present");
        }
    }

    public static void computeWage(){

        while(totalDays < 20 && totalHours < 100){
            totalDays++;
            System.out.println("\nDay: " + totalDays);
            calculateAttendance();
            switch(dailyAttendance){
                case 1:{
                    dailySalary = hourlyWage * workPerDay;
                    totalHours += partTime;
                    monthlySalary += dailySalary;
                    break;
                }
                case 2:{
                    dailySalary = partTime * hourlyWage;
                    totalHours += workPerDay;
                    monthlySalary += dailySalary;
                    break;
                }
                default:
                    System.out.println("No pay");
            }
            if(totalHours > 100){
                totalHours = 100;
                break;
            }

            System.out.println("Daily salary: " + dailySalary);
            System.out.println("Total hours so far: " + totalHours);
        }
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Final Monthly Salary: " + monthlySalary);
    }
}
