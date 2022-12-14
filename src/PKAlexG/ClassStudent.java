/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PKAlexG;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class ClassStudent {

    //1-Properties
    private String name;
    private String lastName;
    private int[] marks;
    private int age;
    private String DNI;
    public static int count = 0;

    //2-Builders
    public ClassStudent() {
    }

    public ClassStudent(int[] marks) {
    }

    public ClassStudent(String name, String lastName, int age, String DNI) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setDNI(DNI);
        count++;
    }

    public ClassStudent(String name, String lastName, int age, String DNI, int[] marks) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setDNI(DNI);
        setMarks(marks);
        count++;

    }

    //3-Getters & Setters
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
     * @return the marks
     */
    public int[] getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    //4-Helpers methods
    public double getMarksAverage() {
        double average = 0;
        for (int i = 0; i < getMarks().length; i++) {
            average += getMarks()[i];
        }
        return average / getMarks().length;
    }

    public boolean passed() {
        
        boolean passedOk = true;
        if(getMarks() != null){
          for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] < 5) {
                passedOk = false;
            }
        }  
        }
        

        return passedOk;
    }

    public void setMark(int mark, int module) {
        if (this.marks == null) {
            int[] InpMarks = new int[4];
            setMarks(InpMarks);
        }
        this.marks[module] = mark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name:  " + getName() + "\n\r");
        sb.append("Last name:  " + getLastName() + "\n\r");
        sb.append("Age:  " + getAge() + "\n\r");
        sb.append("DNI:  " + getDNI() + "\n\r");
        if (getMarks() != null) {
            sb.append("Marks:  " + Arrays.toString(getMarks()) + "\n\r");
            sb.append("Marks average: " + getMarksAverage() + "\n\r");
            if (passed()) {
                sb.append("PASSED\n\r");
            } else {
                sb.append("SUSPENSE\n\r");
            }
        }

        return sb.toString();

    }

}
