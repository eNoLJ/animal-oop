public abstract class Animal {

    private String name;

    private int hp;

    private int attackPower;

    public Animal(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void levelUp() {
        hp += 10;
        attackPower += 3;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println(this.name + "이(가) 쓰러졌습니다!");
            return;
        }
        System.out.println(this.name + "이(가) 상처를 입었습니다.");
    }

    public void attack(Animal animal) {
        System.out.println(this.name + "이(가) " + animal.getName() + "을(를) 공격했습니다.");
        animal.takeDamage(attackPower);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
