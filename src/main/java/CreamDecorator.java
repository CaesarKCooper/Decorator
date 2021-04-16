public class CreamDecorator extends AbstractDecorator {

    public CreamDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* 1/2 c. heavy cream\n";
    }
}
