package projectvendingmachine;

public class Runner {

    public static void main(String[] args) {

        Products products = new Products();

        Method method =new Method();
        method.select(products);

    }
}
