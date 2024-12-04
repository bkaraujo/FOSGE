package br.fosge.editor.ui.framworks.dock;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public final class DockPanel extends JPanel implements Dockable {
    private final Ulid identity = UlidCreator.getMonotonicUlid();
    private final Map<Region, Dockable> regions = new HashMap<>();

    public DockPanel() {
        setName("Panel");
    }

    @Override
    public Ulid identity() {
        return identity;
    }

    @Override
    public void clear(Region region) {
        if (!regions.containsKey(region)) return;
        regions.remove(region);
    }

    @Override
    public void set(Region region, Dockable panel) {
        if (!regions.containsKey(region)) {
            regions.put(region, panel);
            return;
        }

        regions.get(region).set(region, panel);
    }

    @Override
    public Dockable get(Region region) {
        if (!regions.containsKey(region)) return null;
        return regions.get(region);
    }
}
