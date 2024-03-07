package com.bitcamp.api.product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ItemTest {

@Test
public void systemOut() {
    //List<Integer> numbers = List.of(1,2,3,4);
        Product s = new Product();
        String s3 = s.systemOut();
    System.out.println("-->"+s3);
        String s2 = "Hello";
        Assertions.assertEquals(s.systemOut(), "Hello");
    }
}