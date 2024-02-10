package pr;

public class User {
    public boolean isValidUserCredentials(String sUserName,String sUserPAssword)
    {
        if(sUserName.equals("asselok")&& sUserPAssword.equals("123"))
        {
            return true;
        }
        return false;
    }
}
