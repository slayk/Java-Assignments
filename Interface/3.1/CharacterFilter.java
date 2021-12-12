
public class CharacterFilter implements StringFilter {

	public void alphanumericFilter(String characters) {
		// TODO Auto-generated method stub
		String characterOnly = characters.replaceAll("[^A-Za-z]", "");
		System.out.println(characterOnly);
	}

}
