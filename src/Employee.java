public class Employee {
    int dailyAttendance;
    int workPerDay = 8;
    int partTime = 8;
    int hourlyWage = 20;
    int monthlySalary;
    int dailySalary;
    int workingDay = 20;

    int totalHours = 0;
    int totalDays = 0;

    public void calculateAttendance(){
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

    public void dailyWage(){

        while(totalDays < 20 && totalHours < 100){
            totalDays++;
            System.out.println("\nDay: " + totalDays);
            calculateAttendance();
            switch(dailyAttendance){
                case 1:{
                    dailySalary = hourlyWage * workPerDay;
                    System.out.println("Daily salary: " + dailySalary);

                    totalHours += workPerDay;
                    monthlySalary += dailySalary;
                    break;
                }
                case 2:{
                    dailySalary = partTime * hourlyWage;
                    System.out.println("Daily salary: " + dailySalary);

                    totalHours += partTime;
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

            System.out.println("Total hours so far: " + totalHours);
        }
        System.out.println("Total Days Worked: " + totalDays);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Final Monthly Salary: " + monthlySalary);
    }
}
