public class ListaSimple{
	Node top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[K]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

}













