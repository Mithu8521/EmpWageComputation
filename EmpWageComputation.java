public class EmpWageComputation {
    public static void main(String[] args) {
	int Full_Time = 1;
	int Part_Time = 2;
	int rate_per_hour = 20;
        int emp_wage = 0;
        int emp_hrs = 0;
        double empCheck = Math.floor(Math.random() *10 %3);
        if (empCheck==Full_Time)
            emp_hrs=8;
        else if (empCheck==Part_Time)
            emp_hrs=4;
        else
            emp_hrs=0;
        emp_wage=rate_per_hour*emp_hrs;
        System.out.println("Total Wage of Employee" +emp_wage);
    }
}
