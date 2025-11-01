package lesson_37_generics_intro;

public class Box<S, I, F> {
    private S key;
    private I value;
    private F add;

    public Box(S key, I value, F add) {
        this.key = key;
        this.value = value;
        this.add = add;
    }

    public S getKey() {
        return key;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public I getValue() {
        return value;
    }

    public void setValue(I value) {
        this.value = value;
    }

    public F getAdd() {
        return add;
    }

    public void setAdd(F add) {
        this.add = add;
    }
}
