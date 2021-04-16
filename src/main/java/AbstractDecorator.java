public abstract class AbstractDecorator implements Alfredo {

    public Alfredo alfredo;

    public AbstractDecorator(Alfredo customAlfredo){
        this.alfredo = customAlfredo;
    }

    public String makeRecipe(){
        return alfredo.makeRecipe();
    }
}
