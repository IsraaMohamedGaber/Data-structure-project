/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.project;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DataStructureProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] p =new int[3];
        for(int i=0;i<p.length;i++){
        System.out.println(
        "TO show information of inserted patient press 1\n"+
        "To search by ID for patient Name press 2\n"+
        "TO show information of inserted Doctor press 3\n"+
         "To search by ID for Doctor Name press 4\n"+
         "TO see list of patient press 5\n"
         +"To see information of nurs press 6\n"+
       //  "TO see Nurs Id in pre order press 7\n" +
         "TO search about medical using Id press 7\n"+
        "TO see cleaner information storage inStack press 8 \n"+
             "TO see pat information storage quene press 9 \n"     
        );
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        switch(n){
        case 1:
    patient p1=new patient("22", "ahmed", "02158578");
    patient p2=new patient("2232", "mohamed", "0248158578");
    patient p3=new patient("2mm2", "aziz", "0256158578");
    patient p4=new patient("5879", "sami", "9654268");

    
    patientlist pat =new patientlist();
    pat.Insert(p1);
    pat.Insert(p2);
    pat.Insert(p3);
    pat.Insert(p4);
    pat.Allpatientinfo();
    break;
    case 2:
        System.out.println("Enter ID");
    patient p11=new patient("22", "ahmed", "02158578");
    patient p22=new patient("2232", "mohamed", "0248158578");
    patient p33=new patient("2mm2", "aziz", "0256158578");
    patient p44=new patient("5879", "sami", "9654268");

    
    patientlist patt =new patientlist();
    patt.Insert(p11);
    patt.Insert(p22);
    patt.Insert(p33);
    patt.Insert(p44);
    String s=sc.next();
        System.out.println(patt.SearchById(s).getName());
     break; 
    case 3:
    Doctor d    =new Doctor("500a", "az", "05561502", "sugare", 7000);
    Doctor d1    =new Doctor("sa500a", "aziz", "05561502", "body", 8000);
     Doctor d2   =new Doctor("600a", "salm", "07775000", "diet", 5000);
     Doctor d3    =new Doctor("70000a", "malek", "080004578", "heart", 9000);
Doctorlist d11=new  Doctorlist();
d11.Insert(d);
d11.Insert(d1);
d11.Insert(d2);
d11.Insert(d3);

d11.Alldoctorinfo();
        break; 
        case 4:
          System.out.println("Enter ID");
    Doctor d13    =new Doctor("500a", "az", "05561502", "sugare", 7000);               
    Doctor d12    =new Doctor("sa500a", "aziz", "05561502", "body", 8000);
     Doctor d22   =new Doctor("600a", "salm", "07775000", "diet", 5000);
     Doctor d33    =new Doctor("70000a", "malek", "080004578", "heart", 9000);
Doctorlist d111=new  Doctorlist();
d111.Insert(d13);
d111.Insert(d12);
d111.Insert(d22);
d111.Insert(d33);
 String r=sc.next();
        System.out.println(d111.SearchById(r).getName());
            break;
    case 5: patient p12=new patient("22", "ahmed", "02158578");
    patient p222=new patient("2232", "mohamed", "0248158578");
    /*patient p33=new patient("2mm2", "aziz", "0256158578");
    patient p44=new patient("5879", "sami", "9654268");*/
    checkup c=new checkup(p12, "5 dec", "2 week");
     checkupList cl=new checkupList();
    checkup c1=new checkup(p222, "28 dec", "7 week");
checkupList c2=new checkupList();
                //Add node to list
                cl.addNode(c);
                cl.printNodes();
                c2.addNode(c1);
                c2.printNodes();
                break;
                case 6:
                    Nurses n1=new Nurses("salma", 55, 5678, 5000);
                    Nurses n2=new Nurses("salma", 40, 5678, 5000);
                    Nurses n3=new Nurses("salma", 100, 5678, 5000);
System.out.println(n1.toString());
System.out.println(n2.toString());
System.out.println(n3.toString());

                    break;
//                case 7:
//                     inorderBinarysearchTreeNursing tree = new inorderBinarysearchTreeNursing();
// 
//        /*  create following BST
//              50
//           /     \
//          30      70
//         /  \    /  \
//       20   40  60   80 */
//        tree.insert(50);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
// 
//        // print inorder traversal of the BST
//        tree.inorder();
//                    break;
                    case 7:
                         System.out.println("Enter ID");
    MedicalAppliances m1    =new MedicalAppliances("555", "Amifostine.", "05561502");               
    MedicalAppliances m2    =new MedicalAppliances("7895", "panadol", "8879");               
    MedicalAppliances m3    =new MedicalAppliances("29598", "adol", "1dsd498");               

MedicalAppliancesList mL=new MedicalAppliancesList();
mL.Insert(m1);
mL.Insert(m2);
mL.Insert(m3);

 String h=sc.next();
        System.out.println(mL.SearchById(h).getName());
                        break;
    case 8:
        stackLinkedList ss=new stackLinkedList();
        cleaner cc1=new cleaner(200, "essam");
        cleaner cc2=new cleaner(300, "sami");
        cleaner cc3=new cleaner(600, "salwa");
        cleaner cc4=new cleaner(93, "saed");
        cleaner cc5=new cleaner(307, "walied");
        cleaner cc6=new cleaner(9090, "wahed");
        cleaner cc7=new cleaner(303, "mohamed");
//ss.pushl(cc1);
System.out.println(ss.pushl(cc1)+cc1.toString());
System.out.println(ss.pushl(cc2)+cc2.toString());
System.out.println(ss.pushl(cc3)+cc3.toString());
System.out.println(ss.pushl(cc4)+cc4.toString());
System.out.println(ss.pushl(cc5)+cc5.toString());
System.out.println(ss.pushl(cc6)+cc6.toString());
System.out.println(ss.pushl(cc7)+cc7.toString());


     break;
     case 9:
    patient p112=new patient("22", "ahmed", "02158578");
     patient p1123=new patient("2244", "hazem", "15848");
      patient p1124=new patient("2289", "mohamed", "0212341");
       patient p1125=new patient("9822", "Ali", "02345");
        patient p1126=new patient("58422", "yasieme", "4587");
    quene q1 =new quene();
    q1.ENqueue(p112);
        q1.ENqueue(p1123);
    q1.ENqueue(p1124);
    q1.ENqueue(p1125);
    q1.ENqueue(p1126);

         System.out.println(q1.ENqueue(p112));
         System.out.println(q1.ENqueue(p1123));
         System.out.println(q1.ENqueue(p1124));
         System.out.println(q1.ENqueue(p1126));

         break;
     default:
         System.out.println("not found");
        }
        }
          
   /* patient p1=new patient("22", "ahmed", "02158578");
    patient p2=new patient("2232", "mohamed", "0248158578");
    patient p3=new patient("2mm2", "aziz", "0256158578");
    patient p4=new patient("5879", "sami", "9654268");

    
    patientlist pat =new patientlist();
    pat.Insert(p1);
    pat.Insert(p2);
    pat.Insert(p3);
    pat.Insert(p4);

       System.out.println(pat.SearchById("22").getName());
        System.out.println(pat.SearchById("2mm2").getContant());
        System.out.println(pat.SearchBycontact("02158578").getiD());
pat.Allpatientinfo();*/
  /*   Doctor d    =new Doctor("500a", "az", "05561502", "sugare", 7000);
          Doctor d1    =new Doctor("sa500a", "aziz", "05561502", "body", 8000);
     Doctor d2   =new Doctor("600a", "salm", "07775000", "diet", 5000);
     Doctor d3    =new Doctor("70000a", "malek", "080004578", "heart", 9000);
Doctorlist d11=new  Doctorlist();
d11.Insert(d);
d11.Insert(d1);
d11.Insert(d2);
d11.Insert(d3);

d11.Alldoctorinfo();
Scanner sc =new Scanner(System.in);
String m=sc.next();
        System.out.println(d11.SearchById(m).getName()+""+d11.SearchById("500a").getFees());
    */}  
}
