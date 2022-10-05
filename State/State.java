package State;

public interface State {
    void next(Pokemon pokemon);
    void skill1(Pokemon pokemon);
    void skill2(Pokemon pokemon);
    void victory(Pokemon pokemon);
    void status();
}
