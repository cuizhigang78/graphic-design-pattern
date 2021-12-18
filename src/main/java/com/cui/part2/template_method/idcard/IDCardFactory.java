package com.cui.part2.template_method.idcard;

import com.cui.part2.template_method.framework.Factory;
import com.cui.part2.template_method.framework.Product;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
