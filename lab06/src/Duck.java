public class Duck extends Animal implements Flyable{
    String name ;
    public Duck(String name){
        this.name = name;
    }

    public String toString(){
        return "เป็ด" + this.name;
    }

    @Override
     void sound() {
        System.out.println("quack quack");

    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");

    }

    @Override
    public void glied() {
        System.out.println("hi~yahhh!");
    }

    void clean(Animal animal){
        System.out.println(this.toString() +" is cleaning " + animal);
    }


}
