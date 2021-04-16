public class WholeMilkDecorator extends AbstractDecorator {

    public WholeMilkDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 1 1/2 c. whole milk\n";
    }
}
