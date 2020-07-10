package com.epam.edu.spring.core.template.repository;

import com.epam.edu.spring.core.template.entity.Item;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Репозиторий, основанный на классе LinkedList.
 * initialSequence должен случайно генерироваться из диапазона от 1 до 100
 */
public class LinkedListItemRepository extends AbstractRepository<Item> implements ItemRepository {

    long initialSequence = new Random().nextInt(100);
    List<Item> holder = new LinkedList<>();

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
        this.holder = new LinkedList<>();
    }
}
