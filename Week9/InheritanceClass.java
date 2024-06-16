// package Week9;

// public class InheritanceClass {
//     public static void main(String[] args) {
//      ChildClass cc = new ChildClass();
//      cc.firstname = "XYZ";
//      cc.lastname="ANC";
//      cc.expenses = 100.11;
//     // cc.salary=10000;//
//      cc.info();
//      cc.detail();   
//     }
    
// }
// class parentClass{
//     public String lastname;
//     private int salary;
//     protected double expenses;
//     void info(){
//         System.out.println("Parent function" + lastname);

//     }
// }
// //to use inheritance use the keyword "extends"
// //single level inheritance, one parent/super - one child/sub

// class ChildClass extends parentClass{
//     String firstname;
//     void detail(){
//         System.out.println(firstname + "" + lastname);
//     }
// }


// //multilevel inheritance, nested class, child class has another child class
// class GrandChildClass extends ChildClass{
//     String middlename;
//     void description(){
//         System.out.println(firstname + ""+ middlename+ ""+lastname);
//     }
// }

// //Tree/herirarical inheritance 
// class BrotherCLass extends parentClass{
//     String address;
//     void living(){
//         System.out.println(lastname +""+address);
//     }
// }


