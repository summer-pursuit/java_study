package Lombok;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString(of = {"name","sid"})

public class Student {
    Integer sid;
    String name;
    String sex;

}
