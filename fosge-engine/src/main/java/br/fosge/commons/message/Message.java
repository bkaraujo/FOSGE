package br.fosge.commons.message;

import br.fosge.commons.Time;

public abstract class Message {
    public final long timestamp = Time.millis();
}
