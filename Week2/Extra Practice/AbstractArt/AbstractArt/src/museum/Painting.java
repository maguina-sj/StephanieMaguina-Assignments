package museum;
import Art;

public class Painting extends Art {
	
	private String paintType;

	
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		
	}

}
