import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class N_FilePaths
{
	public static void main(String[] args)
	{
		// To read a file path from the system, you can use the File System library
		
		// This creates a new FileSystem object (remember to import both FileSystem and FileSystems!)
		FileSystem fileSystem = FileSystems.getDefault();

		// This prints out the path of the top level class being used
        	System.out.println(fileSystem.getPath("").toAbsolutePath().toString());

		// Below the top level class, we control the file structure, so we can now add our internal file path to the end
		String topLevelPath = fileSystem.getPath("").toAbsolutePath().toString();
		String internalPath = "your/file/path/here.txt";
		String path = topLevelPath.concat(internalPath);
		System.out.println("Your full path is: " + path);
	}
}
