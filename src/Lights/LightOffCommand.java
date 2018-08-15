package Lights;

public class LightOffCommand implements Command {

    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.switchOff();
    }

    public void undo(){
        light.switchOn();
    }
}
