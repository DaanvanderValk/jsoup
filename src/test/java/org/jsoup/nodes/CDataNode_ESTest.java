/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:47:55 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CDataNode_ESTest extends CDataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
      Charset charset0 = document_OutputSettings1.charset();
      char[] charArray0 = new char[3];
      cDataNode0.outerHtml();
      charArray0[0] = 'I';
      charArray0[2] = 'I';
      charArray0[2] = 'V';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.compact();
      CharBuffer charBuffer1 = charBuffer0.duplicate();
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer1);
      CharBuffer charBuffer2 = byteBuffer0.asCharBuffer();
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlTail(charBuffer2, 1021, document_OutputSettings1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("(T)G@uV^kR\"{|0l>a]V");
      char[] charArray0 = new char[6];
      charArray0[0] = '%';
      charArray0[1] = '.';
      charArray0[2] = 'q';
      charArray0[3] = 'C';
      charArray0[4] = '^';
      charArray0[5] = '7';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      CharBuffer.wrap(charArray0);
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.escapeMode(entities_EscapeMode0);
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlHead(charBuffer0, (-1430), document_OutputSettings2);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("org.jsoup.nodes.TextNode");
      StringBuilder stringBuilder0 = new StringBuilder(0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(1);
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.html;
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.syntax(document_OutputSettings_Syntax0);
      Document.OutputSettings document_OutputSettings3 = document_OutputSettings2.clone();
      Charset charset0 = document_OutputSettings2.charset();
      Document.OutputSettings document_OutputSettings4 = document_OutputSettings3.charset(charset0);
      cDataNode0.outerHtmlTail(stringBuilder0, (-3093), document_OutputSettings4);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode((String) null);
      cDataNode0.coreValue();
      cDataNode0.text();
      // Undeclared exception!
      try { 
        cDataNode0.replaceWith(cDataNode0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      Document.OutputSettings document_OutputSettings0 = cDataNode0.getOutputSettings();
      Document document0 = new Document("QsK7");
      Charset charset0 = document0.charset();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.clone();
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlHead((Appendable) null, (-3873), document_OutputSettings2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.CDataNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("{'P>daR?V");
      cDataNode0.text();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      cDataNode0.nodeName();
      cDataNode0.text();
      cDataNode0.shallowClone();
      cDataNode0.nodeName();
      cDataNode0.text();
      cDataNode0.nodeName();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode((String) null);
      cDataNode0.nodeName();
      Appendable appendable0 = null;
      cDataNode0.value = (Object) null;
      int int0 = 1;
      Document.OutputSettings document_OutputSettings0 = cDataNode0.getOutputSettings();
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlTail((Appendable) null, 1, document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.CDataNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("]]>");
      cDataNode0.setBaseUri("]]>");
      cDataNode0.coreValue();
      cDataNode0.toString();
      cDataNode0.text();
      cDataNode0.childNodesCopy();
      cDataNode0.nodeName();
      cDataNode0.nodeName();
      cDataNode0.text();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "");
      StringBuffer stringBuffer1 = stringBuffer0.append('H');
      cDataNode0.outerHtmlHead(stringBuffer1, 2797, (Document.OutputSettings) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("]]>");
      cDataNode0.text();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("A{{E%.G_");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "A{{E%.G_");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.html;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      // Undeclared exception!
      try { 
        cDataNode0.outerHtmlTail(charBuffer0, 0, document_OutputSettings1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("mfFj'MxlGF5EKy3spZb");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("charset");
      cDataNode0.toString();
      cDataNode0.text();
      cDataNode0.getOutputSettings();
  }
}
