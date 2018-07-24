package com.techfirebase.favoriteitem.dto;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-24 21:57:58)
 */
public class Item {
  private Long itemId;

  private String itemName;

  public Item() {}

  public Item(String itemName) {
    this.itemName = itemName;
  }

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  @Override
  public String toString() {
    return "Item{" + "itemId=" + itemId + ", itemName='" + itemName + '\'' + '}';
  }
}
