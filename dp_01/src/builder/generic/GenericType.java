package builder.generic;

public interface GenericType<T, R> {
    R performance(T action);
}
