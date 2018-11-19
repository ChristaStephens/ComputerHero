package computer.ComputerHero.model;

import java.util.List;

public class Response {
	//respone is hall of fame
	
	private List <Complete> complete;
	private List <Tiny> tiny;
	
	public Response() {
		super();
		
	}

	public Response(List<Complete> complete, List<Tiny> tiny) {
		super();
		this.complete = complete;
		this.tiny = tiny;
	}

	public List<Complete> getComplete() {
		return complete;
	}

	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}

	public List<Tiny> getTiny() {
		return tiny;
	}

	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}

	@Override
	public String toString() {
		return "Response [complete=" + complete + ", tiny=" + tiny + "]";
	}

	
}
