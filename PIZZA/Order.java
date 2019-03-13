public class Order{
	private Pizza[] order;

	public Order(Pizza[] threeForOne){
		this.order = threeForOne;
	}

	public void printOrder(){
		System.out.println("3-4-1 PIZZA MADNESS\n###################");
		for(int i = 0; i<this.order.length;i++){
			if(this.order[i].getTopping() == "Broccoli"){
				System.out.println("Are you sure you want " + this.order[i].getTopping() + " on your " + this.order[i].getBase() + " base?");
			}

			else{
				System.out.println("You ordered a " + this.order[i].getTopping() + " on a " + this.order[i].getBase() + " base.");
			}
		}
	}
}
