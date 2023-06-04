package com.userdefinedDataStructures;
import java.util.*;

public class LinearMapDemo {
    public static void main(String[] args) {
        LinearMap<String, Integer> mapLL = new LinearMap<>();

        do {
            System.out.println(" 1.put\n 2.remove\n 3.get\n 4.EntrySet\n 5.keySet\n 6.values\n" +
                    " 7.containskey\n 8.containsvalue\n 9.display\n 10.exit\n");
            System.out.println("Enter the choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the key and value to insert:");
                    String key = sc.next();
                    Integer value = sc.nextInt();
                    System.out.println("The previous value of if the same key enters:" + mapLL.put(key, value));
                    break;
                case 2:
                    System.out.println("Enter the key to be deleted");
                    key = sc.next();
                    System.out.println("The del value associated with key:" + mapLL.remove(key));
                    break;
                case 3:
                    System.out.println("Enter the key to search");
                    key = sc.next();
                    System.out.println("The value associated with key:" + mapLL.get(key));
                    break;
                case 4:
                    System.out.println("The data in the entries:" + (mapLL.entrySet()));
                    break;
                case 5:
                    System.out.println("The keys are :" + mapLL.keyset());
                    break;
                case 6:
                    System.out.println("The keys are :" + mapLL.values());
                    break;
                case 7:
                    System.out.println("Enter the key to search");
                    key = sc.next();
                    if (true == mapLL.ContainsKey(key)) {
                        System.out.println("key is found");
                    } else {
                        System.out.println("key is not found");
                    }
                    break;
                case 8:
                    System.out.println("Enter the value to search");
                    value = sc.nextInt();
                    if (true == mapLL.ContainsValue(value)) {
                        System.out.println("value is found");
                    } else {
                        System.out.println("value is not found");
                    }
                    break;
                case 9:
                    mapLL.display();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
