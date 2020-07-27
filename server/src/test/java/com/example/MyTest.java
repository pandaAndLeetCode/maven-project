package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class MyTest {


  final String magicWord = "CORRECT";
  String currentWord = "ANOTHER WRONG WORD";
  
  @Test
  public void verifyCurrentWord() {
    assertEquals(magicWord,currentWord);
  }
}
