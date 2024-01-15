package org.ranasoftcraft.com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@ExtendWith(MockitoExtension.class) @Slf4j
public class TestNgTestCases {


    @BeforeTest
    public void bootstarp() {
        log.info("bootstarp the test cases .... ");
    }


    @Test
    public void repoTest2() {
        Assert.assertEquals(true, true);
    }



    @AfterSuite
    public void afterSuite() {
        log.info("Tear down ...");
    }
}
