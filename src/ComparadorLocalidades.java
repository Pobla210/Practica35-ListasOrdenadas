import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ComparadorLocalidades implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        Collator c = Collator.getInstance(new Locale("es", "ES"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(o1, o2);
    }
}