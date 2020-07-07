package lambda;

public class CheckPula implements Check{

	public boolean test(Animal a) {
		
		return a.isPula();
	}

	@Override
	public String data(Animal a) {
		
		return a.getData();
	}

}
