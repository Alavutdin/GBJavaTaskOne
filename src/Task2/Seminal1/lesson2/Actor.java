package Task2.Seminal1.lesson2;

public abstract class Actor  implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name, boolean isMakeOrder, boolean isTakeOrder) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {

        System.out.println(name+" worlk zakaz");
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        System.out.println(name+" add zakaz");
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {

        return isMakeOrder;
    }

    public boolean isTakeOrder() {

        return isTakeOrder;
    }
}
