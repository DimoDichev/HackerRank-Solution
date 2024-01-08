import java.util.Scanner;

public class CovariantReturnType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Region region = null;

        if (input.equals("WestBengal")) {
            region = new WestBengal();
        } else {
            region = new AndhraPradesh();
        }

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());

    }

    static class Flower {
        String whatsYourName() {
            return "I have many names and types";
        }
    }

    static class Jasmine extends Flower {
        @Override
        String whatsYourName() {
            return "Jasmine";
        }
    }

    static class Lily extends Flower {
        @Override
        String whatsYourName() {
            return "Lily";
        }
    }

    static class Region {
        Flower yourNationalFlower() {
            return new Flower();
        }
    }

    static class WestBengal extends Region {
        Jasmine yourNationalFlower() {
            return new Jasmine();
        }
    }

    static class AndhraPradesh extends Region {
        Lily yourNationalFlower() {
            return new Lily();
        }
    }
}
