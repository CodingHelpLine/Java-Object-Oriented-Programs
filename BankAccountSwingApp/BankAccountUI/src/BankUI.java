import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Bank UI using Java Swing
 * 
 * @author Programmer
 */
public class BankUI extends JFrame implements ActionListener {
    
    // Components
    // buttons: withdraw, deposit, calculate interest, apply interest
    // exit, create Account
    // Check Balance
    // lables: account number, balance, amount (withdraw and deposit)
    // text fields: account number, amount. 
    
    // buttons
    private JButton btnTransaction;
    private JButton btnCalcInterest;
    private JButton btnApplyInterest;
    private JButton btnExit; 
    private JButton btnCreate; 
    private JButton btnBalance;
    
    // Labels
    private JLabel lblAccountNumber;
    private JLabel lblBalance;
    private JLabel lblAmount; 
    private JLabel lblMessage; // convey message to user
    
    // Text Fields
    private JTextField txtAccountNumber;
    private JTextField txtAmount; 
    private JTextField txtBalance; // for account balance
    
    // Transaction buttons
    private JRadioButton radWithdraw;
    private JRadioButton radDeposit; 
    
    // Account Create Buttons
    private JRadioButton radChecking;
    private JRadioButton radSavings; 
    
    // button Group
    private ButtonGroup transGroup;
    private ButtonGroup accountGroup;
    
    // JPanels 
    private JPanel inputPanel;  // for inputs
    private JPanel commandPanel; // for buttons
    
    // Bank
    private Bank bank;
    
    /**
     * Constructor to setup the UI Components. 
     */
    public BankUI() {
        
        this.bank = new Bank();
        
        // Setup Frame Features
        this.setTitle("Bank Account UI");
        this.setSize(600, 340);
        this.setPreferredSize(new Dimension(600, 340));
        this.setLocation(200, 300); // screen location
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setup Inputs
        setupInputs();
        
        // Setup commands
        setupCommands();
        
        // pack UI
        pack();        
    }
    
    /**
     * Setup Input components
     */
    private void setupInputs() {
        
        // JPanel
        this.inputPanel = new JPanel();
        this.inputPanel.setPreferredSize(new Dimension(560, 150));
        this.inputPanel.setBorder(BorderFactory.createTitledBorder("Inputs"));
        
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        top.setPreferredSize(new Dimension(540, 40));
        this.inputPanel.add(top);
        
        // Account Number
        this.lblAccountNumber = new JLabel("Account Number:");
        this.lblAccountNumber.setPreferredSize(new Dimension(120, 30));
        this.inputPanel.add(this.lblAccountNumber);
        
        this.txtAccountNumber = new JTextField();
        this.txtAccountNumber.setPreferredSize(new Dimension(130, 30));
        this.inputPanel.add(this.txtAccountNumber);
        
        // Account Balance
        this.lblBalance = new JLabel("Account Balance:");
        this.lblBalance.setPreferredSize(new Dimension(120, 30));
        this.inputPanel.add(this.lblBalance);
        
        this.txtBalance = new JTextField();
        this.txtBalance.setEditable(false); // no balance manipulation allowed
        this.txtBalance.setPreferredSize(new Dimension(130, 30));
        this.inputPanel.add(this.txtBalance);
        
        // two radio buttons for withdraw / deposit
        this.radWithdraw = new JRadioButton("Withdraw");
        this.radWithdraw.setPreferredSize(new Dimension(120, 30));
        this.inputPanel.add(this.radWithdraw);
        this.radWithdraw.setSelected(true);
        
        this.radDeposit = new JRadioButton("Deposit");
        this.radDeposit.setPreferredSize(new Dimension(130, 30));
        this.inputPanel.add(this.radDeposit);
        
        this.transGroup = new ButtonGroup();
        this.transGroup.add(this.radDeposit);
        this.transGroup.add(this.radWithdraw);
        
        // Transaction Amount
        this.lblAmount = new JLabel("Transaction Amount:");
        this.lblAmount.setPreferredSize(new Dimension(120, 30));
        this.inputPanel.add(this.lblAmount);
        
        this.txtAmount = new JTextField();
        this.txtAmount.setPreferredSize(new Dimension(130, 30));
        this.inputPanel.add(this.txtAmount);
        
        JLabel lblType = new JLabel("Select Account Type");
        top.add(lblType);
        
        // two radio buttons for account type
        this.radChecking = new JRadioButton("Checking");
        this.radChecking.setPreferredSize(new Dimension(120, 30));
        top.add(this.radChecking);
        this.radChecking.setSelected(true);
        
        this.radSavings = new JRadioButton("Savings");
        this.radSavings.setPreferredSize(new Dimension(130, 30));
        top.add(this.radSavings);
        
        this.transGroup = new ButtonGroup();
        this.transGroup.add(this.radChecking);
        this.transGroup.add(this.radSavings);
        
        
        // add to frame
        this.add(this.inputPanel);
        
        
    }
    
