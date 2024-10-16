package seedu.address.model.person;
import static java.util.Objects.requireNonNull;
/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class Remark {

    public static final String MESSAGE_CONSTRAINTS = "Remarks should adhere to the following constraints:\n"
            + "1. Remarks must contain at least one non-whitespace character.\n"
            + "2. They can contain any characters, including spaces and punctuation.\n"
            + "3. However, remarks consisting solely of whitespace are not allowed.";

    public final String value;

    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    /**
     * Returns if a given string is a valid email.
     */
    public static boolean isValidRemark(String test) {
        return !test.trim().isEmpty();
    }


    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Remark // instanceof handles nulls
                && value.equals(((Remark) other).value)); // state check
    }
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}