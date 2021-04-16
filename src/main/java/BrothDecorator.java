public class BrothDecorator extends AbstractDecorator {

    public BrothDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 1 1/2 c. low-sodium chicken broth\n";
    }
}
