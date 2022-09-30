public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.27);
        System.out.println("Total Burger price " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon" ,5.67);
        healthyBurger.addHealthAddition2("Egg",5.43);
        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
    }
}