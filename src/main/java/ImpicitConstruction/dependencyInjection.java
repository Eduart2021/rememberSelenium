package ImpicitConstruction;

import java.text.DateFormat;
import java.util.Date;

public class dependencyInjection {

    private final DateFormat format;

    public dependencyInjection(final DateFormat format){
        this.format = format;
    }

    public String format(final Date date){
        return format.format(date);
    }
}


