import Dao.AccountDao;
import Dao.MenuDao;
import Database.Account;
import Database.Menu;
import Service.AccountService;
import Service.MenuService;
import View.StartPanel;
import entity.User;

public class Start {
    Menu menu;
    Account account;
    MenuDao menuDao;
    AccountDao accountDao;
    MenuService menuService;
    AccountService accountService;
    StartPanel startPanel;

    public Start() {
        this.menu = new Menu();
        this.account = new Account();
        this.menuDao = new MenuDao(this.menu);
        this.accountDao = new AccountDao(this.account);
        this.menuService = new MenuService(this.menuDao);
        this.accountService = new AccountService(this.accountDao);
        this.startPanel = new StartPanel(this.accountService,this.menuService);
    }

    public static void main(String[] args) {
       Start start = new Start();
       start.startPanel.startPanel();
    }
}
