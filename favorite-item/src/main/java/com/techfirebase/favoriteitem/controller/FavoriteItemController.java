package com.techfirebase.favoriteitem.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.techfirebase.favoriteitem.dto.Item;
import com.techfirebase.favoriteitem.interservicecommunication.ItemFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:50:11)
 */
@RestController
@RequestMapping("/fav-item")
public class FavoriteItemController {
  private ItemFeignClient itemFeignClient;

  public FavoriteItemController(ItemFeignClient itemFeignClient) {
    this.itemFeignClient = itemFeignClient;
  }

  @GetMapping("/all")
  @HystrixCommand(fallbackMethod = "fallback")
  public List<Item> getAllFavItems() {
    return itemFeignClient
        .getItems()
        .stream()
        .filter(this::isFavorite)
        .collect(Collectors.toList());
  }

  public List<Item> fallback() {
    return new ArrayList<>();
  }

  private boolean isFavorite(Item item) {
    return item.getItemName().equals("Beer") || item.getItemName().equals("Wine");
  }
}
