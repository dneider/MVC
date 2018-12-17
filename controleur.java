package nbPremier;

public class controleur {
	public boolean testNbPremier(int n) {
		Model model = new Model();
		
		if(model.premier(n) == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public float testY(float i){
		Model model = new Model();
		return model.reelX(i);
		
	}


}

