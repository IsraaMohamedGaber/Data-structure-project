/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.project;

class cNode{
checkup ch;
cNode Next,prev;
  
  


    public cNode( checkup c) {
        this.ch = c;
        Next=null;
        prev=null;
    }

}
public class checkupList {
     cNode Head;
    cNode tail;

    public checkupList() {
        Head=null;
        tail=null;
    }
    public void addNode(checkup c) {  
        //Create a new node  
        cNode newNode = new cNode(c);  
   
        //if list is empty, head and tail points to newNode  
        if(Head == null) {  
            Head = tail = newNode;  
            Head.prev = null;  
            tail.Next = null;  
        }  
       else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.Next = newNode;  
            //newNode->previous set to tail  
            newNode.prev = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
         //   tail.Next = null;  
        }  
    }  
    public void printNodes() {  
        //Node current will point to head  
        cNode current = Head;  
        if(Head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.ch + " ");  
            current = current.Next;  
        }  
    }  
}
