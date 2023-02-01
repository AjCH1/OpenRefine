package com.google.refine.importing;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.refine.importers.ImporterTest;
import com.google.refine.importing.ImportingUtilities;

import org.apache.commons.fileupload.FileUploadException;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
public class PartitioningTest extends ImporterTest{
  
  @Override
  @BeforeMethod
  public void setUp() {
      super.setUp();
  }

  @Test
  public void aEqualsOne(){
    int a = 1;

    assertEquals(1, a);
  }


  @Test
  public void clipBoardTest1(){

    

    try{
      ImportingUtilities.retrieveContentFromPostRequest(null, bindings, workspaceDir, options, null);
    }
    catch(IOException | FileUploadException e){
      e.printStackTrace();
    }
  }
}
