public class Main {
    public static void main(String[] args) {

        System.out.println();

        Employee[] employees = new Employee[10];
        Employee ivan = new Employee("Абрамов Иван Александрович", 63_000, 4);
        employees[0] = ivan;
        Employee viktor = new Employee("Комаров Виктор Игоревич", 32_000, 2);
        employees[1] = viktor;
        Employee ruslan = new Employee("Белый Руслан Викторович", 84_000, 1);
        employees[2] = ruslan;
        Employee yuliya = new Employee("Ахмедова Юлия Игоревна", 71_000, 1);
        employees[3] = yuliya;
        Employee stanislav = new Employee("Старовойтов Станислав Сергеевич", 69_000, 3);
        employees[4] = stanislav;
        Employee elena = new Employee("Новикова Елена Васильевна", 56_000, 4);
        employees[5] = elena;
        Employee alexey = new Employee("Щербаков Алексей Владимироович", 33_000, 2);
        employees[6] = alexey;
        Employee valentin = new Employee("Сидоров Валентин Александрович", 43_000, 5);
        employees[7] = valentin;
        Employee evgeny = new Employee("Чебатков Евгений Геннадьевич", 74_000, 1);
        employees[8] = evgeny;
        Employee roman = new Employee("Косицын Роман Дмитриевич", 67_000, 3);
        employees[9] = roman;

// Вывод всех данных работников
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
// Расчет общей суммы ЗП и средней ЗП
        int sumSalary = 0;
        int mediumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalary += employees[i].getSalary();
        }
        mediumSalary = sumSalary / employees.length;

// Расчет минимальной и максимальной ЗП
        int maxSalary = employees[0].getSalary();
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }

        System.out.println();
        System.out.println("Общая сумма затрат на ЗП = " + sumSalary);
        System.out.println("Средняя ЗП всех работников = " + mediumSalary);
        System.out.println("Минимальная ЗП = " + minSalary);
        System.out.println("Максимальная ЗП = " + maxSalary);
        System.out.println();

//    Вывод ФИО сотрудников
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + ". "+ employees[i].getFullName());
        }
    }


}