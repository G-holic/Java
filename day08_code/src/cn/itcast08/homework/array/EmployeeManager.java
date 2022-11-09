package cn.itcast08.homework.array;

public class EmployeeManager {
    Employee[] allEmployees = new Employee[5];
    int total;

     boolean addEmployee(Employee emp) {
        if (total >= allEmployees.length) {
            System.out.println("数组已满");
            return false;
        } else {
            allEmployees[total++] = emp;
            return true;
        }
    }

    Employee[] getEmployees() {
        Employee[] results = new Employee[total];
        for (int i = 0; i < results.length; i++) {
            results[i] = allEmployees[i];
        }
        return results;
    }
}
