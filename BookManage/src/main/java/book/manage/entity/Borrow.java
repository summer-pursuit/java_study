package book.manage.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Borrow {
    int id;
    Student student;
    Book book;

}
