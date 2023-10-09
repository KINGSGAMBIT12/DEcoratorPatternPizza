public class SpecialSauceDecorator extends PizzaDecorator{
    public SpecialSauceDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 200.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Special Sause";
    }
}
