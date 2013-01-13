/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



// Fig. 14.6: AccountRecord.java
// Uma classe que representa um registro das informações.

public class AccountRecord
{
   private int account;
   private String firstName;
   private String lastName;
   private double balance;

   // construtor sem argumentos chama outro construtor com valores padrão
   public AccountRecord()
   {
      this( 0, "", "", 0.0 ); // chama o construtor com quatro argumentos
   } // fim do construtor de AccountRecord sem argumentos

   // inicializa um registro
   public AccountRecord( int acct, String first, String last, double bal )
   {
      setAccount( acct );
      setFirstName( first );
      setLastName( last );
      setBalance( bal );
   } // fim do construtor de AccountRecord com quatro argumentos

   // configura o número de conta
   public void setAccount( int acct )
   {
      account = acct;
   } // fim do método setAccount

   // obtém número de conta
   public int getAccount()
   {
      return account;
   } // fim do método getAccount

   // configura o nome
   public void setFirstName( String first )
   {
      firstName = first;
   } // fim do método setFirstName

   // obtém o primeiro nome
   public String getFirstName()
   {
      return firstName;
   } // fim do método getFirstName

   // configura o sobrenome
   public void setLastName( String last )
   {
      lastName = last;
   } // fim do método setLastName

   // obtém o ultimo nome
   public String getLastName()
   {
      return lastName;
   } // fim do método getLastName

   // configura saldo
   public void setBalance( double bal )
   {
      balance = bal;
   } // fim do método setBalance

   // obtém saldo
   public double getBalance()
   {
      return balance;
   } // fim do método getBalance
} // fim da classe AccountRecord