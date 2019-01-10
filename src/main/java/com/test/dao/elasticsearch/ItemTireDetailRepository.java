//package com.test.dao.elasticsearch;
//
//import com.test.model.elasticsearch.ItemTireDetailBO;
//import org.springframework.data.elasticsearch.annotations.Query;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//import java.util.List;
//
///**
// * @author vn0ow6b
// * @Title: BookRepository
// * @Description: TODO
// * @date 2019/1/2 16:05
// */
//public interface ItemTireDetailRepository extends ElasticsearchRepository<ItemTireDetailBO, String> {
//
//
////    List<Book> findByTitle(String title);
//     // @Query("\"_source\": [\"priceEndDate\",\"priceWithTax\",\"model\"]")
//      //@Query("select itemId from item_tire_detail")
//     // @Query("\"query\": {\"match\": {\"_id\":\"4969_237524\"}},\"_source\": [\"itemId\"]")
//   // @Query("{\"bool\" : {\"must\" : {\"field\" : {\"itemId\" : \"?0\"}}}}")
//    //  @Query("\"query\":{\"bool\" : {\"must\" : {\"term\" : {\"itemId\" : \"?0\"}}}}")
//      @Query("select itemId from item_tire_detail")
//      List findAll();
////
////    List<Book> findByNameOrPrice(String name, Integer price);
////
////    Page<Book> findByName(String name, Pageable page);
////
////    Page<Book> findByNameNot(String name,Pageable page);
////
////    Page<Book> findByPriceBetween(int price,Pageable page);
////
////    Page<Book> findByNameLike(String name,Pageable page);
////
////    @Query("{\"bool\" : {\"must\" : {\"term\" : {\"message\" : \"?0\"}}}}")
////    Page<Book> findByMessage(String message, Pageable pageable);
//}