package jsf.member;

public class memberBean {

    String firstName = null;
	String lastName = null;
	String userID = null;
	String userPW = null;
	String sex = null;
	String email = null;
	String zipCode = null;
	String address = null;
	String memo = null;

    public memberBean() {
    }


    public void setFirstName(String user_name) {
        firstName = user_name;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String user_name) {
        lastName = user_name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setUserID(String user_name) {
        userID = user_name;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserPW(String user_name) {
        userPW = user_name;
    }


    public String getUserPW() {
        return userID;
    }

    public void setSex(String user_name) {
        sex = user_name;
    }


    public String getSex() {
        return sex;
    }

    public void setEmail(String user_name) {
        email = user_name;
    }


    public String getEmail() {
        return email;
    }

    public void setZipCode(String user_name) {
        zipCode = user_name;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setAddress(String user_name) {
        address = user_name;
    }


    public String getAddress() {
        return address;
    }

    public void setMemo(String user_name) {
        memo = user_name;
    }


    public String getMemo() {
        return memo;
    }

	public void resetAction(){
		setUserID("");
		setUserPW("");
		setFirstName("");
		setLastName("");
		setSex("");
		setEmail("");
		setZipCode("");
		setAddress("");
		setMemo("");
	}

}
