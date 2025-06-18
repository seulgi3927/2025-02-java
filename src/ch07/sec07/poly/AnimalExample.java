package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bulldog);
        // 월~ 월~
        // 불독이 쩜프 쩜프
    }

    public static void animalCrying(Animal animal)
    {
        animal.crying();
        // Dog 객체 넘어오면 jump 메소드 호출해주세요.

        // 1. jump() 메소드를 호출하려면 타입이 Dog가 되어야 한다.

        // 2. Dog 객체가 들어왔을 때만 Dog 타입으로 형변환 해야한다.

        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.jump();
        }




    }

}
//    public static void animalCrying(Cat cat) { cat.crying();}
//    public static void animalCrying(Tiger tiger) { tiger.crying();}
//    public static void animalCrying(Cow cow) { cow.crying();}
//    이렇게 작성해도 되지만 매우 비효율적이다. 그래서 다형성이 필요하다.