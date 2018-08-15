public class LightStatus implements Command{

    Light light;
    public LightStatus(Light light){
        this.light = light;
    }

    public void execute() {
        light.showStatus();
    }
}
