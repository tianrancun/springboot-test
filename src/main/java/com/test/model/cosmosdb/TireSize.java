package com.test.model.cosmosdb;

import com.microsoft.azure.documentdb.IndexingMode;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.DocumentIndexingPolicy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Document(collection = "tireSize")
@DocumentIndexingPolicy(mode = IndexingMode.Consistent)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TireSize {
	
	@Id
	private String id;
	private String tireSize;
	private String width;
	private String ratio;
	private String rim;

	@Override
	public String toString() {
		return String.format("id:=%s, tireSize:=%s, width=%s, ratio=%s, rim=%s",
				this.id,this.tireSize,this.width,this.ratio,this.rim);
	}
}
