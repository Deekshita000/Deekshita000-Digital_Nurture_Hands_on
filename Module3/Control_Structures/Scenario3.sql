DECLARE
   CURSOR c_loans IS
      SELECT c.Name, l.LoanID, l.EndDate
      FROM Customers c
      JOIN Loans l ON c.CustomerID = l.CustomerID
      WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
   FOR rec IN c_loans LOOP
      DBMS_OUTPUT.PUT_LINE(
      'Reminder: Dear ' || rec.Name ||
      ', your loan ' || rec.LoanID ||
      ' is due on ' || rec.EndDate);
   END LOOP;
END;
/