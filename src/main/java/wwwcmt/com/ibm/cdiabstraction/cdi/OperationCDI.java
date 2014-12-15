package wwwcmt.com.ibm.cdiabstraction.cdi;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@SuppressWarnings("unchecked")
public class OperationCDI {
	
	@Produces
	public Operation getOperation(InjectionPoint injectionPoint){
		Class<Operation> theClass = (Class<Operation>) injectionPoint.getClass();
		Operation op = null;
		try {
			op = (Operation) theClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return op;
	}
}
