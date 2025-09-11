package javaconceptoftheday;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployees();

        //Q1 : How many male and female employees are there in the organization?
        Map<String, Long> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(map);

        //Q2 : Print the name of all departments in the organization?
//        employeeList.stream()
//                .map(Employee::getDepartment)
//                .distinct()
//                .forEach(System.out::println);

        //Q3 : What is the average age of male and female employees?
        Map<String, Double> map3 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        //System.out.println(map3);

        //Q4 : Get the details of highest paid employee in the organization?
        Employee e = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get();
        //Employee e = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        //System.out.println(e);

        //Q5 : Get the names of all employees who have joined after 2015?
//        employeeList.stream()
//                .filter(emp -> emp.yearOfJoining > 2015)
//                .map(Employee::getName)
//                .forEach(System.out::println);

        //Q6 : Count the number of employees in each department?
        Map<String, Long> map4 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        //System.out.println(map4);

        //Q7 : What is the average salary of each department?
        Map<String, Double> map5 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(map5);

        //Q8 : Get the details of youngest male employee in the product development department?
        Employee empMin = employeeList.stream()
                .filter(e1->e1.getGender()=="Male" && e1.getDepartment()=="Product Development")
                .min(Comparator.comparingInt(Employee::getAge))
                .get();
        //System.out.println(empMin);

        //Q9 : Who has the most working experience in the organization?
        Employee mostWorkExp = employeeList.stream()
                .min(Comparator.comparingInt(Employee::getYearOfJoining))
                .get(); // preferred
//        Employee mostWorkExp = employeeList.stream()
//                        .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
//                        .findFirst()
//                        .get();
        //System.out.println(mostWorkExp);

        //Q10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> map6 = employeeList.stream()
                .filter(ee->ee.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(map6);

        //Q11 : What is the average salary of male and female employees?
        Map<String, Double> map7 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(map7);

        //Q12 : List down the names of all employees in each department?
        Map<String, List<String>> map8 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        //System.out.println(map8);

        //Q13 : What is the average salary and total salary of the whole organization?
        Double totalSal1 = employeeList.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        Double totalSal2 = employeeList.stream()
                .mapToDouble(Employee::getSalary).sum();
        Double totalSal3 = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(Double::sum).get();
        Double avgSal1 = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        Double avgSal2 = employeeList.stream()
                .mapToDouble(Employee::getSalary).average().getAsDouble();

//        System.out.println(totalSal1);
//        System.out.println(totalSal2);
//        System.out.println(totalSal3);
//        System.out.println(avgSal1);
//        System.out.println(avgSal2);

        //Q14 : Separate the employees who are younger or equal to 25 years from those employees
        // who are older than 25 years.
//        Map<Boolean, List<String>> map9 = employeeList.stream()
//                        .collect(Collectors.partitioningBy(em->em.getAge()<=25,Collectors.mapping(Employee::getName, Collectors.toList())));
        Map<String, List<String>> map9 = employeeList.stream()
                        .collect(Collectors.groupingBy(e3-> e3.getAge()<=25?"Younger or Equals to 25":"Older Than 25", Collectors.mapping(Employee::getName, Collectors.toList())));
        //System.out.println(map9);

        //Q15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?

        Employee oldestEmp = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .get();
//        System.out.println(oldestEmp);
//        System.out.println("name : " + oldestEmp.getName());
//        System.out.println("age : " + oldestEmp.getAge());
//        System.out.println("dept : " + oldestEmp.getDepartment());

        //






    }
}
