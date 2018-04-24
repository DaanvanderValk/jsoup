/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:19:06 GMT 2018
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueryParser_ESTest extends QueryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("soL#IKo;W");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'soL#IKo;W': unexpected token at ';W'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(",c%va<(f%{");
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '{'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("[^%s");
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%s'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s$=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s~=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[^%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("A[0R8H#uU;p5]Q{HZ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'A[0R8H#uU;p5]Q{HZ': unexpected token at '{HZ'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("*1|7UFk7g1");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matchText");
      assertEquals(":matchText", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":root");
      assertEquals(":root", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":empty");
      assertEquals(":empty", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":only-of-type");
      assertEquals(":only-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":only-child");
      assertEquals(":only-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":last-of-type");
      assertEquals(":last-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":first-of-type");
      assertEquals(":first-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":last-child");
      assertEquals(":last-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":first-child");
      assertEquals(":first-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-child(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-child(%d)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '%d': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":matchesOwn(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matches(regex) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":containsOwn(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":contains(text) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s!=u%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("*|a6");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("yP+JX()/,.v7Z,GL9");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'JX()/': unexpected token at '()/'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("c,b-4");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("x+gkZ2uxrC");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("T>R>");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '': unexpected token at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("1~*a6");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(">[KaPk+8J_");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at 'KaPk+8J_'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":not(selector) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("CF.r8ZW4Qc|o)p");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query 'CF.r8ZW4Qc|o)p': unexpected token at '|o)p'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":has(el)8subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":gt(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":lt(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":containsData(text) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":eq(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }
}