    /**
     * Add Command Buttons to the UI
     */
    private void setupCommands() {
        // JPanel
        this.commandPanel = new JPanel();
        this.commandPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        
        this.commandPanel.setPreferredSize(new Dimension(560, 120));
        this.commandPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        // Create button
        this.btnCreate = new JButton("Create"); 
        this.btnCreate.setPreferredSize(new Dimension(140, 30));
        this.btnCreate.addActionListener(this);
        this.commandPanel.add(this.btnCreate);
        
        // Balance button
        this.btnBalance = new JButton("Balance"); 
        this.btnBalance.setPreferredSize(new Dimension(140, 30));
        this.btnBalance.addActionListener(this);
        this.commandPanel.add(this.btnBalance);
        
        // Withdraw button
        this.btnTransaction = new JButton("Do Transaction"); 
        this.btnTransaction.setPreferredSize(new Dimension(140, 30));
        this.btnTransaction.addActionListener(this);
        this.commandPanel.add(this.btnTransaction);
        
        // Calc Interest button
        this.btnCalcInterest = new JButton("Show Interest"); 
        this.btnCalcInterest.setPreferredSize(new Dimension(140, 30));
        this.btnCalcInterest.addActionListener(this);
        this.commandPanel.add(this.btnCalcInterest);
        
        // Apply Interest button
        this.btnApplyInterest = new JButton("Apply Interest"); 
        this.btnApplyInterest.setPreferredSize(new Dimension(140, 30));
        this.btnApplyInterest.addActionListener(this);
        this.commandPanel.add(this.btnApplyInterest);
        
        // Exit button
        this.btnExit = new JButton("Exit"); 
        this.btnExit.setPreferredSize(new Dimension(140, 30));
        this.btnExit.addActionListener(this);
        this.commandPanel.add(this.btnExit);
        
        this.add(this.commandPanel);
    }
    
    @Override
    /**
     * Function to handle Click Events
     * 
     * @param event 
     */
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        
        if(src.equals(this.btnCreate)) {
            this.createAccount();
        } else if(src.equals(this.btnExit)) {
            System.exit(0);
        } else if(src.equals(this.btnBalance)) {
            this.checkBalance();
        } else if(src.equals(this.btnTransaction)) {
            doTransaction();
        } else if(src.equals(this.btnCalcInterest)) {
            this.calcInterest();
        } else if(src.equals(this.btnApplyInterest)) {
            applyInterest();
        }
    }
    
    
    /**
     * Apply interest will add interest earned to the account. Only for 
     * Savings account
     */
    private void applyInterest() {
       try {
            // account number
            int accountNumber = Integer.parseInt(this.txtAccountNumber.getText());
            
            // get account
            Account account = bank.getAccount(accountNumber);
            
            // check its savings account
            if(account instanceof SavingsAccount) {
                double interest = ((SavingsAccount) account).calcInterest();
                bank.deposit(account.getAccountNumber(), interest);
                showMessage("Interest has been added");
                // display balance
                this.txtBalance.setText(String.format("$%.2f", account.getBalance()));
            } else {
                showError("This is not a Savings account!");
            }
        } catch(Exception e) {
            showError(e.getMessage() + "\n" + e.toString());
        } 
    }
    
    /**
     * Show Interest Earned
     */
    private void calcInterest() {
        try {
            // account number
            int accountNumber = Integer.parseInt(this.txtAccountNumber.getText());
            
            // get account
            Account account = bank.getAccount(accountNumber);
            
            // check its savings account
            if(account instanceof SavingsAccount) {
                double interest = ((SavingsAccount) account).calcInterest();
                showMessage(String.format("Interest Earned: $%.2f", interest));
            } else {
                showError("This is not a Savings account!");
            }
        } catch(Exception e) {
            showError(e.getMessage() + "\n" + e.toString());
        }
    }

    /**
     * Do the Transaction of Withdraw and Deposit
     */
    private void doTransaction() {
        // parse amount
        try {
            double amount = Double.parseDouble(this.txtAmount.getText());
            int accountNumber = Integer.parseInt(this.txtAccountNumber.getText());
            
            /*
            // account
            Account account = bank.getAccount(accountNumber);
            
            if(account == null) {
                showError("No account exist with Account Number: " + accountNumber);
                return;
            }*/
            
            if(this.radDeposit.isSelected()) {
               if(bank.deposit(accountNumber, amount)) {
                   showMessage("Transaction is Successful!");
                   txtAmount.setText("");
                   double balance = bank.getAccount(accountNumber).getBalance();
                   txtBalance.setText(String.format("$%.2f", balance));
               } else {
                    showError("Transaction Failed! Try again");
               } 
            } else {
                if(bank.withdraw(accountNumber, amount)) {
                   showMessage("Transaction is Successful!");
                   txtAmount.setText("");
                   double balance = bank.getAccount(accountNumber).getBalance();
                   txtBalance.setText(String.format("$%.2f", balance));
               } else {
                    showError("Transaction Failed! Try again");
               } 
            }
            
        } catch(Exception e) {
            showError(e.getMessage() + "\n" +e.toString());
        }
        
    }
    
    /**
     * Function to check the Account Balance
     */
    private void checkBalance() {
        try {
            // parse account Number
            int accountNumber = Integer.parseInt(this.txtAccountNumber.getText());
            Account account = bank.getAccount(accountNumber);
            
            if(account == null) {
                showError("No account exist with Account Number: " + accountNumber);
            }
            
            this.txtBalance.setText(String.format("$%.2f", account.getBalance()));
        } catch(Exception e) {
            showError(e.getMessage() + "\n" + e.toString());
        }
    }
    
    /**
     * Function to create a Bank account
     */
    private void createAccount() {
        Account account = null; 
        
        if(this.radChecking.isSelected()) {
            account = new CheckingAccount(Bank.getNextAccountNumber(),
             Bank.getFee());
        } else {
            // Savings
            account = new SavingsAccount(Bank.getNextAccountNumber(), 
                Bank.getIR());
        }
        
        bank.addAccount(account);
        showMessage("Your account has been created\nAccount Number: " + account.getAccountNumber());
    }
    
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Informaion", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Informaion", JOptionPane.ERROR_MESSAGE);
    }
    
}
