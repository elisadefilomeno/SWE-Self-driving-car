package Vehicle;

public class Route {
	private Position startingPoint;
	private Position endPoint;

	public Route(Position startingPoint, Position endPoint) {
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
	}

	public Position getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(Position startingPoint) {
		this.startingPoint = startingPoint;
	}

	public Position getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Position endPoint) {
		this.endPoint = endPoint;
	}

}
