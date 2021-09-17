package com.chenwnag.unittesting.unittesting.data;

import com.chenwnag.unittesting.unittesting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {


}
