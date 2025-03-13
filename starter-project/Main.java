import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.CheckingService;
import service.CreditService;

public class Main {

    public static void main(String[] args) {

        AccountRepository repo = new AccountRepository(); 
        CheckingService checkingService = new CheckingService(repo); 
        CreditService creditService = new CreditService(repo); 

        
        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
            new Checking("A1234B", new BigDecimal("500.00")),
            new Checking("E3456F", new BigDecimal("300.50")),
            new Checking("I5678J", new BigDecimal("100.25")),
            new Credit("A1534B", new BigDecimal("0.50")),
            new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> {
            if(account instanceof Checking){
              checkingService.createAccount((Checking)account); 
            }else{
                creditService.createAccount((Credit)account);
            }
            repo.createAccount(account);
        }); 
        //creating a foreach 


        Checking checking = (Checking)repo.retrieveAccount("A1234B"); 
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repo.updateAccount(checking);

        
        System.out.println();
    }


}