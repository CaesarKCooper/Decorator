public class BlackPepperDecorator extends AbstractDecorator {

    public BlackPepperDecorator(Alfredo alfredo) {
        super(alfredo);
    }

    public String makeRecipe() {
        return alfredo.makeRecipe() + addSauce();
    }

    private String addSauce() {
        return "* preferred amount of ground black pepper\n";
    }

}
