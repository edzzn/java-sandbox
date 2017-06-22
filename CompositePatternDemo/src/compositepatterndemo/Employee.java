package compositepatterndemo;

import java.util.*;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
    
    //constructor
    public Employee(String name, String dept, int sal){
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }
    
    public void remove(Employee e){
        subordinates.remove(e);
    }
        
    public String toString(){
        return ("Employee:[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the subordinates
     */
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    /**
     * @param subordinates the subordinates to set
     */
    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
    
}
