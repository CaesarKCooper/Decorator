public class MeatDecorator extends AbstractDecorator {

    public MeatDecorator(Alfredo alfredo){
        super(alfredo);
    }

    public String makeRecipe(){
        return alfredo.makeRecipe() + addMeat();
    }

    private String addMeat(){
        return "* 2 boneless skinless chicken breasts\n";
    }

}
