public class Potion implements Countable {
    // Attributes
    private String type;
    private String effect;
    private static int total = 0;

    // Default (0 Parameter) Contructor
    public Potion() {
        this.type = "Health";
        this.effect = "Gain 2-8 pts health";
        total++;
    }

    // Two Parameter Contructor
    public Potion(String type, String effect) {
        this.type = type;
        this.effect = effect;
        total++;
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return type + ": " + effect;
    }
    
}