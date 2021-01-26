package builder.generic;

public class GenericMethods<T> {
    GenericMethods() {

    }
    public GenericMethods( final T initialAction ) {
        System.out.println(initialAction);
    }

    public< J > GenericMethods( final T initialAction, final J nextAction ) {
        System.out.println(initialAction + ": " + nextAction);
    }

    public< R > R performAction( final T action ) {
        final R result = null;
        // Implementation here
        return result;
    }

    public< U, R > R performAnotherAction( final U action ) {
        final R result = null;
        // Implementation here
        return result;
    }
}
