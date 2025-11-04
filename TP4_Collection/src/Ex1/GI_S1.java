package Ex1;

import java.util.Arrays;
import java.util.List;

public class GI_S1 {
	
    private static final List<String> modules = Arrays.asList(
        "M1 : Java", "M2 : UML", "M3 : BD", "M4 : Administration Linux", "M5 : Java Avance", "M6 : Administration de base de donnees"
    );

    public static List<String> getModules() {
        return modules;
    }
}
