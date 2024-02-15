package mainclass.exercises.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeForEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Charlie", "IT"));
        employees.add(new Employee("Amy", "Finance"));
        employees.add(new Employee("Bob", "HR"));
        employees.add(new Employee("David", "IT"));
        employees.add(new Employee("Frank", "Finance"));

        Map<String, String> firstEmployeeWithAByDepartment = new HashMap<>();
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)).forEach((department, employeeList) -> {
                    String employeeName = employeeList.stream()
                            .map(Employee::getName)
                            .filter(name -> name.startsWith("A"))
                            .findFirst()
                            .orElse("No employee found");
                    firstEmployeeWithAByDepartment.put(department, employeeName);
                });
        firstEmployeeWithAByDepartment.forEach((department, employee) ->
                System.out.println(department + ": " + employee));
    }
}
