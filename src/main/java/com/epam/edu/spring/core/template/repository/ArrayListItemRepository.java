package com.epam.edu.spring.core.template.repository;

import com.epam.edu.spring.core.template.entity.Item;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий, основанный на классе ArrayList.
 * initialSequence должен браться из application.properties
 */
public class ArrayListItemRepository extends AbstractRepository<Item> implements ItemRepository {

    //??
    @Value("${initial.sequence}")
    long initialSequence;

    List<Item> holder = new ArrayList<>();

    @Override
    public Item getById(long id) {

        for (Item item: holder) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }

    @Override
    public boolean createItem(Item item) {
        return holder.add(item);
    }

    void setInitialSequence(int val) {
        this.initialSequence = val;
    }

    void setHolder() {
        this.holder = new ArrayList<>();
    }
}
