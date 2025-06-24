package com.hei.school;

import com.hei.school.endpoint.rest.controller.AdditionController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionControllerTest {
  private AdditionController subject = new AdditionController();

  @Test
  void test_addition() {
    Assertions.assertEquals(3, subject.addition(1, 2));
  }
}
