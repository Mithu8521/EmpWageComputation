public class EmpWageComputation {
    public static final int Full_Time = 1;
    public static final int Part_Time = 2;
    public static final int rate_per_hour = 20;

    public static void main(String[] args) {
        int emp_wage = 0;
        int emp_hrs = 0;
        int empCheck = (int)Math.floor(Math.random() *10 %3);
        switch (empCheck){
                case Full_Time:
                    emp_hrs=8;
                    break;
                case Part_Time:
                    emp_hrs=4;
                    break;
                default:
                    emp_hrs=0;
        }
          emp_wage=rate_per_hour*emp_hrs;
          System.out.println("Total Wage of Employee" +emp_wage);
    }
}
