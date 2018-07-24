package com.techfirebase.itemcatalog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:46:34)
 */
@Entity
public class Item {
  @Id @GeneratedValue private Long itemId;

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
