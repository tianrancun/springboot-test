//package com.test.model.elasticsearch;
//
//import com.alibaba.fastjson.JSONArray;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.elasticsearch.annotations.Document;
//
//import java.math.BigDecimal;
//
//
//@Setter
//@Getter
//@Document(indexName = "item_tire_detail_test",type = "_doc" , shards = 1, replicas = 0,  refreshInterval = "-1")
//public class ItemTireDetailBO {
//    private String id;
//
//    private String productId;
//    private String itemId;
//    private String upc;
//    private String productName;
//    private String brand;
//    private String supplierId;
//    private String itemStatus;
//    private String tireSize;
//    private JSONArray thumbnailUrl;
//    private String imgUrl;
//    private String shortDescription;
//    private String longDescription;
//    private String avgRating;
//    private Long warrantyInfo;
//    private String description;
//    private String keyWords;
//    private String offlineWhenOutOfStock;
//    private String tireSideWall;
//    private String tireDiameter;
//    private Integer daysAvailable;
//    private String salesTaxCode;
//    private String displayName;
//    private String displayNameSeo;
//    private String specifications;
//    private String model;
//    private String tireLoadIndex;
//    private String metaDescription;
//    private String season;
//    private String eps;
//
//    private String clubId;
//    private BigDecimal priceWithoutTax;
//    private Integer inClubInventory;
//    private Integer specialOrderInventory;
//
//    private Long priceStartDate;
//    private Long priceEndDate;
//    private BigDecimal priceWithTax;
//    private BigDecimal wasPrice;
//    private BigDecimal taxRate;
//    private String stockStatus;
//    private Long lastUpdatedTime;
//
//    private Boolean isSpecialOrder;
//    private Integer winterTraction;
//    private Integer nonPavedRoads;
//    private Integer wetRoadHanding;
//    private Integer rideComfort;
//    private Integer mileageWarranty;
//
//    public ItemTireDetailBO() {
//    }
//
//    public static ItemTireDetailBO withPrimaryKey(String clubId, long itemId) {
//        ItemTireDetailBO item = new ItemTireDetailBO();
//        item.id = clubId + "_" + itemId;
//        item.clubId = clubId;
//        item.itemId = itemId + "";
//        return item;
//    }
//}