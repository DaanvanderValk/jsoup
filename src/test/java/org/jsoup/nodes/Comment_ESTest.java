/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:43:49 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Comment_ESTest extends Comment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Comment comment0 = new Comment("+");
      comment0.nodeName();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      document_OutputSettings1.syntax(document_OutputSettings_Syntax0);
      Comment comment0 = new Comment("~y7<kWTfK$", "~y7<kWTfK$");
      comment0.toString();
  }

  @Ignore
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      Document document0 = new Document("comment");
      document0.attributes();
      stringBuffer0.setLength(0);
      Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.quirks;
      stringBuffer0.appendCodePoint(0);
      stringBuffer0.insert(0, (Object) document_QuirksMode0);
      Document document1 = document0.quirksMode(document_QuirksMode0);
      document1.childNodesCopy();
      document0.appendChild(document1);
      document1.getElementsByAttributeStarting("f^(l5`");
      Document.OutputSettings document_OutputSettings0 = document1.outputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Document.OutputSettings document_OutputSettings1 = new Document.OutputSettings();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comment comment0 = new Comment("BE");
      comment0.parent();
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      DataNode dataNode0 = new DataNode("1'B0.xQXfJKSl)s");
      comment0.reparentChild(dataNode0);
      comment0.traverse(nodeVisitor0);
      comment0.toString();
      comment0.nodeName();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "1'B0.xQXfJKSl)s");
      StringBuffer stringBuffer1 = stringBuffer0.append((-2009.9));
      StringBuffer stringBuffer2 = stringBuffer1.appendCodePoint(0);
      StringBuffer stringBuffer3 = stringBuffer2.append('w');
      StringBuffer stringBuffer4 = stringBuffer3.append("#comment");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.prettyPrint(false);
      comment0.outerHtmlHead(stringBuffer4, 0, document_OutputSettings2);
  }

  @Ignore
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comment comment0 = new Comment("z", "?U+X,9U>bvap{(");
      Document.OutputSettings document_OutputSettings0 = comment0.getOutputSettings();
      comment0.outerHtmlHead((Appendable) null, 0, document_OutputSettings0);
      comment0.getData();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comment comment0 = new Comment("");
      comment0.toString();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comment comment0 = new Comment("", "org.jsoup.select.StructuralEvaluator$Has");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comment comment0 = new Comment("r[Hy4|!v", "r[Hy4|!v");
      comment0.getData();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comment comment0 = new Comment("<!doctype");
      comment0.nodeName();
  }

  @Ignore
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comment comment0 = new Comment("25");
      comment0.clearAttributes();
      comment0.toString();
      Appendable appendable0 = null;
      comment0.ownerDocument();
      comment0.doClone((Node) null);
      int int0 = (-1);
      Document.OutputSettings document_OutputSettings0 = comment0.getOutputSettings();
      comment0.outerHtmlTail((Appendable) null, (-1), document_OutputSettings0);
      Document.OutputSettings document_OutputSettings1 = comment0.getOutputSettings();
      comment0.outerHtmlHead((Appendable) null, (-1), document_OutputSettings1);
      // Undeclared exception!
      try { 
        comment0.outerHtmlHead(appendable0, int0, document_OutputSettings1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comment comment0 = new Comment((String) null, "");
      comment0.toString();
      StringBuffer stringBuffer0 = new StringBuffer();
      Document.OutputSettings document_OutputSettings0 = comment0.getOutputSettings();
      comment0.outerHtmlHead(stringBuffer0, 0, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comment comment0 = new Comment("=#070");
      comment0.getData();
  }

  @Ignore
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comment comment0 = new Comment("yc4r;gnB7<z");
      char[] charArray0 = new char[4];
      charArray0[0] = 'v';
      charArray0[1] = 'y';
      charArray0[2] = 'r';
      charArray0[3] = 'n';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = 39;
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(39);
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.outline(true);
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings3 = document_OutputSettings2.escapeMode(entities_EscapeMode0);
      comment0.outerHtmlHead(charBuffer0, 39, document_OutputSettings3);
      String string0 = "";
      document_OutputSettings0.charset(string0);
      comment0.toString();
      comment0.toString();
      comment0.outerHtmlTail(charBuffer0, int0, document_OutputSettings1);
      // Undeclared exception!
      try { 
        comment0.toString();
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comment comment0 = new Comment("", "k&B5+F3 EM_{bHxJ");
      StringBuilder stringBuilder0 = new StringBuilder("org.jsoup.nodes.Entities$EscapeMode");
      StringBuilder stringBuilder1 = stringBuilder0.insert(0, "");
      StringBuilder stringBuilder2 = stringBuilder1.append((Object) stringBuilder0);
      char[] charArray0 = new char[7];
      charArray0[0] = 'm';
      charArray0[1] = '#';
      charArray0[2] = 'V';
      charArray0[3] = 'V';
      charArray0[4] = ':';
      charArray0[5] = ']';
      charArray0[6] = '7';
      StringBuilder stringBuilder3 = stringBuilder2.append(charArray0);
      StringBuilder stringBuilder4 = stringBuilder3.append(false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(65535);
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.escapeMode(entities_EscapeMode0);
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.html;
      Document.OutputSettings document_OutputSettings3 = document_OutputSettings2.syntax(document_OutputSettings_Syntax0);
      Document.OutputSettings document_OutputSettings4 = document_OutputSettings3.prettyPrint(false);
      comment0.outerHtmlHead(stringBuilder4, 0, document_OutputSettings4);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comment comment0 = new Comment("");
      comment0.getData();
  }

  @Ignore
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comment comment0 = new Comment("AR$!.=B");
      comment0.nodeName();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      comment0.attributes();
      StringBuffer stringBuffer1 = stringBuffer0.insert(0, (CharSequence) "#comment", 0, 0);
      comment0.coreValue("#comment");
      Comment comment1 = new Comment("");
      comment1.setBaseUri("AR$!.=B");
      Document.OutputSettings document_OutputSettings0 = comment1.getOutputSettings();
      document_OutputSettings0.encoder();
      Document.OutputSettings document_OutputSettings1 = comment1.getOutputSettings();
      document_OutputSettings1.clone();
      stringBuffer1.insert(0, 2574.618212272782);
      stringBuffer1.delete(0, 0);
      stringBuffer0.append('K');
      comment0.outerHtmlHead(stringBuffer1, 0, document_OutputSettings0);
      document_OutputSettings0.encoder();
      comment0.outerHtmlHead(stringBuffer1, 0, document_OutputSettings0);
      comment0.outerHtmlHead(stringBuffer1, 0, document_OutputSettings0);
      comment1.nodeName();
      comment0.getData();
      comment1.outerHtmlHead(stringBuffer0, (-2158), document_OutputSettings1);
      int int0 = 0;
      comment1.outerHtmlTail(stringBuffer0, int0, document_OutputSettings0);
      comment0.nodeName();
      comment1.toString();
      comment1.toString();
      comment0.nodeName();
      comment1.getData();
  }

  @Ignore
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comment comment0 = new Comment("link", "o/_4+");
      Document document0 = Document.createShell("o/_4+");
      String string0 = "";
      Element element0 = document0.addClass("");
      element0.appendTo(document0);
      comment0.value = (Object) element0;
      element0.children();
      comment0.reparentChild(element0);
      comment0.getData();
      int int0 = 0;
      StringBuilder stringBuilder0 = null;
      try {
        stringBuilder0 = new StringBuilder(int0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.nodes.Document cannot be cast to java.lang.String
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Ignore
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comment comment0 = new Comment((String) null, "SofX]");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.indentAmount(1620);
      comment0.outerHtmlTail((Appendable) null, 1620, document_OutputSettings0);
      comment0.getData();
      comment0.outerHtmlHead((Appendable) null, 38, (Document.OutputSettings) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comment comment0 = new Comment("xmlns:", "");
      comment0.siblingIndex = 1404;
      comment0.shallowClone();
      comment0.value = (Object) "";
      comment0.attributes();
      comment0.nodeName();
      comment0.nodeName();
      comment0.getData();
      comment0.getData();
      comment0.nodeName();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "xmlns:");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(1404);
      comment0.outerHtmlHead(stringBuffer0, 1404, document_OutputSettings1);
  }
}
