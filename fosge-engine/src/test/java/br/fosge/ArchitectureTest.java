package br.fosge;

import br.fosge.commons.Launcher;
import br.fosge.commons.annotation.Facade;
import br.fosge.commons.annotation.Specification;
import br.fosge.commons.annotation.State;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "br.fosge")
public class ArchitectureTest {

    @ArchTest
    public static final ArchRule rule_001_packages_common = noClasses()
            .that().resideInAPackage("br.fosge.commons..")
            .should().dependOnClassesThat().resideInAnyPackage(
                    "br.fosge.runtime..",
                    "br.fosge.engine..",
                    "br.fosge.editor.."
            );

    @ArchTest
    public static final ArchRule rule_001_packages_engine = noClasses()
            .that().resideInAPackage("br.fosge.engine..")
            .should().dependOnClassesThat().resideInAnyPackage(
                    "br.fosge.runtime..",
                    "br.fosge.editor.."
            );

    @ArchTest
    public static final ArchRule rule_001_packages_editor = noClasses()
            .that().resideInAPackage("br.fosge.editor..")
            .should().dependOnClassesThat().resideInAPackage(
                    "br.fosge.runtime.."
            );

    @ArchTest
    public static final ArchRule test_annotation_facade = classes()
            .that().implement(Facade.class)
            .should().haveModifier(JavaModifier.ABSTRACT)
            .andShould().haveOnlyPrivateConstructors()
            .allowEmptyShould(true);

    @ArchTest
    public static final ArchRule test_annotation_state = classes()
            .that().implement(State.class)
            .should().haveModifier(JavaModifier.ABSTRACT)
            .andShould().haveOnlyPrivateConstructors()
            .allowEmptyShould(true);

    @ArchTest
    public static final ArchRule test_annotation_specification = classes()
            .that().implement(Specification.class)
            .should().beRecords()
            .allowEmptyShould(true);

    @ArchTest
    public static final ArchRule test_launchers = classes()
            .that().areAssignableTo(Launcher.class)
            .should().haveNameMatching(".*Launcher")
            .allowEmptyShould(true);

}
