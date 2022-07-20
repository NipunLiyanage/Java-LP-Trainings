package Prototype;

public class Hat extends Item {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "type='" + type + '\'' +
                '}';
    }
}
