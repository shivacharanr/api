package data;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "{status:OK,place_id:7729f0af09c9ad9bfa44965685c3d14c,scope:APP,reference:380eb48d6db863b08cdf0c2a180e985b380eb48d6db863b08cdf0c2a180e985b,id:380eb48d6db863b08cdf0c2a180e985b}";
		
		System.out.println(str.substring(str.lastIndexOf("place_id:"), str.indexOf(",", str.lastIndexOf("place_id:"))));
		System.out.println("shiva");

	}

}
