public class CheeseDecorator extends AbstractDecorator {

    public CheeseDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 1 c. freshly grated Parmesan\n";
    }
}
