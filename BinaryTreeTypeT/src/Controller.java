
public class Controller {

	private BinaryTree<Human> familyTree;

	public Controller() {
		this.familyTree = new BinaryTree<Human>();
	}
	
// Ftiaxno ena oikogeniaki dentro xoris Taxinomisi opoy kathe proto paidi mpainei ston aritero komvo kai kathe deftero paidi ston dexiio toy progonou 
	public void saveAncestor(String personName, double personHeigth) {
		Human ancestor = new Human(personName,personHeigth);
		familyTree.createLeaf(ancestor);
	}
	
    public void saveChild(String parentName, String personName, double personHeigth) {
		BinaryTree parent = findByName(parentName);
		BinaryTree<Human> childTree = new BinaryTree<Human>(new Human(personName, personHeigth ));
		
		boolean iCant = false;
		if(parent.left() == null) {
			iCant = true;
			// Edo prepei na ginei o elegxo toy ypsous gia na paei dexi or aristera
			parent.addSubLeft(childTree);
		}
		else if(parent.right() == null) {
			iCant = true;
			// Edo prepei na ginei o elegxo toy ypsous gia na paei dexi or aristera
			parent.addSubRight(childTree);
		}
		if(!iCant) { // An loipon exei kanei kai t adyo toy paidia error
			// Ftiaxe mia class ChildError kai kane throw new ChildError
			System.out.println("No more Childs");
			return;
		}
	}
	

    public void printAll() {
    	for (BinaryTree<Human> tree : this.familyTree) {
    		Human h = tree.element();
    		System.out.println(h);
    	}
    }
	
	public BinaryTree findByName(String brand) {
		for(BinaryTree<Human> inh : familyTree) {
			Human h = inh.element();
			if(h.getName().equals(brand)){
				return inh;
			}
		}
		return null;
	}
	
	public boolean exists(String brand) {
	    return findByName(brand)!=null;	
	}
	
}
