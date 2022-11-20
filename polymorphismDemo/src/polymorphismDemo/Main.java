package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//polymorphisim çok biçimlilik demektir
		//referans tiplerin inheritance aracılığıyla 
		//birbirinin referansını tutmasıdır
//		
//		  // BaseLogger[] loggers= new BaseLogger[] {new FileLogger(), new
//		  EmailLogger(), new DatabaseLogger(), new ConsoleLogger()}; // //
//		  for(BaseLogger logger:loggers) { // logger.Log("Log mesajı"); // }
//			
	CustomerManager customerManager= new CustomerManager(new FileLogger());
	customerManager.add();
	}
}
