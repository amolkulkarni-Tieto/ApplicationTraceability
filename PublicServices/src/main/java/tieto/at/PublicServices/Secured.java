package tieto.at.PublicServices;

import java.lang.annotation.*;
import javax.ws.rs.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
@NameBinding
public @interface Secured { }



