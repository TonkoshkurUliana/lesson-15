import java.util.*;

public class ZooClub {
    void addPerson(Map<Person, ArrayList<Animal>> map) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть своє ім'я : ");
        String name = sc.next();
        System.out.print("Введіть свій вік : ");
        int age = sc.nextInt();
        map.put(new Person(name, age), new ArrayList<>());
    }

    void addPet(Map<Person, ArrayList<Animal>> map) {
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ім'я власника : ");
        String namePerson = sc.next();

        for (Person key : map.keySet()) {
            if (key.getName().equalsIgnoreCase(namePerson)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Цього власника не існую");
        } else {
            System.out.print("Введіть ім'я тваринки: ");
            String name = sc.next();
            System.out.print("Введіть тип тваринки : ");
            String type = sc.next();

            Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Person, ArrayList<Animal>> next = (Map.Entry) iterator.next();
                if (next.getKey().getName().equalsIgnoreCase(namePerson)) {
                    List<Animal> animals = (List) next.getValue();
                    animals.add(new Animal(name, type));
                    next.setValue((ArrayList) animals);
                }
            }
        }
    }

    void removePet(Map<Person, ArrayList<Animal>> map) {
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ім'я власника : ");
        String namePerson = sc.next();

        for (Person key : map.keySet()) {
            if (key.getName().equalsIgnoreCase(namePerson)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Цього власника не існую");
        } else {
            System.out.print("Введіть ім'я тваринки: ");
            String name = sc.next();

            Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Person, ArrayList<Animal>> next = (Map.Entry) iterator.next();
                if (next.getKey().getName().equalsIgnoreCase(namePerson)) {
                    List<Animal> animals = (List) next.getValue();
                    Iterator<Animal> iterator1 = animals.iterator();
                    while (iterator1.hasNext()) {
                        Animal next2 = (Animal) iterator1.next();
                        if (next2.getName().equalsIgnoreCase(name)) {
                            iterator1.remove();
                        }
                    }
                }
            }
        }
    }

    void removePerson(Map<Person, ArrayList<Animal>> map) {
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ім'я власника : ");
        String namePerson = sc.next();

        for (Person key : map.keySet()) {
            if (key.getName().equalsIgnoreCase(namePerson)) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Цього власника не існую");
        } else {
            Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Person, ArrayList<Animal>> next = (Map.Entry) iterator.next();
                if (next.getKey().getName().equalsIgnoreCase(namePerson)) {
                    List<Animal> animals = (List) next.getValue();
                    iterator.remove();
                }
            }
        }
    }

    void removePetAllPerson(Map<Person, ArrayList<Animal>> map) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ім'я тваринки: ");
        String name = sc.next();

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, ArrayList<Animal>> next = (Map.Entry) iterator.next();
            List<Animal> animals = (List) next.getValue();
            Iterator<Animal> iterator1 = animals.iterator();
            while (iterator1.hasNext()) {
                Animal next2 = (Animal) iterator1.next();
                if (next2.getName().equalsIgnoreCase(name)) {
                    iterator1.remove();
                }
            }
        }
    }

    void zooClubOnScreen(Map<Person, ArrayList<Animal>> map) {

        for (Map.Entry<Person, ArrayList<Animal>> entry : map.entrySet()) {
            System.out.println(entry.toString());
        }
    }


}
