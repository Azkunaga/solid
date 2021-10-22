package lsk;

public class ReadOnlyProjectFile implements LoadableFile {
	public String filePath;
	
	public ReadOnlyProjectFile(String filePath) {
		this.filePath=filePath;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadFile() {
		System.out.println("file loaded from " + filePath);
		
	}

}
