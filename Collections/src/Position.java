
public class Position {

	//Attributes defined
	int x;
	int y;
	
	//Constructor defined
	Position(int x, int y){
		this.x = x;
		this.y = y;
	}

	//hashCode method overwritten to return a result that incorporates both the 'x' and 'y' variables
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	//equals method overwritten to compare values of the fields instead of their memory locations
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}	
	
	
}