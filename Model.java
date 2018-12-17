package nbPremier;

public class Model {
	public boolean premier(int n)
    {
        if(n<=1) return false;
        for(int i = 2;i*i<=n;i++)
        {
            if (n%i ==0)
            return false;
            i++;
        }
        return true;
    }
	
	public float reelX(float i){
		float y ;
		
		y=i*i;
		
		return y;
		
	}
}
