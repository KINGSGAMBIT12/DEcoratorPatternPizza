public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 150.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Cheese";
    }
}
