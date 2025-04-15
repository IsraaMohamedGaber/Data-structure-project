/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.project;

class MNode{
MedicalAppliances med;
MNode Next,prev;
  
public MNode(){
}

    public MNode( MedicalAppliances med) {
        this.med = med;
        Next=null;
        prev=null;
    }

}
public class MedicalAppliancesList {
    MNode Head;
    MNode tail;

    public MedicalAppliancesList() {
        Head=null;
        tail=null;
    }
     public void Insert(MedicalAppliances med){
    MNode node=new MNode(med); //object
    if(Head==null||tail==null){//empty list
        Head=tail=node;
        //tail=node;
    
    }
    else{ //there is alist
   /* Head.Next=node;
    node.prev=Head;
    Head=node;
    */
    //inser at end
      tail.Next=node;
       node.prev=tail;
       tail=node;

    }
     }
     
    public MedicalAppliances SearchById(String ID){
    MNode temp=Head;
    while(temp!=null){
    if(temp.med.getId().equals(ID)){
    return temp.med;
    }
    temp=temp.Next;
    }
    return null;
    

      }
}
