package the.lessone.seventh;

public class Plate {
    private int food;


    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("В тарелке было: " + food + " грамм еды");
    }
    public boolean decreaseFood(int n){
        int d = food - n;
        if (d < 0) return false;
        food -=n;
        System.out.println("В тарелке осталось: " + d);
        return true;
    }

    public void addFood(int food){
        this.food += food;
    }

    public static void main(String[] args) {


        Plate[] plates = new Plate[5];
        //plates[0] = new Plate(50);
       // plates[1] = new Plate(100);
        //plates[2] = new Plate(200);

    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
