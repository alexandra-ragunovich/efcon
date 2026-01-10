package Module11.task3;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface departmentInfo {
    int year();
}
