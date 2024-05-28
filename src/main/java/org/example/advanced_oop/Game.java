package advanced_oop;

abstract class Game {
    public void play()
    {
        initialize();
        startPlay();
        endPlay();
    } 

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

}
