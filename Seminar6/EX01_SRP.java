import java.util.Date;

// Single Responsibility Principle
class EX01_SRP {

    // Класс сотрудника
    class Employee {
        private String name;
        private Date dob;
        private SalaryCalculator salaryCalculator;
    
        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.salaryCalculator = new SalaryCalculator(baseSalary);
        }
    
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
    
        public int calculateNetSalary() {
            return salaryCalculator.calculateNetSalary();
        }
    
        // Класс расчета заработной платы
        private static class SalaryCalculator {
            private int baseSalary;
    
            public SalaryCalculator(int baseSalary) {
                this.baseSalary = baseSalary;
            }
    
            public int calculateNetSalary() {
                int tax = (int) (baseSalary * 0.25); // рассчет налога по-другому
                return baseSalary - tax;
            }
        }
    }
}
