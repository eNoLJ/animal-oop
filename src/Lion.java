public class Lion extends Animal implements Walk {

    public Lion(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
    }

    @Override
    public void doAAction() {
        System.out.println(getName() + "이(가) 사나운 눈빛으로 먹이를 찾습니다.");
    }

    @Override
    public void doWAction() {
        System.out.println(getName() + "이(가) 초원을 달립니다.");
    }

    @Override
    public void doEAction() {
        System.out.println(getName() + "이(가) 어흥 어흥 포효합니다.");
    }

    @Override
    public void doRAction() {
        System.out.println(getName() + "이(가) 먹이를 뜯어 먹습니다.");
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
