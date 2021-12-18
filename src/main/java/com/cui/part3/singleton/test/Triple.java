package com.cui.part3.singleton.test;

public class Triple {

    private static Triple[] triples = new Triple[3];

    private Triple() {

    }

    public static Triple getInstance(int id) {
        if (id > 2 || id < 0)
            throw new IllegalArgumentException("id不合法");
        if (triples[id] == null)
            triples[id] = new Triple();
        return triples[id];
    }
}
