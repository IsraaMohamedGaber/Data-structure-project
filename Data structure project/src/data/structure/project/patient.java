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
public class patient {
    private String iD;
    private String name;
    private String contant;

    public patient() {
    }

    public patient(String iD, String name, String contant) {
        this.iD = iD;
        this.name = name;
        this.contant = contant;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContant() {
        return contant;
    }

    public void setContant(String contant) {
        this.contant = contant;
    }

    @Override
    public String toString() {
        return "patient{" + "iD=" + iD + ", name=" + name + ", contant=" + contant + '}';
    }

   

}
