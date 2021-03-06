/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:31:23 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(34);
      assertEquals("quot", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      int int0 = entities_EscapeMode0.codepointForName("!KJ,");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Entities.unescape("", false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Entities.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Entities.escape((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.unescape((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.isNamedEntity((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.isBaseNamedEntity((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.getCharacterByName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.getByName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.escape("html", (Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "{B?\"gg,z{");
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) charBuffer0, ".XNBu14^S", document_OutputSettings0, false, false, false);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) charBuffer0, ",3)2T$oT1Gv<-HX1", document_OutputSettings0, false, false, false);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        Entities.codepointsForName((String) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\"{");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringBuilder0, "%\"", document_OutputSettings0, false, true, true);
      assertEquals("\"{%\"", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      StringBuilder stringBuilder0 = new StringBuilder(819);
      Entities.escape((Appendable) stringBuilder0, " />", document_OutputSettings0, false, false, false);
      assertEquals(" /&gt;", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) null, "&quot;", document_OutputSettings0, true, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = Entities.codepointsForName("gt", intArray0);
      assertArrayEquals(new int[] {62, 0}, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Entities.isBaseNamedEntity("UTF-xW '{dwMP;-TalI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Entities.isBaseNamedEntity("nbsp");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("i6O99ZQs M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities.CoreCharset.byName("");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\"{");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("ascii");
      Entities.escape((Appendable) stringBuilder0, "%\"", document_OutputSettings1, true, true, true);
      assertEquals("\"{%&quot;", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(128);
      document_OutputSettings1.encoder();
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      StringBuilder stringBuilder0 = new StringBuilder(128);
      Entities.escape((Appendable) stringBuilder0, "Must be true", document_OutputSettings0, false, false, false);
      assertEquals("Must be true", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(128);
      document_OutputSettings1.encoder();
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.ascii;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      String string0 = Entities.escape("!{D)(tNiIftkT ", document_OutputSettings1);
      assertEquals("!{D)(tNiIftkT ", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = Entities.escape(">kq<sONX2|}");
      assertEquals("&gt;kq&lt;sONX2|}", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\"{");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringBuilder0, "gidth must9be  0", document_OutputSettings0, true, true, true);
      assertEquals("\"{gidth must9be 0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\"{");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringBuilder0, "width must be > 0", document_OutputSettings0, true, true, true);
      assertEquals("\"{width must be > 0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      StringBuilder stringBuilder0 = new StringBuilder(128);
      Entities.escape((Appendable) stringBuilder0, "MuoLst be true", document_OutputSettings0, false, true, false);
      assertEquals("MuoLst be true", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      String string0 = Entities.escape((String) null, document_OutputSettings0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = Entities.codepointsForName("{B?\"gg,z{", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = Entities.getByName("&gt;kq&lt;sONX2|}");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("gt");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = Entities.unescape("&Wuot;", true);
      assertEquals("&Wuot;", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(128);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = Entities.unescape("&amp;quot;");
      assertEquals("&quot;", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = Entities.escape("&Wuot;");
      assertEquals("&amp;Wuot;", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Character character0 = Entities.getCharacterByName(" />");
      assertEquals('\uFFFF', (char)character0);
  }
}
