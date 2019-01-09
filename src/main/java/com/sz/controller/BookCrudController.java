package com.sz.controller;

import com.sz.dao.BookRepository;
import com.sz.model.Book;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author vn0ow6b
 * @Title: BookCrudController
 * @Description: TODO
 * @date 2019/1/2 16:40
 */
@RestController
@RequestMapping("/es/demo")
public class BookCrudController {

    @Autowired
    private TransportClient client;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 按id查询
     * @param id
     * @return
     */
    @GetMapping("/get/book/novel")
    public ResponseEntity searchById(@RequestParam("id") String id) {
        if (id.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        // 通过索引、类型、id向es进行查询数据
        GetResponse response = client.prepareGet("book", "_doc", id).get();

        if (!response.isExists()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        // 返回查询到的数据
        return new ResponseEntity(response.getSource(), HttpStatus.OK);
    }

    /**
     * 添加书籍数据
     *
     * @param title       书籍标题
     * @param author      书籍作者
     * @param wordCount   书籍字数
     * @param publishDate 发行时间
     * @return
     */
    @PostMapping("/add/book/novel")
    public ResponseEntity add(@RequestParam("title") String title,
                              @RequestParam("author") String author,
                              @RequestParam("word_count") int wordCount,
                              @RequestParam("publish_date")
                              @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
                                      Date publishDate) {
        try {
            // 将参数build成一个json对象
            XContentBuilder content = XContentFactory.jsonBuilder()
                    .startObject()
                    .field("title", title)
                    .field("author", author)
                    .field("word_count", wordCount)
                    .field("publish_date", publishDate.getTime())
                    .endObject();

            IndexResponse response = client.prepareIndex("book", "_doc")
                    .setSource(content)
                    .get();

            return new ResponseEntity(response.getId(), HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add/addbook")
    public ResponseEntity addBook(){
        /*Book book =Book.builder()
                .id("1")
                .title("buildBook")
                .author("dj")
                .publishDate(new Date())
                .wordCount(200)
                .build();
       // ElasticsearchTemplate.
       // elasticsearchTemplate.query
      //  Object book2 = elasticsearchCrudRepository.save(book);
       // bookRepository;
        Book book1 = bookRepository.save(book);
        System.out.println(book1);*/
        return new ResponseEntity("1", HttpStatus.OK);
    }

    @PostMapping("/add/addbook2")
    public ResponseEntity addBook2(){
       /* List<IndexQuery> indexQueries = new ArrayList<IndexQuery>();
        //first document
        Book book = Book.builder().id("123456").title("build2").build();


        IndexQuery indexQuery1 = new IndexQueryBuilder().withIndexName("book2").withType("_doc").withId(book.getId()).withObject(book).build();
        indexQueries.add(indexQuery1);

        //second document
        Book book2 = Book.builder().id("123457").title("build3").build();

        IndexQuery indexQuery2 = new IndexQueryBuilder().withIndexName("book2").withType("_doc").withId(book2.getId()).withObject(book2).build();
        indexQueries.add(indexQuery2);

        //bulk index
        elasticsearchTemplate.bulkIndex(indexQueries);*/
        return new ResponseEntity("1", HttpStatus.OK);
    }

    @GetMapping(value = "/get/book")
    public void findByName(){
        System.out.println("start ");
        //@RequestParam String name
        List<Book> list =bookRepository.findByTitle("abc");

        list.forEach((book)-> System.out.println(book));
    }
}