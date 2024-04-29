package Exempel;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<Item> items = new ArrayList<Item>();
    Scanner scan = new Scanner(System.in);

    public Game() {
        String name;
        int damage;
        for (int i = 0; i < 5; i++) {
            System.out.println("Regular item?");
            String ans = scan.nextLine();
            if (ans.equals("yes")) {
                System.out.println("Name? ");
                name = scan.nextLine();
                System.out.println("Damage? ");
                damage = scan.nextInt();
                new Item(name, damage);
            } else {
                System.out.println("Name? ");
                name = scan.nextLine();
                System.out.println("Damage? ");
                damage = scan.nextInt();
                System.out.println("speciality? ");
                String spec = scan.nextLine();
                new SItem(name, damage, spec);
            }

        }


    }

}
