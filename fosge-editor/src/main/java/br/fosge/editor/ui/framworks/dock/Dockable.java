package br.fosge.editor.ui.framworks.dock;

import com.github.f4b6a3.ulid.Ulid;

public interface Dockable {

    Ulid identity();
    void clear(Region region);
    void set(Region region, Dockable panel);
    Dockable get(Region region);
}
