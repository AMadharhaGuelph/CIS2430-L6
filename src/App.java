import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList allTheThings = new ArrayList<>();
        Potion potion1 = new Potion("Invisibility", "You become invisible");
        System.out.println(potion1.getTotal());
        allTheThings.add(potion1);
        allTheThings.add(new Potion("Silence", "There is no noise"));
        System.out.println(potion1.getTotal());
        allTheThings.add(new Potion("Fly", "You can fly"));
        System.out.println(potion1.getTotal());

        Monster monster1 = new Monster("Orc", "1-8 damage");
        System.out.println(monster1.getTotal());
        allTheThings.add(monster1);
        allTheThings.add(new Monster("Troll", "3-18 damage"));
        System.out.println(monster1.getTotal());
        allTheThings.add(new Monster("Dragon", "5-50 damage"));
        System.out.println(monster1.getTotal());

        for(Object thing: allTheThings){
            System.out.println(thing);
        }
    }
}
