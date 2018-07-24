package com.techfirebase.favoriteitem.dto;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:50:24)
 */
public class FavoriteItem {
  private String favItemName;

  public String getFavItemName() {
    return favItemName;
  }

  public void setFavItemName(String favItemName) {
    this.favItemName = favItemName;
  }

  @Override
  public String toString() {
    return "FavoriteItem{" + "favItemName='" + favItemName + '\'' + '}';
  }
}
