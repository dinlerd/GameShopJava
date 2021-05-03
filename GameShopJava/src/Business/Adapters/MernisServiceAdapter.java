package Business.Adapters;


import java.util.Locale;

import Business.Abstract.UserCheckService;
import Core.Entities.Concrete.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap client = new KPSPublicSoapProxy();

		boolean result = false;
		
		try {
			System.out.println("Identity check is progressing...");
			
			System.out.println("TC id: " + Long.parseLong(user.getNationalityId()) 
			+ "\nFirst Name: " + user.getFirstName().toUpperCase(new Locale("tr","TR"))
			+ "\nLast Name: " + user.getLastName().toUpperCase(new Locale("tr","TR"))
			+ "\nBirth Year: " + user.getDateOfBirth().getYear());
			
			result = client.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalityId()) , 
					user.getFirstName().toUpperCase(new Locale("tr","TR")), 
					user.getLastName().toUpperCase(new Locale("tr","TR")), 
					user.getDateOfBirth().getYear()
					);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
		return result;
	}
	
}
