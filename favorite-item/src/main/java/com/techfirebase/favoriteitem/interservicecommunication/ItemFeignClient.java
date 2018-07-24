package com.techfirebase.favoriteitem.interservicecommunication;

import com.techfirebase.favoriteitem.dto.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:50:18)
 */
@FeignClient("item-catalog")
public interface ItemFeignClient {
  @GetMapping("/item/all")
  List<Item> getItems();
}
