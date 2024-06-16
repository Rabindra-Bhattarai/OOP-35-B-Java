package Week9;

public class inheritanceTask {
    public static void main(String[] args) {
        labradon dr = new labradon();
        dr.name="sarjak";
        dr.breed="xyz";
    //    dr.eggs="boil";
        dr.country="Thailand";
      //  dr.dogClass="German Sephard";
        //dr.origin="Nepal";
        //dr.scale="yoman";
        //dr.labradon="abc";

        
    }
    
}
class Animal{
    String name;
    void speaks(){
        System.out.println("Animal"+ name);
    }
}

class Mammal extends Animal{
    String breed;
    void fur(){
        System.out.println(name + breed);
    }
}

class Raptile extends Animal{
    String eggs;
    void sheds(){
        System.out.println(name + eggs);
    }
}

class dogClass extends Mammal{
    String country;
    void barks(){
        System.out.println(country);
    }
}

class cat extends Mammal{
    String origin;
    void meows(){
        System.out.println(origin);
    }
}

class amphibian extends Raptile{
    String scale;
    void swims(){
        System.out.println(name + eggs + scale);
    }
}
class labradon extends dogClass{
    String color;
    void play(){
        System.out.println(color);
    }
}
