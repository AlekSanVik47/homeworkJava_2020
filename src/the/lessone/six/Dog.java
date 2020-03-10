package the.lessone.six;



public class Dog extends Animals {
        public int sail;

    public Dog(String nickname, int run, double jump, int sail) {
        super(nickname);
        this.sail = sail;
        this.nickname = nickname;
        this.run = run;
        this.jump = jump;
    }
    public void dogInfo(){
        System.out.println("Кличка собаки: " + nickname + "\n" + "пробежала: " + run + " метров\n" + "проплыла " + sail + " метров\nпрыгнул на высоту: " + jump + " метра");
    }

}
