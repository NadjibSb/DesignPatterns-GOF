package Command;

public class MusicVolumeCommand extends Command {
    private Music music;
    private int volume;

    public MusicVolumeCommand(Music music, int volume) {
        this.music = music;
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void execute(){
        this.music.setVolume(this.volume);
    }
}
