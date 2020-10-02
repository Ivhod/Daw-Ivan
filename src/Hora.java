
public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long mill, hor, min, seg, restseg, restmin, resthor;
		
		
		mill =System.currentTimeMillis();
		seg = mill / 1000;
		restseg = seg % 60;
		min= seg / 60;
		restmin = min % 60;
		hor= min / 60;
		resthor = hor % 24;
		
		System.out.println( " Son las " + (resthor + 2) + " " + restmin + " " + restseg);

	}

}
