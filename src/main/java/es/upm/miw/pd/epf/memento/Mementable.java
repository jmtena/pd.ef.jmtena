package es.upm.miw.pd.epf.memento;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}