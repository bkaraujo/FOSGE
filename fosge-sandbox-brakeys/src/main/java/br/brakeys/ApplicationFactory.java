package br.brakeys;

import br.fosge.Version;
import br.fosge.graphics.Resolution;
import br.fosge.runtime.ApplicationSpec;
import br.fosge.runtime.platform.PlatformSpec;

public final class ApplicationFactory implements br.fosge.runtime.ApplicationFactory {

    @Override
    public ApplicationSpec create() {
        return new ApplicationSpec(
                "Brakeys",
                new Version(0, 1, 0),
                new PlatformSpec(
                        "Brackeys",
                        Resolution.nHD,
                        false
                ),
                new SandboxLayer()
        );
    }

}
