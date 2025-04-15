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
public class MedicalAppliances {
    private String Id;
    private String name;
    private String utilization;

    public MedicalAppliances() {
    }

    public MedicalAppliances(String Id, String name, String utilization) {
        this.Id = Id;
        this.name = name;
        this.utilization = utilization;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUtilization() {
        return utilization;
    }

    public void setUtilization(String utilization) {
        this.utilization = utilization;
    }

    @Override
    public String toString() {
        return "MedicalAppliances{" + "Id=" + Id + ", name=" + name + ", utilization=" + utilization + '}';
    }
    
}
