package builder.generic;

public class GenericMethodsHelper<T> extends GenericMethods<T> {
    public static GenericMethodsHelper instance;
    public T t;
    public GenericMethodsHelper() {
        super();

    }
    public GenericMethodsHelper(T initialAction) {
        super(initialAction);
    }

    public <J> GenericMethodsHelper(T initialAction, J nextAction) {
        super(initialAction, nextAction);
    }
    public static GenericMethodsHelper getInstance() {
        if (instance == null) {
            return new GenericMethodsHelper();
        }
        return instance;
    }
    @Override
    public <R> R performAction(T action) {
        return super.performAction(action);
    }

    @Override
    public <U, R> R performAnotherAction(U action) {
        return super.performAnotherAction(action);
    }
}
