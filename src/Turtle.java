public class Turtle implements Walk, Swim{

    private String name;

    private int hp;

    private int attackPower;

    private int moveSpeed;

    public Turtle(String name, int hp, int attackPower, int moveSpeed) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.moveSpeed = moveSpeed;
    }

    public void levelUp() {
        hp += 20;
        attackPower += 1;
        moveSpeed += 2;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println(this.name + "이(가) 쓰러졌습니다!");
            return;
        }
        System.out.println(this.name + "이(가) 상처를 입었습니다.");
    }

    public void attack(Turtle turtle) {
        System.out.println(this.name + "이(가) " + turtle.getName() + "을(를) 공격했습니다.");
        turtle.takeDamage(attackPower);
    }

    public void hidingInTheShell() {
        System.out.println(this.name + "이(가) 등껍질 속으로 숨었습니다.");
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println(this.name + "이(가) 설렁설렁 헤엄칩니다.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + "이(가) 느릿느릿 땅을 걷습니다.");
    }
}
