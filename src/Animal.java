public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Animal setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
