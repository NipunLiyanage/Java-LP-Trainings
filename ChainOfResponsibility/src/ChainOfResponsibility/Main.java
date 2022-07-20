package ChainOfResponsibility;

public class Main {

    public static void main(String[] args) {
	// write your code here

        InitialLevel il = new InitialLevel();
        FirstLevel fl = new FirstLevel();
        SecondLevel sl = new SecondLevel();
        ThirdLevel tl = new ThirdLevel();
        LevelFour lf = new LevelFour();

        il.setSuccessor(fl);
        fl.setSuccessor(sl);
        sl.setSuccessor(tl);
        tl.setSuccessor(lf);

        Product product1 = new Product(125,1000.00, 4);
        System.out.println(il.applyValue(product1));


    }
}
