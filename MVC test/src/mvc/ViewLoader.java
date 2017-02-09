package mvc;

import java.io.IOException;
import javafx.fxml.FXMLLoader;

final class ViewLoader<T, U> {
	private T fxmlLayout = null;
	private U fxmlController = null;

	public ViewLoader(String fxml) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
			fxmlLayout = fxmlLoader.load();
			fxmlController = fxmlLoader.getController();
		} catch (IOException ex) {
			System.out.println("wyjatek");
		}
		catch (Exception ex) {
			System.out.println("exception");
		}
	}

	public T getLayout() {
		return fxmlLayout;
	}

	public U getController() {
		return fxmlController;
	}
}
