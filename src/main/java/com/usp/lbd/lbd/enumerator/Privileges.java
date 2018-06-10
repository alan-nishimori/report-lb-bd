package com.usp.lbd.lbd.enumerator;

import lombok.Getter;

import java.util.List;

@Getter
public enum Privileges {
    SHIPPING(List.of("/report/product")),
    STOCKER(List.of("/report/procut", "/report/product/simulation")),
    FULL(List.of("*")),
    CLIENT(List.of("none"));

    private List<String> pages;

    Privileges(List<String> pages) {
        this.pages = pages;
    }
}
