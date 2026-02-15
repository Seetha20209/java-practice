public class SalaryCalculation {
    public static void main(String[] args) {
        //int days = 365;
        int SalaryPerDay = 500;
        int TotalSalary = 0;

         for(int i = 1; i <= 30; i++){
             TotalSalary += SalaryPerDay;
         }
        System.out.println(TotalSalary);
    }
}
