package Command;

public class MusicOffCommand extends Command {
    private Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute(){
        this.music.stop();
    }
}
