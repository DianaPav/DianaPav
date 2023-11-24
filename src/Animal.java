public class Animal {
    abstract void say();
}
class Cat extends  Animal{
    @Override
    void say (){
        System.out.println("Mew-Mew");
    }
        }
        class Dog extends Animal{
    @Override
    void say (){
        System.out.println("Bark-Bark");
    }

        }
