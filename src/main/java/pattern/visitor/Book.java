package main.java.pattern.visitor;

public class Book implements Element {

    private String title;
    private float price;
    private float weight;

    public Book(String title, float price, float weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public Book(String delikatne_uderzenie_pioruna, String price, String weight) {
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

    public float accept(MyVisitor visitor){
        return visitor.visit(this);
    }
}
