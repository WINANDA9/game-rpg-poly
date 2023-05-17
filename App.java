public class App {

    public static void main(String[] args) {
        System.out.println("=".repeat(63));
        System.out.println("=".repeat(25) + " GAME RPG POLY " + "=".repeat(25));
        System.out.println("=".repeat(63));
        Hero hero = new Hero();
        hero.move();
        hero.move("Lari Kedepan");
        System.out.println("-".repeat(25));

        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(100);
        System.out.println("-".repeat(25));

        
        Character ch1 = new Hero();
        ch1.move();
        System.out.println("-".repeat(25));


        Character ch2 = new Enemy();
        ch2.move();
        System.out.println("-".repeat(25));


        Character ch3 = new Witch();
        ch3.move();
        System.out.println("-".repeat(25));


        Character ch4 = new Witch();
        Fighter fighter = (Fighter)ch4;
        fighter.move();

    }
}