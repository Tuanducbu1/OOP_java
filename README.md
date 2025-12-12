Giới Thiệu tổng OOP Java
File code java sẽ minh họa cách áp dụng 4 tính chất của OOP vào vào thực tế:
*Tính Trừu tượng (Abstraction)
Abstract class Employee
Định nghĩa khung sườn chung cho mọi nhân viên gồm id, name, baseSalary;
public abstract double calculateSalary();  Các lớp con phải tự định nghĩa 
logic tính lương riêng của mình, vì cách tính lương của nhân viên Full-time khác  Part-time.
*Tính Kế thừa (Inheritance)
Cha: Employee
Con: FullTimeEmployee, PartTimeEmployee
*Tính Đóng gói (Encapsulation)
 private String id;
  private String name;
  private double baseSalary;
  id, name, baseSalary được khai báo private để ngăn chặn việc truy cập từ người ngoài.
*Tính Đa hình (Polymorphism)
Overloading: trong lớp PartTimeEmployee, định nghĩa hai lần phương thức addhours:
addHours(int hours): Thêm giờ làm bình thường
addHours(int hours, double specialRate): Thêm giờ làm với hệ số đặc biệt.

Cách chạy project:
clone repository
git clone [https://github.com/Tuanducbu1/OOP_java.git](https://github.com/Tuanducbu1/OOP_java.git)
