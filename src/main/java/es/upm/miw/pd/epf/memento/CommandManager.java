package es.upm.miw.pd.epf.memento;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Command> Commands = new HashMap<>();

    public void add(Command Command) {
        this.Commands.put(Command.name(), Command);
    }

    public Object execute(String key, Object value) {
        return this.Commands.get(key).execute(value);
    }

    public String[] keys() {
        return this.Commands.keySet().toArray(new String[0]);
    }
}
