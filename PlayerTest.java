class PlayerTest {

    public static void main (String[] args) {
        Ninja n = new Ninja("Nancy");
        Samurai s = new Samurai("Sam");
        Wizard w = new Wizard("Walter");
        Samurai s2 = new Samurai("Sydney");
        Samurai s3 = new Samurai("Severus");

        w.heal(n);
        n.reportHealth();

        System.out.println("************************");

        n.steal(w);
        n.reportHealth();
        w.reportHealth();

        System.out.println("************************");

        w.fireball(s);
        s.reportHealth();

        System.out.println("************************");

        n.runAway();
        n.reportHealth();

        System.out.println("************************");

        s.deathBlow(n);
        s.reportHealth();
        n.reportHealth();

        System.out.println("************************");

        s.meditate();
        s.reportHealth();

        System.out.println("************************");

        System.out.println(s.howMany());
    }

}