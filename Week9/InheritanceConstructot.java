package Week9;

public class InheritanceConstructot {
    public static void main(String[] args) {
        Polo p1 = new Polo();
        p1.differentColor("Yellow");
        Polo p2 = new Polo("Red");
        Polo P3 = new Polo(10);
        //call constructor with overload param
    }  
}

class shirt{
    String color ="Black"; //,this.color
    shirt(){
        System.out.println(" making Shirt ");
    }
    shirt(String color){
        this.color=color;
    }
}
class Polo extends shirt{
    String color = "White";
    String texture;
    Polo(){
        //by defult the parent of constructor is called
        //meaing super() or shirt() on first line of execution
        super("White");
        System.out.println(" making Polo ");

    }
    //constructor overloding
    //same name fucntion/constructor with different logic/Paraqmeter
    Polo(String color){
        this.color=color;
        System.out.println("Constructor with one string");
    }
    Polo (String color, String Texture){
        this.color=color;
        this.texture=Texture;
        System.out.println("Constructor with two sting");
        
    }
    Polo (int num){
        System.out.println(num);
        System.out.println("Constructor with one int");
    }

    //Note that constructor overload takes the difference in data type
    //not the variable polo (String c) cannot be made
    void differentColor(String color){
        System.out.println("Param color" + color);
        System.out.println("Class color" + this.color);
        System.out.println("Parent color"+ super.color);

    }


}
