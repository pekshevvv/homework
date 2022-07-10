import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
//        List<Employee> targetYearEmployee =
        Employee maxSalaryEmployee = staff.stream()
                .filter(employee -> employee.getWorkStart().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear() == year)
                .max(Comparator.comparing(Employee::getSalary)).get();
//                .collect(Collectors.toList());
              // .max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);


         // staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        //TODO Метод должен вернуть сотрудника с максимальной зарплатой среди тех,
        // кто пришёл в году, указанном в переменной year
        return maxSalaryEmployee;
    }
}