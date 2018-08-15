public class LightColorRed implements Command {

    Light light;
    public LightColorRed(Light light){
        this.light = light;
    }

    public void execute() {
        light.color("Red");
    }

}
