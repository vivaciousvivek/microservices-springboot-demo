package com.techfirebase.itemcatalog.repository;

import com.techfirebase.itemcatalog.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:46:41)
 */
public interface ItemRepository extends JpaRepository<Item, Long> {}
