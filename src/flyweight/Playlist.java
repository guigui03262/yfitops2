package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements MyString{
	private List<MyString> myStrings;
	
	public Playlist() {
		this.myStrings = new ArrayList<MyString>();
	}
	
	public void addPlaylist(MyString pl ) {
		myStrings.add(pl);
	}
	
	public String getString() {
		String string = new String();
		for (MyString pl : myStrings)
			string = string.concat(pl.getString() + " \n");
		return string;
	}

}
