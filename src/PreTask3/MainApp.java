package PreTask3;

public class MainApp implements MainInterface, HumanInterface {

    //in same package we can use interfaces as much as we need

    @Override
    public void talk() {

    }

    @Override
    public void walk() {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void checkTest() {

    }

    @Override
    public String getString(String word) {
        return "New string";
    }
}

