package main.java.pattern.visitor;

import main.java.pattern.visitor.MyVisitor;

public interface Element {
    float accept(MyVisitor visitor);

}
