package main.java.pattern.visitor;

 class DeliveryVisitor implements MyVisitor{
private static final float PACKAGE_FACTOR = 1.15f;
     @Override
     public float visit(Book book) {
         return book.getWeight() * PACKAGE_FACTOR;
     }

     @Override
     public float visit(DiscDVD discDVD) {
         return discDVD.getWeight() * PACKAGE_FACTOR;
     }

     @Override
     public float visit(Perfume perfume) {
         return perfume.getWeight() * PACKAGE_FACTOR;
     }
 }
