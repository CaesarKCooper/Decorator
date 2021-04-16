public class GarlicDecorator extends AbstractDecorator {

    public GarlicDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 2 minced cloves garlic\n";
    }
}
