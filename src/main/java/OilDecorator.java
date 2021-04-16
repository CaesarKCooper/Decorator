public class OilDecorator extends AbstractDecorator {

    public OilDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 2 tbsp. extra-virgin olive oil\n";
    }
}
