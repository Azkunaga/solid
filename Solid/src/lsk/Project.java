package lsk;

import java.util.Vector;

public class Project {
	public Vector<LoadableFile> loadFiles = new Vector<LoadableFile>();
	public Vector<StorableFile> storeFiles= new Vector<StorableFile>();

	public void addLoadableProject(LoadableFile p) {
		loadFiles.add(p);
	}
	
	public void addStorableProject(StorableFile p) {
		storeFiles.add(p);
	}

	public void loadAllFiles() {
		for (LoadableFile f : loadFiles)
			f.loadFile();
	}

	public void storeAllFiles() {
		for (StorableFile f : storeFiles)
			f.storeFile();
	}
}
