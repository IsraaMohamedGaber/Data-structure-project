/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.project;

/**
 *
 * @author HP
 */
public class Nurses {
       private String Name;
    private int Id,contacts,salary;

    public Nurses() {
    }

    public Nurses(String Name, int Id, int contacts, int salary) {
        this.Name = Name;
        this.Id = Id;
        this.contacts = contacts;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getContacts() {
        return contacts;
    }

    public void setContacts(int contacts) {
        this.contacts = contacts;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nurses{" + "Name=" + Name + ", Id=" + Id + ", contacts=" + contacts + ", salary=" + salary + '}';
    }
}
