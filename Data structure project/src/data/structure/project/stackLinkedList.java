/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.project;
class stacknode{
//public int Data;
    public cleaner css;
public stacknode prev;


public stacknode(){}
public stacknode(cleaner d){
css=d;
prev =null;
}
}
public class stackLinkedList {
    public static stacknode tail=null;
    public static boolean pushl(cleaner c){
    boolean retval=false;
    stacknode node=new stacknode(c);
    if(node!=null){
        node.prev=tail;
        tail=node;
        retval =true;
      //  System.out.println("elemet push");   
    }
    return retval;
    }
    public  static boolean popl(){
    stacknode retval;
    retval=tail;
    if(tail!=null){
    tail=tail.prev;
    }
            System.out.println("pop"+ retval);

    return true;
    }
}
