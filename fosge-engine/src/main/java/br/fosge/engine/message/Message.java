package br.fosge.engine.message;

import br.fosge.Time;

public abstract class Message {
    public final long timestamp = Time.millis();
}
