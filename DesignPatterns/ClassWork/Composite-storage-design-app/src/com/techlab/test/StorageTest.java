package com.techlab.test;

import com.techlab.File;
import com.techlab.Folder;

public class StorageTest {

	public static void main(String[] args) {

		Folder movieFolder = new Folder("movie");
		Folder actionFolder = new Folder("action");
		Folder comedyFolder = new Folder("comedy");
		Folder subFolder = new Folder("SubFolder-Action");

		File abcFile = new File("abc", 100, "avi");
		File defFile = new File("def", 100, "mp4");
		File mnoFile = new File("mno", 100, "avi");
		File pqrFile = new File("pqr", 100, "mp4");
		File xyzFile = new File("xyz", 100, "avi");
		File ghiFile = new File("ghi", 100, "mp4");

		actionFolder.addChildren(abcFile);
		actionFolder.addChildren(defFile);
		actionFolder.addChildren(mnoFile);

		comedyFolder.addChildren(pqrFile);
		comedyFolder.addChildren(xyzFile);
		comedyFolder.addChildren(ghiFile);

		actionFolder.addChildren(subFolder);
		subFolder.addChildren(ghiFile);
		
		
		movieFolder.addChildren(actionFolder);
		movieFolder.addChildren(comedyFolder);

		movieFolder.display();

	}

}
