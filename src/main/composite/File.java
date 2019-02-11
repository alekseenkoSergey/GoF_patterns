package main.composite;

public class File extends Component {

	private int size;

	public File(int size) {
		this.size = size;
	}

	@Override
	public int getSize() {
		return size;
	}
}
