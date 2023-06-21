package com.org.khatri;

import org.junit.Test;

import com.org.khatri.objects.FileManagementSystem;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestFiles {
	
	@Test
	public void testSearchExistingFile() {
		FileManagementSystem fms = new FileManagementSystem();
		Assert.assertEquals(fms.searchFileInDirectory("ABC.txt"),0);
	}
	
	
	@Test
	public void testSearchNonExistingFile() {
		FileManagementSystem fms = new FileManagementSystem();
		fms.deleteFilefromDirectory("XYZ.txt");
		Assert.assertEquals(fms.searchFileInDirectory("XYZ.txt"),-1);
		
	}
	

}
