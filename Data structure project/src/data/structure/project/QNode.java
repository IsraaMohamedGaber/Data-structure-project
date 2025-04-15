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
public class QNode {
  
   
    public patient p;
    public QNode Next;
    public QNode (patient d){
        p = d;
        Next= null;
    }
}
