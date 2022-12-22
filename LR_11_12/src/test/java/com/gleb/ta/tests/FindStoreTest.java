package com.gleb.ta.tests;

import com.gleb.ta.page.FindAStore;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class FindStoreTest extends CommonConditions {
    //поиск товаров
    @Test
    public void findAStore() throws InterruptedException {
        assertThat(new FindAStore(driver)
                .openPage()
                .findAStore()).isNotNull();
    }
}