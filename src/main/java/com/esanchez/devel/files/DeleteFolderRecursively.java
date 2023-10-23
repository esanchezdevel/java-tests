package com.esanchez.devel.files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DeleteFolderRecursively {

	public static void main(String[] args) {
		
		String path = "/home/esanchez/test";
		
		try {
			//Delete the folder recursively and all the contents.
			FileUtils.deleteDirectory(new File(path));
			System.out.println("Deleted folder: " + path);
		} catch (IOException e) {
			System.out.println("Could not delete the folder " + path);
			e.printStackTrace();
		}
	}
}
