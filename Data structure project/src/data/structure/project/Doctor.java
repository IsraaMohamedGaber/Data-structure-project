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
public class Doctor {
    private String id ;
    private String name;
    private String contact;
    private String specially;
    private int fees;

    public Doctor() {
    }

    public Doctor(String id, String name, String contact, String specially, int fees) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.specially = specially;
        this.fees = fees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSpecially() {
        return specially;
    }

    public void setSpecially(String specially) {
        this.specially = specially;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", contact=" + contact + ", specially=" + specially + ", fees=" + fees + '}';
    }
    
        
}
