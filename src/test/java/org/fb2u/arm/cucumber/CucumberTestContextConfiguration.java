package org.fb2u.arm.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.fb2u.arm.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
