package prototype;

public class Brand implements Cloneable {
    private String name;

    public Brand(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Brand { name: \'" + this.name + "\' };";
    }
}
