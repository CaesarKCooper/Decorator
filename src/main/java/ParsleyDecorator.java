public class ParsleyDecorator extends AbstractDecorator {

    public ParsleyDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* freshly chopped parsley\n";
    }
}
