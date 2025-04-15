/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.project;

class pNode{
patient patient;
pNode Next,prev;
  
public pNode(){
}

    public pNode(patient patient) {
        this.patient = patient;
        Next=null;
        prev=null;
    }

}
public class patientlist {
    pNode Head;
    pNode tail;

    public patientlist() {
        Head=null;
        tail=null;
    }
    public void Insert(patient patient){
    pNode node=new pNode(patient);
    if(Head==null||tail==null){
        Head=node;
        tail=node;
    
    }
    else{
//    Head.Next=node;
//    node.prev=Head;
//    Head=node;
// insert at end
     tail.Next=node;
       node.prev=tail;
       tail=node;

    }
    }
    public patient SearchById(String ID){
    pNode temp=Head;
    while(temp!=null){
    if(temp.patient.getiD().equals(ID)){
    return temp.patient;
    }
    temp=temp.Next;
    }
    return null;
    
}
     public patient SearchBycontact(String contact){
    pNode temp=Head;
    while(temp!=null){
    if(temp.patient.getContant().equals(contact)){
    return temp.patient;
    }
    temp=temp.Next;
    }
    return null;
    
}
      public void Allpatientinfo(){
    pNode temp=Head;
    while(temp!=null){
        System.out.println("patient Name:"+temp.patient.getName()+"ID:"+temp.patient.getiD());
   temp=temp.Next;
    }
   
}}