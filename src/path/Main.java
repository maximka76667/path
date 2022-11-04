package path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Usuario\\Documents");

		// Main methods
		System.out.println("Path: " + path);
		System.out.println("Requesting file name: " + path.getFileName());
		System.out.println("First file on the path: " + path.getName(0));
		System.out.println("Root element: " + path.getRoot());
		System.out.println("Count of files on the path: " + path.getNameCount());
		System.out.println("Parent of requesting file: " + path.getParent());

		// Resolve (add path to the end)
		Path resolvedPath = path.resolve("fichero.txt");
		System.out.println(resolvedPath);

		// System path of this package
		Path systemPath = Paths.get(System.getProperty("user.dir"));
		System.out.println(systemPath);
	}

}
