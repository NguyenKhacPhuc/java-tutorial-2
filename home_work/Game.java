abstract class Game {
    public  void play()
    {
        initialize(); 
        startPlay();
        endPlay();
    }

    public abstract void initialize();
    public abstract void endPlay();
    public abstract void startPlay();

}
