package com.techfirebase.itemcatalog.controller;

import com.techfirebase.itemcatalog.domain.Item;
import com.techfirebase.itemcatalog.exception.ResourceNotFoundException;
import com.techfirebase.itemcatalog.repository.ItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:46:47)
 */
@RestController
@RequestMapping("/item")
public class ItemController {
  private ItemRepository itemRepository;

  public ItemController(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  @GetMapping("/all")
  public List<Item> getAllItems() {
    return itemRepository.findAll();
  }

  @GetMapping("/{itemId}")
  public Item getItem(@RequestParam long itemId) {
    return itemRepository
        .findById(itemId)
        .orElseThrow(() -> new ResourceNotFoundException("Item", "itemId", itemId));
  }

  @PostMapping
  public Item saveItem(@RequestBody Item item) {
    return itemRepository.save(item);
  }

  @PutMapping("/{itemId}")
  public Item updateItem(@RequestParam long itemId, @RequestBody Item newItem) {
    Item item =
        itemRepository
            .findById(itemId)
            .orElseThrow(() -> new ResourceNotFoundException("Item", "itemId", itemId));

    item.setItemName(newItem.getItemName());

    return itemRepository.save(item);
  }

  @DeleteMapping("/{itemId}")
  public ResponseEntity<?> deleteItem(@RequestParam long itemId) {
    Item item =
        itemRepository
            .findById(itemId)
            .orElseThrow(() -> new ResourceNotFoundException("Item", "itemId", itemId));
    itemRepository.delete(item);

    return ResponseEntity.ok().build();
  }
}
