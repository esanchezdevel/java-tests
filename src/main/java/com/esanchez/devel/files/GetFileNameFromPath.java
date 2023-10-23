package com.esanchez.devel.files;

import org.apache.commons.io.FilenameUtils;

public class GetFileNameFromPath {

	public static void main(String[] args) {
		
		String path1 = "/temp/path/file.xml";
		String fileName1 = FilenameUtils.getName(path1);
		
		System.out.println("filename 1: " + fileName1);
		
		String path2 = "/temp/path/folder";
		String fileName2 = FilenameUtils.getName(path2);
		
		System.out.println("filename 2: " + fileName2);
		
		String path3 = "file.xml";
		String fileName3 = FilenameUtils.getName(path3);
		
		System.out.println("filename 3: " + fileName3);
		
		String path4 = "folder";
		String fileName4 = FilenameUtils.getName(path4);
		
		System.out.println("filename 4: " + fileName4);
	} 
}
