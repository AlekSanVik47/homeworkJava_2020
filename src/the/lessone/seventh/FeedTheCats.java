package the.lessone.seventh;

import java.util.Arrays;

public class FeedTheCats {
    private static Object Plate;

    public static void main(String[] args) {
        Plate = new Plate(0);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 50);
        cats[1] = new Cat("Тишка", 40);
        cats[2] = new Cat("Снежок", 100);
        cats[3] = new Cat("Перс", 120);
        cats[4] = new Cat("Дымка", 90);


        Plate[] plates = new Plate[3];
        plates[0] = new Plate(50);
        plates[1] = new Plate(100);
        plates[2] = new Plate(200);

        for (Cat cat : cats) {
            for (Plate plate : plates) {

                for (int i = 0; i < plates.length; i++) {

                    Plate = plates[i];
                    if (!(plates[i] == null)) {

                       // System.out.println(plate.decreaseFood(i));
                        plate.decreaseFood(i);
                        cat.eat(plates[i]);
                        cat.catInfo();
                        plate.info();
                    }


                }


            }
        }




        }



}

