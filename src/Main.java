import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("Натисніть 1, щоб додати учасника клубу");
        System.out.println("Натисніть 2, щоб додати тваринку до учасника клубу");
        System.out.println("Натисніть 3, щоб видалити тваринку з учасника клубу");
        System.out.println("Натисніть 4, щоб видалити учасника з клубу");
        System.out.println("Натисніть 5, щоб видалити конкретну тваринку зі всіх власників");
        System.out.println("Натисніть 6, щоб вивести на екран зооклуб");
        System.out.println("Натисніть 7, щоб вийти з програми");
    }

    public static void main(String[] args) {

        Map<Person, ArrayList<Animal>> map = new HashMap();
        ZooClub zooClub = new ZooClub();
        while (true) {
            menu();
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1: {
                    zooClub.addPerson(map);
                    break;
                }
                case 2: {
                    zooClub.addPet(map);
                    break;
                }
                case 3: {
                    zooClub.removePet(map);
                    break;
                }
                case 4: {
                    zooClub.removePerson(map);
                    break;
                }
                case 5: {
                    zooClub.removePetAllPerson(map);
                    break;
                }
                case 6: {
                    zooClub.zooClubOnScreen(map);
                    break;
                }
                case 7: {
                    System.exit(0);
                }
            }
        }
    }
}
