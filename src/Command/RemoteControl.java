package Command;

import java.util.HashMap;

public class RemoteControl {
    public static int LIGHT_ON = 1;
    public static int LIGHT_OFF = -1;
    public static int MUSIC_ON = 2;
    public static int MUSIC_OFF = -2;
    public static int VOLUME = 0;

    private HashMap<Integer,Command> commands;

    public RemoteControl(Light light , Music music){
        commands = new HashMap<Integer,Command>();

        commands.put(LIGHT_ON,new LightOnCommand(light));
        commands.put(LIGHT_OFF,new LightOffCommand(light));
        commands.put(MUSIC_ON,new MusicOnCommand(music));
        commands.put(MUSIC_OFF,new MusicOffCommand(music));
        commands.put(VOLUME,new MusicVolumeCommand(music,10));
    }

    public void pressKey(int key){
        commands.get(key).execute();
    }
}
