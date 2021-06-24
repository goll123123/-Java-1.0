package Dao;
//
import Database.Account;
import entity.User;
import myException.LoginException;
import myException.RegisterException;
import utils.Staus;

public class AccountDao {
    private Account account;

    public AccountDao(Account account) {
        this.account = account;
    }

    public User selectById(String id) throws LoginException {
      User user =  account.account.get(id);
      if (user == null){
          throw new LoginException(Staus.Login_Lost.getMessage());
      }else {
          return user;
      }
    }

    public void insert(User user)throws RegisterException{

     if (account.account.containsKey(user.getId())){
         throw new RegisterException(Staus.Account_Exist.getMessage());
     }
        account.account.put(user.getId(),user);
    }
}
