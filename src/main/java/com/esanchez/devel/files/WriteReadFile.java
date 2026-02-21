package com.esanchez.devel.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

/**
 * Notes/Tips:
 * ===========
 * When write, use options CREATE and APPEND together to create the file if it not exists and append the data if it exists
 * When read, use Files.lines because that uses an Stream that consumes less memory. A Files.readAllLines load all data 
 * in memory and with big files we can face a memory problem.
 * Also with Files.lines, we have to use try-with-resources to close the Stream at the end and avoid to block the file. 
 */
public class WriteReadFile {

	public static void main(String[] args) {
		String filename = "test-file.txt";
		
		write(filename, "hello world");
		write(filename, "\nThis is a new line");
		
		System.out.println("All data wrote");
		
		read(filename);
	}
	
	private static void write(String filename, String text) {
		Path path = Path.of(filename);
		try {
			Files.write(path, text.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			System.out.println("Write done...");
		} catch (IOException e) {
			System.out.println("Error appending in file." + e.getMessage());
		}
	}
	
	private static void read(String filename) {
		Path path = Path.of(filename);
		
		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(line -> System.out.println(line));
		} catch (IOException e) {
			System.out.println("Error reading file." + e.getMessage());
		}
	}
}
