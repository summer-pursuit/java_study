package org.study.mapper;

import org.apache.ibatis.annotations.*;
import org.study.entity.Book;
import org.study.entity.Borrow;

import java.util.List;

public interface BookMapper {
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "sid",property = "sid"),
            @Result(column = "bid",property = "bid"),
            @Result(column = "time",property = "time"),
            @Result(column = "name",property = "studentName"),
            @Result(column = "title",property = "bookName"),
    })

    @Select("""
select * from borrow left join student on borrow.sid=student.sid
 left join book on book.bid=borrow.bid
""")
    List<Borrow> getBorrowList();
    @Insert("insert into borrow(sid,bid,time) values(#{sid},#{bid},NOW())")
    void addBorrow(@Param("sid") int sid,@Param("bid") int bid);

    @Delete("delete from borrow where id=#{id}")
    void deleteBorrow(int id);


    @Select("select * from book")
    List<Book> getBookList();

    @Delete("delete from book where bid=#{bid}")
    void deleteBook(int bid);

    @Insert("insert into book(title,`desc`,price) values(#{title},#{desc},#{price})")
    void addBook(@Param("title") String title,@Param("desc") String desc,@Param("price") double price);
}
