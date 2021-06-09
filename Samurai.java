public class Samurai extends Human {

    private static int numberOfSamurai = 0;

    public Samurai (String name) {
        super();
        this.name = name;
        this.health = 200;
        numberOfSamurai++;
    }

    public void deathBlow(Human target) {
        target.health = 0;
        int reduction = this.health/2;
        this.health = reduction;
        System.out.println(this.name + " samurai delivered a deathblow and reduced " + target.name + "'s health to zero. This samurai also lost " + reduction + " health points.");
    }

    public void meditate () {
        this.health = 200;
        System.out.println(this.name + " samurai meditated back to full health.");
    }

    public static int howMany() {
        return numberOfSamurai;
    }
}