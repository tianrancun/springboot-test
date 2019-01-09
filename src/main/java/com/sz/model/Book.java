package com.sz.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "book",type = "_doc" , shards = 1, replicas = 0,  refreshInterval = "-1")
@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Id
    private String id;
    private String title;
    private String author;
    private Integer wordCount;
    private Date publishDate;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
