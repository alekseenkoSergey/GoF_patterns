package main.composite;

import java.util.List;

public class Folder extends Component {

	private List<Component> components;

	public Folder(List<Component> components) {
		this.components = components;
	}

	@Override
	public int getSize() {
		return components
				.stream()
				.mapToInt(Component::getSize)
				.sum();
	}
}
