package thang1125; 

import java.util.ArrayList;
import java.util.List;

// 1. TÍNH TRỪU TƯỢNG (ABSTRACTION)
abstract class Employee {
    private String id;
    private String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
       
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void printInfo() {
        System.out.println("ID: " + id + " | Ten: " + name);
    }
}

// 2. TÍNH KẾ THỪA (INHERITANCE)
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    // 3. TÍNH ĐA HÌNH (POLYMORPHISM) - Overriding
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0); 
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override //chi de danh dau cho de nho, khong co van the hien override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    
    // 4. TÍNH ĐA HÌNH (POLYMORPHISM) - Overloading
    public void addHours(int hours) {
        this.hoursWorked += hours; 
    }
    
    public void addHours(int hours, double specialRate) {
        this.hoursWorked += hours;
        System.out.println("Da them gio lam dac biet cho " + getName());
    }
}

public class Thang1125 {
    public static void main(String[] args) {
        List<Employee> staffList = new ArrayList<>();

        FullTimeEmployee boss = new FullTimeEmployee("NV01", "Nguyen Van Sep", 2000, 500);
        PartTimeEmployee staff = new PartTimeEmployee("NV02", "Tran Van Sinh Vien", 40, 15);

        staffList.add(boss);
        staffList.add(staff);

        System.out.println("--- BANG LUONG CONG TY (Project Thang1125) ---");

        for (Employee e : staffList) {
            e.printInfo();
            System.out.println("-> Luong thuc nhan: " + e.calculateSalary() + " USD");
            System.out.println("--------------------------");
        }
        
        System.out.println("--- DEMO OVERLOADING ---");
        staff.addHours(5);
        System.out.println("Luong moi cua " + staff.getName() + ": " + staff.calculateSalary() + " USD");
    }
}