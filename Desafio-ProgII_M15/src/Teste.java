
public class Teste {
	public static void main(String[] args) {
		GeneralTree raiz = new GeneralTree ('D');
		GeneralTree t2 = new GeneralTree ('E');
		GeneralTree t3 = new GeneralTree ('G'); 
		raiz.attachSubtree(t2);
		raiz.attachSubtree(t3);
		t2.attachSubtree(new GeneralTree ('F')); 
		t3.attachSubtree(new GeneralTree ('H')); 
		t3.attachSubtree(new GeneralTree ('J')); 
		t3.attachSubtree(new GeneralTree ('M')); 
		t3.getSubtree(0).attachSubtree(new GeneralTree ('I')); 
		t3.getSubtree(1).attachSubtree(new GeneralTree ('K'));
		t3.getSubtree(1).attachSubtree(new GeneralTree ('L'));
		System.out.println(raiz.countNodes(raiz));
		
	}
}
