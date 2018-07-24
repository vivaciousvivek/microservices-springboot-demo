package com.techfirebase.itemcatalog;

import com.techfirebase.itemcatalog.domain.Item;
import com.techfirebase.itemcatalog.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.stream.Stream;
/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:49:44)
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ItemCatalogApplication implements CommandLineRunner {

  private final ItemRepository itemRepository;

  public ItemCatalogApplication(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  /**
   * This override method of CommandLineRunner will be loaded after the application context is
   * loaded and just before the run method will execute
   *
   * @param args
   * @throws Exception
   */
  @Override
  public void run(String... args) throws Exception {
    // insert items into Item table
    Stream.of("Beer", "Wine", "Rum", "Whisky").forEach(item -> itemRepository.save(new Item(item)));

    // print all items inserted into Item table.
    itemRepository.findAll().forEach(System.out::println);
  }

  public static void main(String[] args) {
    SpringApplication.run(ItemCatalogApplication.class, args);
  }
}
