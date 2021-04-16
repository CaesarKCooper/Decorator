public class SaltDecorator extends AbstractDecorator {

    public SaltDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() +  addSauce();
    }

    private String addSauce() {
        return "* preferred amount of Kosher salt\n";
    }
}
