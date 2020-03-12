package the.lessone.seventh;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
     public void catInfo(){

        String isSatiety = !satiety ? " не голоден" : " голодный";
         System.out.println(name + " " + isSatiety);
     }

    public boolean isSatiety(Cat cat) {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p){
        if (satiety && p.decreaseFood(appetite)){
            satiety = false;
        }

    }

    public void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


   }
