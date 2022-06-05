package listcode.staticlists;

public class item {
    private boolean isFruit;
	static boolean isDairy;
	private boolean isVegetable;
	private boolean isMeat;
    private String name;
    private double price;
    // SETTERS
    public void setProduct(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
    // GETTERS
    public String getProduct() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
