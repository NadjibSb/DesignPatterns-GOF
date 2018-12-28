package Command;

public class LightOnCommand extends Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(){
        this.light.on();
    }
}
