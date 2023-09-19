package chapter10;

public class Zoo {

    public static void main(String[] args){
        Dog onyx = new Dog();
        onyx.fetch();
        onyx.makeSound();
        feed(onyx);

        Animal zeus = new Dog();
        zeus.makeSound();
        feed(zeus);

        zeus = new Cat();
        zeus.makeSound();
        ((Cat)zeus).scratch();
        feed(zeus);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's some dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("Here's some cat food");
        }
    }
}
