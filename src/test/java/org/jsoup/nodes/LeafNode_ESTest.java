/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:39:31 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LeafNode_ESTest extends LeafNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comment comment0 = new Comment(")AxYB&?&us-H5[]", "`h*sB");
      assertNotNull(comment0);
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      
      List<Node> list0 = comment0.ensureChildNodes();
      assertNotNull(list0);
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("#doctype", "#doctype", "#doctype");
      assertNotNull(documentType0);
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      
      boolean boolean0 = documentType0.hasAttributes();
      assertTrue(boolean0);
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comment comment0 = new Comment("", "");
      assertNotNull(comment0);
      assertFalse(comment0.hasParent());
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      
      boolean boolean0 = comment0.hasAttributes();
      assertFalse(boolean0);
      assertFalse(comment0.hasParent());
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comment comment0 = new Comment(")AxYB&?&us-H5[]", "`h*sB");
      assertNotNull(comment0);
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      
      boolean boolean0 = comment0.hasAttr("#comment");
      assertTrue(boolean0);
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("org.jsoup.nodes.LeafNode", "+q0G-GXP(-=b^i/");
      assertNotNull(textNode0);
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      
      boolean boolean0 = textNode0.hasAttr("c\"a(c)");
      assertFalse(boolean0);
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comment comment0 = new Comment("jp\"i}YZR&DxZMv", ")AxYB&?&us-H5[]");
      assertNotNull(comment0);
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      
      comment0.coreValue((String) null);
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      
      String string0 = comment0.coreValue();
      assertNull(string0);
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = new TextNode("1S^be");
      assertNotNull(textNode0);
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      
      String string0 = textNode0.coreValue();
      assertEquals("1S^be", string0);
      assertNotNull(string0);
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comment comment0 = new Comment("", "");
      assertNotNull(comment0);
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      
      String string0 = comment0.coreValue();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("org.jsoup.nodes.LeafNode");
      assertNotNull(cDataNode0);
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertFalse(cDataNode0.hasParent());
      
      int int0 = cDataNode0.childNodeSize();
      assertEquals(0, int0);
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertFalse(cDataNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null, "#declaration");
      assertNotNull(dataNode0);
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      
      Attributes attributes0 = dataNode0.attributes();
      assertNotNull(attributes0);
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comment comment0 = new Comment(")AxYB&?&us-H5[]", "`h}6d*AB");
      assertNotNull(comment0);
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      
      DataNode dataNode0 = new DataNode("org.jsoup.nodes.LeafNode", "org.jsoup.nodes.LeafNode");
      assertNotNull(dataNode0);
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertEquals(0, dataNode0.siblingIndex());
      
      comment0.setParentNode(dataNode0);
      assertEquals(0, comment0.siblingIndex());
      assertTrue(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertEquals(0, dataNode0.siblingIndex());
      
      Node node0 = comment0.attr("`h}6d*AB", ")AxYB&?&us-H5[]");
      assertNotNull(node0);
      assertEquals(0, comment0.siblingIndex());
      assertTrue(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      assertEquals(0, node0.siblingIndex());
      assertTrue(node0.hasParent());
      assertEquals("#comment", node0.nodeName());
      assertSame(comment0, node0);
      assertSame(node0, comment0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comment comment0 = new Comment(")AxYB&?&us-H5[]", "`h*sB");
      assertNotNull(comment0);
      assertEquals("#comment", comment0.nodeName());
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      
      Node node0 = comment0.attr("`h*sB", ")AxYB&?&us-H5[]");
      assertNotNull(node0);
      assertEquals("#comment", comment0.nodeName());
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertFalse(node0.hasParent());
      assertEquals(0, node0.siblingIndex());
      assertEquals("#comment", node0.nodeName());
      assertSame(comment0, node0);
      assertSame(node0, comment0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, "", "#comment");
      assertNotNull(documentType0);
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      
      // Undeclared exception!
      try { 
        documentType0.removeAttr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode(":ep%@J^rpO3wVDZf-");
      assertNotNull(cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      
      // Undeclared exception!
      try { 
        cDataNode0.hasAttr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comment comment0 = new Comment("le;gnd", "le;gnd");
      assertNotNull(comment0);
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      
      // Undeclared exception!
      try { 
        comment0.attr((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("nohref", "abbr", "", "hr]?qZy]--*Y[", (String) null);
      assertNotNull(documentType0);
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      
      // Undeclared exception!
      try { 
        documentType0.attr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration(".T=:o9BbyXDgz{3Q{", true);
      assertNotNull(xmlDeclaration0);
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertFalse(xmlDeclaration0.hasParent());
      
      // Undeclared exception!
      try { 
        xmlDeclaration0.absUrl((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration(".T=:o9BbyXDgz{3Q{", true);
      assertNotNull(xmlDeclaration0);
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertFalse(xmlDeclaration0.hasParent());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      
      Attributes attributes0 = xmlDeclaration0.attributes();
      assertNotNull(attributes0);
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertFalse(xmlDeclaration0.hasParent());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertEquals(1, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode(".w!_l_");
      assertNotNull(cDataNode0);
      assertEquals("#cdata", cDataNode0.nodeName());
      assertFalse(cDataNode0.hasParent());
      assertEquals(0, cDataNode0.siblingIndex());
      
      Document document0 = Document.createShell("");
      assertNotNull(document0);
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(1, document0.childNodeSize());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.siblingIndex());
      assertEquals("", document0.baseUri());
      assertFalse(document0.isBlock());
      
      Document document1 = (Document)document0.appendChild(cDataNode0);
      assertNotNull(document1);
      assertEquals(1, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertTrue(cDataNode0.hasParent());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals(2, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.hasParent());
      assertEquals(0, document0.siblingIndex());
      assertEquals("", document0.baseUri());
      assertFalse(document0.isBlock());
      assertEquals("", document1.baseUri());
      assertFalse(document1.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
      assertFalse(document1.hasParent());
      assertEquals(2, document1.childNodeSize());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals("#document", document1.nodeName());
      assertEquals(0, document1.siblingIndex());
      assertEquals("", document1.location());
      assertSame(document0, document1);
      assertSame(document1, document0);
      
      CDataNode cDataNode1 = (CDataNode)cDataNode0.after("colgroup");
      assertNotNull(cDataNode1);
      assertEquals(1, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertTrue(cDataNode0.hasParent());
      assertTrue(cDataNode1.hasParent());
      assertEquals("#cdata", cDataNode1.nodeName());
      assertEquals(1, cDataNode1.siblingIndex());
      assertSame(cDataNode0, cDataNode1);
      assertSame(cDataNode1, cDataNode0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null);
      assertNotNull(dataNode0);
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      
      String string0 = dataNode0.baseUri();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DataNode dataNode0 = new DataNode(",L/Y=$g+G$m:#vnmq+", "I>zn<");
      assertNotNull(dataNode0);
      assertEquals(0, dataNode0.siblingIndex());
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      
      String string0 = dataNode0.attr(",L/Y=$g+G$m:#vnmq+");
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(0, dataNode0.siblingIndex());
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", false);
      assertNotNull(xmlDeclaration0);
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertFalse(xmlDeclaration0.hasParent());
      
      xmlDeclaration0.doSetBaseUri("");
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertFalse(xmlDeclaration0.hasParent());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", (String) null);
      assertNotNull(textNode0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      
      String string0 = textNode0.absUrl("+kMZJ/p2'nL8Y-R=");
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comment comment0 = new Comment("#declaration", "#declaration");
      comment0.removeAttr("#declaration");
  }
}
