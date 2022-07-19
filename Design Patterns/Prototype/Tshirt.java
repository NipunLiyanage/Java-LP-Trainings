package Prototype;

public class Tshirt extends Item {

    private String size;
    private String type;

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
