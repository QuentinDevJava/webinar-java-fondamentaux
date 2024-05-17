import java.io.IOException;

public class Application {

    private final String path = ".\\WebinarP2\\src\\resources\\";

    public void readFile()  {
        //Remplacer le nom du fichier à lire ici
        String fileToRead = "longText";
        String completePath = path + fileToRead;

        BufferedReader reader = new BufferedReader(fileReader);
		try{	
			// une fonction à essayer pouvant générer une erreur
			String line = reader.readLine();
			
			while (line != null) {
				// affichage de la ligne
				System.out.println(line);
				// lecture de la prochaine ligne
				line = reader.readLine();
			}
			reader.close();
        }catch(Exception e){
            System.out.println("Erreur Lors de la lecture du fichier .txt");
        };

    public static void main(String[] args) throws IOException {
        Application application = new Application();
        application.readFile();
    }
}
