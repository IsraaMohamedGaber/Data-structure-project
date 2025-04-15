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
public class quene {
     QNode Front,Rear;
     public quene(){
         Front=Rear=null;
     }
     public boolean ENqueue(patient p){
         boolean retval=false;
         QNode node= new QNode (p);
         if (node!=null){
             if(Rear==null){
                 Rear =Front=node;
             }
             else{
                 Rear.Next=node;
                 Rear=node;
             }
             retval=true;
         } return retval;
        
     }
     public QNode DEqueue (){
         QNode retval;
         retval=Front;
         if (Front!=null){
             Front = Front.Next;
             if (Front==null){
                 Rear = null;
                
             }
         }
         return retval;
     }
}
