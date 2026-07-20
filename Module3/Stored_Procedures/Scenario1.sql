CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
   UPDATE Accounts
   SET Balance = Balance + (Balance * 1/100)
   WHERE AccountType = 'Savings';

   COMMIT;
   DBMS_OUTPUT.PUT_LINE('Monthly Interest Processed');
END;
/