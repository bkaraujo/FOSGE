package br.fosge.engine.ecs;

import br.fosge.commons.annotation.Lifecycle;
import br.fosge.commons.serializer.Yaml;
import com.github.f4b6a3.ulid.Ulid;

import java.util.List;

public interface Actor extends Lifecycle {

    Ulid identity();
    Yaml yaml();
    List<Component> components();
}
