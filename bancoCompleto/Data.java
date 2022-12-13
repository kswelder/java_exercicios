import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Data {
	private String data = "";
	
	Data () {
		DateFormat df = new SimpleDateFormat();
		Date dt = new Date();
		this.data =  df.format(dt);
	}
	public String getData() {
		return this.data;
	}
}
