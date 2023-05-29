public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Иванов Сидор Александрович", 1, 27000);
        empl[1] = new Employee("Сидоров Александр Иванович", 1, 35000);
        empl[2] = new Employee("Александров Иван Сидорович", 2, 40000);
        empl[3] = new Employee("Назарова Ульяна Александровна", 2, 25000);
        empl[4] = new Employee("Зотова Вероника Давидовна", 3, 13000);
        empl[5] = new Employee("Федоров Даниил Артёмович", 3, 44000);
        empl[6] = new Employee("Крылов Ярослав Львович", 4, 50000);
        empl[7] = new Employee("Громова Евгения Матвеевна", 4, 75000);
        empl[8] = new Employee("Андреев Михаил Борисович", 5, 110000);
        empl[9] = new Employee("Мельникова Василиса Кирилловна", 5, 15000);
        System.out.println();

        toStrin(empl);
        System.out.println();
        getMinSalary(empl);
        getMaxSalary(empl);
        System.out.println();
        getAvgSalary(empl);
        System.out.println();
        getFIO(empl);
    }
    public static int getSumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee a : employees) {
             sum += a.getSalary();
       }
        System.out.println("Cумма затрат на зарплаты в месяц: " + sum + " руб");
        return sum;
    }
    public static void getAvgSalary(Employee[] employees) {
        System.out.println("Cреднее значение зарплат: " + getSumSalary(employees)/employees.length + " руб");
    }
    public static void getMaxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (Employee e : employees) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника: " +  max +" руб");
    }
    public static void toStrin(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
}
    public static void getMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (Employee e : employees) {
            if (e.getSalary() < min) {
                min = e.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + min +" руб");
    }
    public static void getFIO(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFIO());
        }
    }
}