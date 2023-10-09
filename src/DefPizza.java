public class DefPizza implements Pizza{
    @Override
    public double getCost() {
        return 2500.0;
    }

    @Override
    public String getDescription() {
        return "Regular Pizza";
    }
}
