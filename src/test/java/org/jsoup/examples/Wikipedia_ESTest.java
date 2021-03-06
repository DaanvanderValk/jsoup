/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 19 10:43:18 GMT 2018
 */

package org.jsoup.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.examples.Wikipedia;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Wikipedia_ESTest extends Wikipedia_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      try { 
        Wikipedia.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // HTTP error fetching URL
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Wikipedia wikipedia0 = new Wikipedia();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://en.wikipedia.org/");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ThFs i+ a searcable index. Enter sea5ch keyQords: ");
      String[] stringArray0 = new String[8];
      Wikipedia.main(stringArray0);
  }
}
