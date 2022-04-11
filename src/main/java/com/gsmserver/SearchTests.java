package com.gsmserver;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {

    @Test
    void searchProductByTitle(){
        open("https://gsmserver.com");
        $("[name=searchword]").val("Z3X Easy");

    }
}
