package org.demo.utilities;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import junit.framework.Assert;

import org.junit.Test;



import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class TestJUNITBrowser {

    @Test
    public void testgetElements() throws Exception {
        try (final WebClient webClient = new WebClient()) {
            final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net/gettingStarted.html");
            final HtmlElement div = page.getHtmlElementById("bannerLeft");
            assertEquals("Equality", "bannerLeft",div.getId()); 
        }
    }

@Test
public void test_one() throws FailingHttpStatusCodeException, MalformedURLException, IOException { 
    try (final WebClient webClient = new WebClient()) {
        final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
        //assertTrue(page.getTitleText().contains("Welcome to HtmlUnit"));
      //System.out.println(page.getTitleText());
      Assert.assertEquals("HtmlUnit – Welcome to HtmlUnit", page.getTitleText());
        final String pageAsXml = page.asXml();
        //System.out.println(page.asXml());
       Assert.assertTrue(pageAsXml.contains("All rights reserved."));
       	//System.out.println("SSDD");
        final String pageAsText = page.asText();
        Assert.assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
    }
   
}

}
