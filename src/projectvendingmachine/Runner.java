package projectvendingmachine;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Merhaba");

            Products product = new Products();
            Method methods = new Method();
            double money = methods.money();
            System.out.println("Hesabinizda " + money + " dollar var");
            methods.select(product);
            methods.balance(product.getPrice(), money, product);



    }
}
