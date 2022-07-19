package Prototype;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Inventory inventory = new Inventory();

        Tshirt tshirt = (Tshirt) inventory.getItem(ItemTypes.TSHIRT);
        System.out.println(tshirt);

        Hat hat = (Hat) inventory.getItem(ItemTypes.HAT);
        System.out.println(hat);

        tshirt.setSize("L");
        System.out.println(tshirt);


    }





}



