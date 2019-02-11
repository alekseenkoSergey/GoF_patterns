package main.composite;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		File file1 = new File(1);
		File file2 = new File(2);
		Folder folderA = new Folder(Arrays.asList(file1, file2));

		File file3 = new File(3);
		File file4 = new File(4);
		Folder folderB = new Folder(Arrays.asList(file3, file4));

		File file5 = new File(5);
		File file6 = new File(6);
		Folder folderC = new Folder(Arrays.asList(file5, file6));

		File file11 = new File(10);
		Folder folderAD = new Folder(Arrays.asList(file11, folderA, folderB, folderC));

		File file111 = new File(100);
		Folder folderRoot = new Folder(Arrays.asList(file111, folderAD));

		System.out.println(folderRoot.getSize());
	}
}
