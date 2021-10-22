package lsk;

public class ProjectFile implements StorableFile, LoadableFile {
	public String filePath;

	public ProjectFile(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void loadFile() {
		System.out.println("file loaded from " + filePath);
	}

	@Override
	public void storeFile() {
		System.out.println("file saved to " + filePath);
	}


}
