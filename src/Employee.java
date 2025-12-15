public class Employee {
    int dailyAttendance;
    int workPerDay = 8;
    int partTime = 4;
    int dailySalary;



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

    public void computeWage(Company company){
        int totalDays=0;
        int totalHours = 0;
        int monthlySalary = 0;
        System.out.println("\n"+company.getCompanyName());

        while(totalDays<company.getWorkingDays() && totalHours < company.getWorkingHoursPerMonth()){
            totalDays++;
            System.out.println("\nDay: " + totalDays);
            calculateAttendance();

            switch(dailyAttendance){
                case 1:{
                    dailySalary = company.getWagePerHour() * partTime;
                    totalHours += partTime;
                    monthlySalary += dailySalary;
                    break;
                }
                case 2:{
                    dailySalary = workPerDay * company.getWagePerHour();
                    totalHours += workPerDay;
                    monthlySalary += dailySalary;
                    break;
                }
                default:
                    System.out.println("No pay");
            }
            if(totalHours > company.getWorkingHoursPerMonth()){
                totalHours = company.getWorkingHoursPerMonth();
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
