public class Person {
    private String name;
    private String secondName;
    private int quanity;

    public Person(String name, String secondName, int quanity) {
        this.name = name;
        this.secondName = secondName;
        this.quanity = quanity;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
}
