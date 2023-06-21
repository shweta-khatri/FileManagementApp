package com.org.khatri.utils;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {

	public static boolean createFolder(String fullFolderPath) {
		File f = new File(fullFolderPath);
		boolean isCreated = false;
		try {
			isCreated = f.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	public static List<String> getFileNamesInFolder(String fullFolderPath) {
		return Stream.of(new File(fullFolderPath).listFiles()).filter(file -> !file.isDirectory()).map(File::getName)
				.collect(Collectors.toList());

	}

	public static boolean addFileInFolder(String fullFolderPath, String fileName) {
		File file = new File(fullFolderPath + "\\" + fileName); // initialize File object and passing path as argument
		boolean isCreated = false;
		try {
			isCreated = file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isCreated;
	}

	public static boolean deleteFileFromFolder(String fullFolderPath, String fileName) {
		File file = new File(fullFolderPath + "\\" + fileName);
		boolean isDeleted = false;
		try {
			isDeleted = file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
