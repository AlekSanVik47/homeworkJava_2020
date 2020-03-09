package the.lessone.six;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsApp extends Animals {

    public AnimalsApp(String nickname, int run, double jump) {
        super(nickname);
    }

    public static void main(String[] args) {



        Animals animals = new Animals("Cats");
        Cat cat = new Cat("Барсик", 200, false, 2);
        animals.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animals danimals = new Animals("Dogs");
        Dog dog = new Dog("Рэкс", 500, 0.5, 10);
        danimals.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}




