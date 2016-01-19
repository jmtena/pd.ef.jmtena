package es.upm.miw.pd.epf.memento;

public interface Command {
    String name();
    Object execute(Object value);
}
