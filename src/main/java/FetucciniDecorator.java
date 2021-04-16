public class FetucciniDecorator extends AbstractDecorator {

    public FetucciniDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 8 oz. fetuccini\n";
    }
}
