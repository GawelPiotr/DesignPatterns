package main.java.pattern.visitor;

 class ShoppingVisitorImpl implements MyVisitor{
    public float visit(Book book){
        float price = book.getPrice();

        if(price>90){
            price *= 0.9;
        }

        return price;
    }

     @Override
     public float visit(DiscDVD discDVD) {
        float price = discDVD.getPrice();
        if (discDVD.isInPromotion()){
            price *= 0.5;
        }
         return price;
     }

     @Override
     public float visit(Perfume perfume) {
         return perfume.getPrice();
     }
 }
