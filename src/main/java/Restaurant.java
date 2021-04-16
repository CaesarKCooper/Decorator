public class Restaurant {

    public static void main(String[] args) {
        Alfredo alfredo = new WholeMilkDecorator(new SaltDecorator(new ParsleyDecorator(new OilDecorator
                (new CreamDecorator(new BrothDecorator(new BlackPepperDecorator(new CheeseDecorator
                        (new MeatDecorator(new FetucciniDecorator(new AlfredoRecipe()))))))))));

        System.out.println(alfredo.makeRecipe());
    }
}
