package mindnotes.shared.model;

import java.io.Serializable;

public class MindMap implements Serializable {

	private Node _rootNode;
	private String _title;

	public MindMap() {
		_rootNode = new Node();
		_rootNode.setText("Root");
		_rootNode.setNodeLocation(NodeLocation.ROOT);
	}

	/**
	 * 
	 * @return
	 */
	public Node getRootNode() {
		return _rootNode;
	}

	/**
	 * 
	 * @param rootNode
	 */
	public void setRootNode(Node rootNode) {
		_rootNode = rootNode;
		_rootNode.setNodeLocation(NodeLocation.ROOT);
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getTitle() {
		return _title;
	}

}