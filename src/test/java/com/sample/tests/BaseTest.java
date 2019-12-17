package com.sample.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testng.annotations.BeforeSuite;

import java.io.File;

public class BaseTest {
    public BrowserWebDriverContainer container =
            new BrowserWebDriverContainer()
                    .withCapabilities(DesiredCapabilities.chrome())
                    .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL, new File("target"));

    @BeforeSuite
    public void beforeSuite() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}

