package com.iftm.mscatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.mscatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {
		return Collections.singletonList(new CatalogItem("Igor", "Teste", 4));
	}
}
