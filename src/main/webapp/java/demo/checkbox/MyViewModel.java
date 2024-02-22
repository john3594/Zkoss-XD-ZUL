package demo.checkbox;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MyViewModel {
    private boolean switchState;

    @Init
    public void init() {
        // Initialize switchState to true or false as needed
        switchState = false; // Set to false initially
    }

    public boolean isSwitchState() {
        return switchState;
    }

    @Command
    @NotifyChange("switchState")
    public void toggleSwitch() {
        switchState = !switchState;
    }
}
