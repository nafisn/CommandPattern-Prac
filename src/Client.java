import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class Client {

    public static void main(String[] args) {
        //invoker
        RemoteControl control = new RemoteControl();
        //Receiver
        Light light = new Light();

        //Concrete Commands
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command status = new LightStatus(light);
        Command colorGreen = new LightColorGreen(light);
        Command colorRed = new LightColorRed(light);
        Command colorBlue = new LightColorBlue(light);


        Deque<Command> commands = new ArrayDeque<>();
        commands.push(status);
        commands.push(lightsOn);
        commands.push(colorBlue);
        commands.push(status);
        commands.push(lightsOff);
        commands.push(status);
        commands.push(colorGreen);
        commands.push(lightsOn);
        commands.push(status);
        commands.push(colorRed);
        commands.push(status);
        commands.push(lightsOff);
        commands.push(status);

        //switch on
        control.setCommand(lightsOn);
        control.pressButton();

        //switch off
        control.setCommand(lightsOff);
        control.pressButton();

    }
}
