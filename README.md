# Assignment 2: Factory Method and Abstract Factory

A console-based Java logistics application demonstrating:

- Factory Method for creating transport types.
- Abstract Factory for creating matching Windows and macOS UI components.

## Run

Use Java 17. From the project root:

```bash
javac -d out src/main/java/logistics/*.java src/main/java/ui/*.java src/main/java/application/*.java src/main/java/Main.java
java -cp out Main
```

## Input

- `ROAD` creates a `Truck`.
- `SEA` creates a `Ship`.
- `WINDOWS` creates Windows UI components.
- `MACOS` creates macOS UI components.

Input is case-insensitive.

## Structure

- `logistics/` contains the Factory Method implementation.
- `ui/` contains the Abstract Factory implementation.
- `application/DeliveryApplication.java` combines both patterns.
- `Main.java` is the entry point.

## Sample Output

```text
Rendering macOS button
Rendering macOS checkbox
Planning delivery...
Ship delivers laboratory equipment to Aktau warehouse by sea.
```

Repository: https://github.com/sannder01/ass2_sdp
