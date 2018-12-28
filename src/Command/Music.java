package Command;

public class Music {

    public void play(){
        System.out.println("\n=> Playing some music !!!");
    }

    public void stop(){
        System.out.println("\n$$ Stop the music.");
    }

    public void setVolume(int volume){
        System.out.println("\n-+ Set volume to "+volume);
    }
}
