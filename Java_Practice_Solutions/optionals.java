package concept;

import java.util.Optional;

public class optionals {

    public static void main(String[] args) {
        //  1. Empty Optional
        Optional<String> emptyOpt = Optional.empty();
           //  This creates an Optional object that contains no value.

        // 2. Optional with a value
        Optional<String> nameOpt = Optional.of("Shamshad");
        //   This creates an Optional object that contains the value "Shamshad".
        //  Using of () requires that the value is NOT null.

        //  3.   Optional that may be null
        String str = null;
            Optional<String> safeOpt = Optional.ofNullable(str);
        // This creates an Optional object that may contain null.
        //  If str is null, safeOpt will be Optional.empty.

        // Printing the Optionals
         System.out.println(emptyOpt);  // Output: Optional.empty
            System.out.println(nameOpt);   // Output: Optional[Shamshad]
        System.out.println(safeOpt);   // Output: Optional.empty
    }
}
