package application;

import logistics.Logistics;
import ui.Button;
import ui.Checkbox;
import ui.GUIFactory;

public class DeliveryApplication {
    private final GUIFactory guiFactory;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }

    public void run() {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();

        logistics.planDelivery(
                "laboratory equipment",
                "Aktau warehouse"
        );
    }
}
