package MyFirstProject;

import javax.persistence.Embedded;

public class contact {
	private int srNo;
	private String name, contactNo,eMail;
	@Embedded
    private ContenctType contenctType;
	
}
