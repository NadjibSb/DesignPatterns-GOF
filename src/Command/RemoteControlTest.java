package Command;

public class RemoteControlTest {

    public static void main(String[] args){
        Music music = new Music();
        Light light = new Light();

        RemoteControl remoteControl = new RemoteControl(light,music);

        remoteControl.pressKey(RemoteControl.LIGHT_ON);
        remoteControl.pressKey(RemoteControl.MUSIC_ON);
        remoteControl.pressKey(RemoteControl.VOLUME);
        remoteControl.pressKey(RemoteControl.LIGHT_OFF);
        remoteControl.pressKey(RemoteControl.MUSIC_OFF);
    }
}
