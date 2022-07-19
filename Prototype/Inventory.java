package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<ItemTypes, Item> items = new HashMap<>();

   public Inventory(){
       this.initiate();
   }

   public Item getItem(ItemTypes itemTypes) {
       Item item = null;
       try {
           item = (Item) items.get(itemTypes).clone();
       }catch(CloneNotSupportedException e) {
           e.printStackTrace();
       }
       return item;
   }


   private void initiate(){

      Tshirt tshirt = new Tshirt();
      tshirt.setPrice(1000.00);
      tshirt.setQuantity(20);
      tshirt.setSize("XL");
      tshirt.setType("Polo");


      Hat hat = new Hat();
      hat.setType("Baseball Cap");
      hat.setQuantity(10);
      hat.setPrice(500.00);

       items.put(ItemTypes.TSHIRT, tshirt);
       items.put(ItemTypes.HAT, hat);



       }

   }


