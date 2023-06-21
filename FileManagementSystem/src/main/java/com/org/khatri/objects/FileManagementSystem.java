package com.org.khatri.objects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.org.khatri.utils.FileUtil;
import com.org.khatri.utils.SearchUtil;

public class FileManagementSystem {

	List<String> files = new LinkedList<>();
	public final String directory = System.getProperty("user.dir") + "\\AppFiles";

	public void addFileInDirectory(String fileName) {
		FileUtil.addFileInFolder(directory, fileName);

	}

	public int searchFileInDirectory(String fileName){
		listFilesInDirectory();

		int index = SearchUtil.linearSearch(files, fileName);
		if (index == -1) {
			System.out.println("The file " + fileName + " does not exist in the directory");
		} else 
			System.out.println("The file " + fileName + " is present in the directory at index " + index);
		return index;

	}

	public void deleteFilefromDirectory(String fileName) {
		if (searchFileInDirectory(fileName) != -1) {
			if (FileUtil.deleteFileFromFolder(directory, fileName))
				System.out.println("File is successfully deleted from directory");
			else
				System.out.println("Unable to delete file " + fileName + " from the directory");
		} 

	}

	public void listFilesInDirectory() {

		try {
			files = FileUtil.getFileNamesInFolder(directory);
		} catch (NullPointerException e) {
			FileUtil.createFolder(directory);
		}

	}

	public void printFilesInDirectorySorted() {
		listFilesInDirectory();
		List<String> sortedList = new LinkedList<String>(files);
		Collections.sort(sortedList);
		int i = 1;
		for (String file : sortedList) {
			System.out.println((i++) + ". " + file);
		}

	}

}
