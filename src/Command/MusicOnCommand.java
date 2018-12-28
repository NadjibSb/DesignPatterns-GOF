package Command;

public class MusicOnCommand extends Command {
    private Music music;

    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute(){
        this.music.play();
    }
}
