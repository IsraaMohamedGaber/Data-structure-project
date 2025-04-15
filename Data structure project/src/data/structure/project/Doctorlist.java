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
class dNode{
Doctor doctor;
dNode Next,prev;
  
public dNode(){
}

    public dNode( Doctor doctor) {
        this.doctor = doctor;
        Next=null;
        prev=null;
    }

}
public class Doctorlist {
    dNode Head;
    dNode tail;

    public Doctorlist() {
        Head=null;
        tail=null;
    }
     public void Insert(Doctor doctor){
    dNode node=new dNode(doctor); //object
    if(Head==null||tail==null){//empty list
        Head=tail=node;
        //tail=node;
    
    }
    else{ //there is alist insert at first
       /* node.prev=Head;
        Head.Next=node;
        Head=node;*/
       
       //inser at end
      tail.Next=node;
       node.prev=tail;
       tail=node;

    }

    
}
      public Doctor SearchById(String ID){
    dNode temp=Head;
    while(temp!=null){
    if(temp.doctor.getId().equals(ID)){
    return temp.doctor;
    }
    temp=temp.Next;
    }
    return null;
    

      }
       public Doctor SearchBycontact(String contact){
    dNode temp=Head;
    while(temp!=null){
    if(temp.doctor.getContact().equals(contact)){
    return temp.doctor;
    }
    temp=temp.Next;
    }
    return null;
    
}
       public void Alldoctorinfo(){
    dNode temp=Head;
    while(temp!=null){
        System.out.println("Doctor Id:"+temp.doctor.getId()+"\tspeciallity:"+temp.doctor.getSpecially());
   temp=temp.Next;
    }
   
    

      }
      
}
