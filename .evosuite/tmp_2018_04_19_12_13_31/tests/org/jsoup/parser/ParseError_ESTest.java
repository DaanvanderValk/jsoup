/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:44:46 GMT 2018
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatConversionException;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseError_ESTest extends ParseError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseError parseError0 = new ParseError(0, "T`6-$qbm");
      int int0 = parseError0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = new ParseError((-2346), "", objectArray0);
      int int0 = parseError0.getPosition();
      assertEquals((-2346), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1956), (String) null);
      parseError0.getErrorMessage();
      assertEquals((-1956), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = new ParseError((-2346), "", objectArray0);
      parseError0.getErrorMessage();
      assertEquals((-2346), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(473, "%Y;", objectArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = 'Y'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "9M^h&%c2d=zSd=_B)";
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, "9M^h&%c2d=zSd=_B)", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // c != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, ",g.%+s%", objectArray0);
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = s, Flags = +
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError((-480), (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      ParseError parseError0 = new ParseError(21, "", objectArray0);
      String string0 = parseError0.toString();
      assertEquals("21: ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, "}#%TD9p)3iG", objectArray0);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%TD'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseError parseError0 = new ParseError(883, "c");
      parseError0.getErrorMessage();
      assertEquals(883, parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParseError parseError0 = new ParseError(883, "c");
      int int0 = parseError0.getPosition();
      assertEquals(883, int0);
  }
}
