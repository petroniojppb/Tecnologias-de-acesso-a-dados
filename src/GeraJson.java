import java.io.FileWriter;

import com.google.gson.Gson;

public class GeraJson {
	
	public static void main(String[] args) {
		Cerveja skol = new Cerveja();
		skol.setAno(2019);
		skol.setMalte("Puro malte");
		skol.setMarca("Skol");
		skol.setNome("Skol Ice Blue Red");
		
		
		Gson g = new Gson();
		String json = g.toJson(skol);
		
		System.out.println(json);
		
		try {
		FileWriter fw =
				new FileWriter("CervejaTeste.json");
		
		fw.write(json);
		fw.close();
		
		
		}catch (Exception e) {
	}

	}
}
