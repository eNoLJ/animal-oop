public class Lion extends Animal implements Walk {

    public Lion(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    public void biteStrongly(Animal animal) {
        int damage = getAttackPower();

        if (Math.random() < 0.3) {
            damage *= 2;
            System.out.println("강하게 물었습니다! (크리티컬 히트!)");
        }

        System.out.println(getName() + "이(가) " + animal.getName() + "을(를) 공격했습니다.");
        animal.takeDamage(damage);
    }

    @Override
    public void walk() {
        System.out.println(getName() + "이(가) 어슬렁 어슬렁 걷습니다.");
    }
}
