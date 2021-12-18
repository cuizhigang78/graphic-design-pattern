package com.cui.part2.template_method.framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    /**
     * 生成产品
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     * @param product
     */
    protected abstract void registerProduct(Product product);
}
