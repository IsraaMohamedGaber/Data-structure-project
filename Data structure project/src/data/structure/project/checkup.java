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
public class checkup {
   // Doctor doctor;
    patient patient;
    String data;
    String Rcommendetion;

    public checkup(/*Doctor doctor,*/ patient patient, String data, String Rcommendetion) {
       // this.doctor = doctor;
        this.patient = patient;
        this.data = data;
        this.Rcommendetion = Rcommendetion;
    }

    /*public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }*/

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRcommendetion() {
        return Rcommendetion;
    }

    public void setRcommendetion(String Rcommendetion) {
        this.Rcommendetion = Rcommendetion;
    }

    @Override
    public String toString() {
        return "checkup{" + ", patient=" + patient.toString() + ", data=" + data + ", Rcommendetion=" + Rcommendetion + '}'+"\n";
    }
    
}
