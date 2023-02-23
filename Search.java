
public class Search extends JFrame{
	
	
	
	public void searchArtist(String line, currSearch){
		if(line != null){
			String key;
			String [] artistName = line.split(" ");
			for(int i = 0; i < artistName.length(); i++){
					key = artistName[i];
					if(key == currSearch)
						query(key);						
			}
		}
	}


	public void query(String key){
			//search through popular searches and find relations and return based off a match-rate
		
		
		
		
		
	}



	public static void main(String [] args) throws EchoNestException{
		searchArtist(args);
	}


}