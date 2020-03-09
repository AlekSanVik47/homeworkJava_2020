package the.lessone.six;

public class Cat extends Animals {
    protected boolean sail;

    public Cat(String nickname, int run, boolean sail, double jump) {
        super(nickname);
        this.nickname = nickname;
        this.run = run;
        this.sail = sail;
        this.jump = jump;

    }
    public void catInfo(){
        System.out.println("Кличка кота: " + nickname + "\n" + "пробежал: " + run + " метров\n" + "проплыл " + sail + "\nпрыгнул на высоту: " + jump + " метра");

    }
}
