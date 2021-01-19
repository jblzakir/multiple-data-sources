package guru.springframework.multipledatasources.model.cardholder;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "t24rpt_account_information")
public class AccountInfo {
	private String ACCOUNT_NO;
	private String	ACCOUNT_STATUS;
	private String ACCOUNT_TITLE;
	private String ACCOUNT_TYPE;
	private String BRANCH_NAME;
	private String EMAIL;
	private String GENDER;
	private String MOBILE_NO;
}
