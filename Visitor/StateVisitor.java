package Visitor;

public interface StateVisitor {
    void visit(State state);
    void next();
}
