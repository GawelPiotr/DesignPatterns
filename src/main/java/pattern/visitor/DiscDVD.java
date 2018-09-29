package main.java.pattern.visitor;

public class DiscDVD implements Element {

    private String title;
    private float price;
    private float weight;
    private boolean inPromotion = false;

    public DiscDVD(String title, float price, float weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public DiscDVD(String blue_planet_ii, String price, String weight) {
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public float accept (MyVisitor visitor){
        return  visitor.visit(this);
    }

    public void setInPromotion(boolean inPromotion) {
        this.inPromotion = inPromotion;
    }

    public boolean isInPromotion() {
        return inPromotion;
    }
}
