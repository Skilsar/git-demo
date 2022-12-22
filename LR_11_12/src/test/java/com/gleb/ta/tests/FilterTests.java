package com.gleb.ta.tests;

import com.gleb.ta.page.FindAStore;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class FilterTests extends CommonConditions {
    //фильтрация по цене
    @Test
    public void checkFilter() throws InterruptedException {
        assertThat(new FindAStore(driver)
                .openPage()
                .FilterOnPrice()).isNotNull();
    }
}