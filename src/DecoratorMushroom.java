public class DecoratorMushroom extends PizzaDecorator{
    public DecoratorMushroom (Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 800.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Mushrooms";
    }
}
