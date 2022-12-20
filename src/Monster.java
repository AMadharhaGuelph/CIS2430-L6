public class Monster implements Countable {
    // Attributes
    private String type;
    private String range;
    private static int total = 0;

    // Default (0 Parameter) Constructor
    public Monster() {
        this.type = "Kobold";
        this.range = "1-4 pts of damage";
        total++;
    }

    // Two Parameter Constructor
    public Monster(String type, String range) {
        this.type = type;
        this.range = range;
        total++;
    }


    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return type + ": " + range;
    }
    
}