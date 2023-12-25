package info.nahid.unitteast.business;

import info.nahid.unitteast.model.Item;
import info.nahid.unitteast.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemBusinessService {

    @Autowired
    ItemRepository itemRepository;

    public Item retreiveHardCodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems() {
        List<Item>  items = itemRepository.findAll();
        for (Item item : items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }
        return itemRepository.findAll();
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedItemData();
    }

    public void seedItemData() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item();
        item1.setId(10001);
        item1.setName("Item1");
        item1.setPrice(10);
        item1.setQuantity(10);
        item1.setValue(item1.getPrice() * item1.getQuantity());
        items.add(item1);

        Item item2 = new Item();
        item2.setId(10002);
        item2.setName("Item2");
        item2.setPrice(5);
        item2.setQuantity(10);
        item2.setValue(item2.getPrice() * item2.getQuantity());
        items.add(item2);

        Item item3 = new Item();
        item3.setId(10003);
        item3.setName("Item3");
        item3.setPrice(15);
        item3.setQuantity(2);
        item3.setValue(item3.getPrice() * item3.getQuantity());
        items.add(item3);
        itemRepository.saveAll(items);
    }

}
