package com.solarsystem.solar_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolarManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolarManagementSystemApplication.class, args);


	}


////	@Override
////	public void start(Stage stage) throws Exception {
////		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main-view.fxml"));
////		fxmlLoader.setControllerFactory(springContext::getBean);  // Inject Spring Beans
////		Scene scene = new Scene(fxmlLoader.load());
////		stage.setScene(scene);
////		stage.setTitle("Solar Management System");
////		stage.show();
////		primaryStage = stage;
////	}
////
////	@Override
////	public void stop() throws Exception {
////		springContext.close();
//	}



