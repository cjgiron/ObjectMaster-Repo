public class Ninja extends Human {

    public Ninja (String name) {
        super();
        this.name = name;
        this.stealth = 10;
    }

    public void steal (Human target) {
        target.health -= this.stealth;
        this.health += this.stealth;
        System.out.println(this.name + " ninja stole " + this.stealth + " health points from " + target.name);
    }

    public void runAway () {
        this.health -= 10;
        System.out.println(this.name + " ninja ran away and lost 10 health points.");
    }
}