package com.netflax.content.model;

public enum ContentCategory {

    SERIES(1),
    DOCUMENTARIES(3),
    MOVIES(2);

    private int code;

    ContentCategory(int code) {

        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
