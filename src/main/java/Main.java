import application.DeliveryApplication;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
import ui.GUIFactory;
import ui.MacOSFactory;
import ui.WindowsFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery mode (ROAD or SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        System.out.print("Enter UI platform (WINDOWS or MACOS): ");
        String platform = scanner.nextLine().trim().toUpperCase();

        Logistics logistics;
        GUIFactory guiFactory;

        switch (deliveryMode) {
            case "ROAD":
                logistics = new RoadLogistics();
                break;
            case "SEA":
                logistics = new SeaLogistics();
                break;
            default:
                System.out.println("Invalid delivery mode. Please choose ROAD or SEA.");
                return;
        }

        switch (platform) {
            case "WINDOWS":
                guiFactory = new WindowsFactory();
                break;
            case "MACOS":
                guiFactory = new MacOSFactory();
                break;
            default:
                System.out.println("Invalid UI platform. Please choose WINDOWS or MACOS.");
                return;
        }

        System.out.println();
        System.out.println("Delivery mode: " + deliveryMode);
        System.out.println("UI platform: " + platform);

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run();

        scanner.close();
    }
}
