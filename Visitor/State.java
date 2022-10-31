package Visitor;

public interface State {
    String name();
    void skill1(Pokemon pokemon);
    void skill2(Pokemon pokemon);
    void victory(Pokemon pokemon);
    void status();
}
