package behavioural_design_patterns.iterator.src;

public interface Collection<T> {
    Iterator<T> createIterator();
}
