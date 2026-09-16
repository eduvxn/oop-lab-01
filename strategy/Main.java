package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(new WalkStrategy());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите способ передвижения: ");
            System.out.println("1 - идти, 2 - ехать на лошади, 3 - лететь, 0 - выйти");
            System.out.print("> ");

            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1 -> hero.setMoveStrategy(new WalkStrategy());
                    case 2 -> hero.setMoveStrategy(new HorseStrategy());
                    case 3 -> hero.setMoveStrategy(new FlyStrategy());
                    case 0 -> {
                        return;
                    }
                    default -> {
                        System.out.println("Неверный выбор");
                        continue;
                    }
                }
                hero.move();
            } else {
                System.out.println("Неверный выбор");
                scanner.nextLine();
            }
        }
    }
}