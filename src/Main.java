public class Main {
    public static void main(String[] args){
        Pizza basicPizza = new DefPizza();
        System.out.println("Cost: Tg" + basicPizza.getCost() + ", Description: " + basicPizza.getDescription());

        Pizza pizzaWithCheese = new CheeseDecorator(new DefPizza());
        System.out.println("Cost: Tg" + pizzaWithCheese.getCost() + ", Description: " + pizzaWithCheese.getDescription());

        Pizza pizzaWithSauceAndMushrooms = new DecoratorMushroom(new SpecialSauceDecorator(new DefPizza()));
        System.out.println("Cost: Tg" + pizzaWithSauceAndMushrooms.getCost() + ", Description: " + pizzaWithSauceAndMushrooms.getDescription());
    }
    }
